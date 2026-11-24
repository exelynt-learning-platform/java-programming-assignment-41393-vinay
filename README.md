# Understanding Version Control, Git, and GitHub

## What is version control?

Version control is a way to record and manage changes to files over time. It keeps a history of a project, so you can see what changed, when it changed, and who made the change. You can also compare versions or restore an earlier one if a change causes a problem. Version control is useful for source code, but it can also help manage documents and other project files.

## Why developers use Git

Git is a popular version control system. Developers use it to:

- Keep a reliable history of their work and understand how a project evolved.
- Work on features or fixes separately in branches without disrupting the stable version.
- Combine contributions from multiple people and review changes before integrating them.
- Experiment safely, because changes can be compared, committed, or discarded.
- Restore earlier versions and investigate when or why a bug was introduced.

A **commit** is a saved snapshot of selected changes, usually accompanied by a short message describing the work. Git stores these snapshots and the relationships between them, which makes it possible to move between versions and collaborate on changes.

## Common problems Git helps solve

Without version control, teams may pass files around with confusing names such as `final`, `final-new`, and `final-latest`. It can be difficult to tell which copy is current, identify what changed, or recover work that was accidentally overwritten. When several people edit the same project, their changes can also conflict or be lost.

Git addresses these problems by maintaining a shared history of changes, supporting parallel work in branches, showing differences between versions, and helping contributors combine their work. If two edits overlap, Git reports a merge conflict so the contributors can decide how to reconcile them rather than silently replacing one person's work.

## Git and GitHub: what is the difference?

**Git** is the version control software. It can track changes in a repository on a local computer and can work without an internet connection.

**GitHub** is an online service for hosting Git repositories. It provides a place to share repositories and adds collaboration features such as pull requests, code review, issue tracking, and project discussions.

In short, Git manages the version history; GitHub hosts Git repositories and makes it easier for people to collaborate around them. Git can be used without GitHub, and GitHub uses Git to manage repository history.

## Centralized and distributed version control

In a **centralized version control system**, the main history is kept on a central server. Contributors typically connect to that server to get the latest files and submit changes. This provides one central source of truth, but work can depend on server access, and the server can become a single point of failure.

In a **distributed version control system**, each contributor has a local copy of the repository, including its history. Git is distributed: you can inspect history, create commits, compare versions, and work in branches locally. You can later exchange changes with a remote repository, such as one hosted on GitHub. Having complete local copies supports offline work and provides additional copies of the project history, though teams still need to coordinate how changes are shared and integrated.

## Summary

Version control preserves a project's change history and helps people work safely together. Git is a distributed version control system that records and organizes those changes. GitHub hosts Git repositories and provides collaboration tools. These tools help developers track work, develop changes in parallel, review contributions, resolve conflicts, and recover earlier versions when needed.
