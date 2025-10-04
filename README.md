# Codelabs for Programming/CS Projects in College

This repository contains the coding outputs for different computer programming
course subjects in college, a la CS50(x).

## Setting up

### With GitHub Codespaces

If you prefer not to wrestle with setting up Nix (or installing NixOS in that matter),
you can utilize GitHub Codespaces (or another cloud dev environment service that
supports the Dev Containers configuration standard).

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/andreijirohdev-labs/studentops-codelab)

### With Nix locally

Make sure Nix and `direnv` are installed on your machine, specifically you must
have both `nix-command` and `flakes` experimental features enabled on your
`~/.config/nix/nix.conf` or `/etc/nix/nix.conf`, otherwise you need to add
`--experimental-features 'nix-command flakes` on your flags.

Once everything is set up, allow direnv to source out the `.envrc` file at the
project root by running `direnv allow`. It will take a while to get the needed
dependencies, especially if you don't have admin permissions to add your Linux
user account as a trsuted user for the daemon (since it utilizes Cachix caches).

## Code mirrors

Canonically at <https://gitlab.com/andreijiroh-dev/labs/studentops-codelab>,
with mirrors at:

* GitHub: <https://github.com/andreijirohdev-labs/studentops-codelab>

## Package namespace

**For Java and Kotlin code**: Code snippets in this repository uses the
`dev.andreijiroh.studentops.projects` namespace following the Java packaging
convention (also used on Android app IDs).

## License

MIT
