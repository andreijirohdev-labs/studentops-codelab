<#
  .SYNOPSIS
    Compiles and runs a single Java file, used by .zed/tasks.json as a
    Windows-friendly replacement for the Java extension's built-in
    "Run" task (which hardcodes /bin/sh and fails on Windows).

  .NOTES
    The source root is derived by walking up one directory per package
    segment from the file's own directory, so this works for any
    package/file under this repo without hardcoding paths.
#>
[CmdletBinding()]
param(
    [Parameter(Mandatory = $true)]
    [string]$JavaFile,

    [string]$Package = "",

    [Parameter(Mandatory = $true)]
    [string]$ClassName
)

$ErrorActionPreference = "Stop"

$javaFileResolved = (Resolve-Path -LiteralPath $JavaFile).Path
$sourceRoot = Split-Path -Parent $javaFileResolved

if ($Package) {
    $depth = ($Package -split '\.').Count
    for ($i = 0; $i -lt $depth; $i++) {
        $sourceRoot = Split-Path -Parent $sourceRoot
    }
}

$fqcn = if ($Package) { "$Package.$ClassName" } else { $ClassName }
$buildDir = Join-Path (Split-Path -Parent $sourceRoot) "build"

New-Item -ItemType Directory -Force -Path $buildDir | Out-Null

Write-Host "[compiling] $fqcn"
& javac -d $buildDir -sourcepath $sourceRoot $javaFileResolved
if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

Write-Host "[running] $fqcn"
& java -cp $buildDir $fqcn
exit $LASTEXITCODE
