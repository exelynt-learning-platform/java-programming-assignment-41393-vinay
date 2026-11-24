# Git Installation and Setup — Week 1

**Assignment:** Install Git, verify the installation, configure the global identity, and demonstrate Git Bash/Terminal usage.

## Installation verification

Git is installed and available from the command line.

```text
git --version
```

## Global username and email configuration

The following global Git configuration values are set:

```text
user.name=Vinay Madarkhandi
user.email=vinay.madarkhandi@multigenesys.com
```

To reproduce the verification, run:

```bash
git config --global user.name "Vinay Madarkhandi"
git config --global user.email "vinay.madarkhandi@multigenesys.com"
git config --global --get user.name
git config --global --get user.email
git config --global --list
```

## Git Bash/Terminal usage

Run and demonstrate the following commands:

```bash
pwd
git --version
git config --global --list
```

`pwd` confirms the terminal's working directory, `git --version` confirms the installed Git release, and `git config --global --list` confirms the global configuration.

## Screenshot evidence

![Git global username and email configuration](evidence/git-global-config.png)

The screenshot verifies the configured global Git identity.

## Completion checklist

- [x] Git installed successfully.
- [ ] `git --version` output added as genuine terminal evidence.
- [x] Global `user.name` and `user.email` configured and verified.
- [ ] Terminal usage with genuine `pwd` and Git command output added.
- [ ] Additional installation and terminal screenshots added.

## Summary

This submission documents Git installation and global configuration. Genuine `git --version`, `pwd`, and terminal output screenshots should be kept alongside the identity evidence for complete grading coverage.
