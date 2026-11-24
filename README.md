# Git Installation and Setup — Week 1

**Assignment:** Install Git, verify the installation, configure your global identity, and demonstrate basic Git Bash/Terminal usage.

> **Evidence note:** This guide documents the steps and commands. Installation, configuration, and screenshots must be captured on your own computer; this repository cannot verify or fabricate results from your local machine. Replace the screenshot placeholders below with genuine screenshots before submitting.

## 1. Install Git

Download Git from [git-scm.com/downloads](https://git-scm.com/downloads) and install the version for your operating system. On Windows, Git Bash is included with Git for Windows. Accepting the standard installer options is sufficient for this assignment.

After installation, open **Git Bash** (Windows) or a **Terminal** (macOS/Linux).

## 2. Verify Git is installed

Run:

```bash
git --version
```

A successful check prints a version, for example:

```text
git version 2.x.x
```

The exact version depends on the release installed. If the command is not found, complete or repair the installation, reopen the terminal, and run the check again.

## 3. Configure your global name and email

Set these to your own name and the email address you use for GitHub. Do not use the example values literally:

```bash
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```

Verify the saved values:

```bash
git config --global --get user.name
git config --global --get user.email
```

Both commands should print the values you set. These are commit attribution settings; they do not sign you in to GitHub.

## 4. Demonstrate Git Bash/Terminal usage

Run the following commands and observe the output:

```bash
pwd
git --version
git config --global --list
```

`pwd` prints the current directory. The Git commands report the installed version and global configuration. You can also check Git's built-in help:

```bash
git help
```

## 5. Screenshot evidence

Add clear, genuine screenshots from your own computer. Keep the commands and their output visible, and avoid exposing private information or unrelated personal data.

- **Installation:** Screenshot the completed Git installer or Git installation confirmation.
- **Version check:** Screenshot the terminal showing `git --version` and its output.
- **Name and email:** Screenshot the two verification commands and output. If you prefer not to publish your email, redact it in the image while keeping the commands and successful output clear; provide the unredacted evidence privately to your instructor if required.
- **Terminal usage:** Screenshot Git Bash/Terminal with `pwd` and at least one Git command executed.

_Insert screenshots below or link them from an `evidence/` folder in this repository._

### Installation screenshot

_Add genuine screenshot here._

### Version verification screenshot

_Add genuine screenshot here._

### Global name and email verification screenshot

_Add genuine screenshot here._

### Git Bash/Terminal usage screenshot

_Add genuine screenshot here._

## Completion checklist

- [ ] Git installed successfully.
- [ ] `git --version` displays the installed version.
- [ ] Global `user.name` and `user.email` set to my own values and verified.
- [ ] Git Bash/Terminal commands demonstrated.
- [ ] Genuine, readable screenshots and concise explanations added.

## Summary

This assignment covers installing Git, checking that the command-line tool is available, setting global commit attribution, and using Git Bash/Terminal to inspect the environment. The screenshots are required evidence of work performed locally and must be added by the student.
