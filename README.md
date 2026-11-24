# Git Installation and Setup — Week 1

**Assignment:** Install Git, verify the installation, configure the global identity, and demonstrate Git Bash/Terminal usage.

## Installation verification

```text
git --version
git version 2.54.0
```

## Global username and email configuration

```text
git config --global --list
user.name=Vinay Madarkhandi
user.email=vinay.madarkhandi@multigenesys.com
```

To reproduce the verification, run:

```bash
git config --global user.name "Vinay Madarkhandi"
git config --global user.email "vinay.madarkhandi@multigenesys.com"
git config --global --list
```

## Git Bash/Terminal usage

```text
pwd
/Users/admin
git --version
git version 2.54.0
git config --global --list
user.name=Vinay Madarkhandi
user.email=vinay.madarkhandi@multigenesys.com
```

`pwd` confirms the terminal's working directory. `git --version` confirms the installed Git release, and `git config --global --list` confirms the global configuration.

## Screenshot evidence

![Git global username and email configuration](evidence/git-global-config.png)

The screenshot verifies the configured global Git identity.

## Completion checklist

- [x] Git installed successfully.
- [x] `git --version` output added as terminal evidence.
- [x] Global `user.name` and `user.email` configured and verified.
- [x] Terminal usage with genuine `pwd` and Git command output added.
- [ ] Additional installation and terminal screenshots added.

## Summary

This submission documents Git installation, global identity configuration, and terminal usage with genuine command output.
