{ pkgs, lib, ... }: {
  # Allow local config imports
  imports = lib.optionals (builtins.pathExists ./dev.local.nix) [
    ./dev.local.nix
  ];

  # Stick with unstable channel as usual
  channel = "unstable";

  packages = with pkgs; [
    gitFull
    javaPackages.compiler.openjdk25
    github-cli
    glab
    nodejs_24
    npm-check-updates
    deno
    github-copilot-cli
    gemini-cli
    nano
  ];

  idx = {
    extensions = [
      "jnoortheen.nix-ide"
      "mads-hartmann.bash-ide-vscode"
      "bbenoist.nix"
      "vscjava.vscode-java-debug"
      "redhat.java"
      "vscjava.vscode-java-test"
      "vscjava.vscode-maven"
      "vscjava.vscode-gradle"
      "vscjava.vscode-java-dependency"
    ];
    workspace = {
      onCreate = {
      };
      onStart = {
      };
    };
  };

  services = {
    docker = {
      enable = true;
    };
  };
}