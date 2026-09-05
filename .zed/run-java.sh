#!/bin/sh
# Compiles and runs a single Java file. Used by .zed/tasks.json as the
# Linux/macOS counterpart to run-java.ps1.
#
# The source root is derived by walking up one directory per package
# segment from the file's own directory, so this works for any
# package/file under this repo without hardcoding paths.
set -e

java_file=$1
package=$2
class_name=$3

if command -v realpath >/dev/null 2>&1; then
    java_file=$(realpath "$java_file")
else
    java_file=$(readlink -f "$java_file")
fi
source_root=$(dirname "$java_file")

if [ -n "$package" ]; then
    old_ifs=$IFS
    IFS='.'
    set -- $package
    IFS=$old_ifs
    for _ in "$@"; do
        source_root=$(dirname "$source_root")
    done
    fqcn="$package.$class_name"
else
    fqcn="$class_name"
fi

build_dir="$(dirname "$source_root")/build"
mkdir -p "$build_dir"

echo "[compiling] $fqcn"
javac -d "$build_dir" -sourcepath "$source_root" "$java_file"

echo "[running] $fqcn"
exec java -cp "$build_dir" "$fqcn"
