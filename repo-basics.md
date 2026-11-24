# Git Repository Basics

## Project folder and repository initialization

This assignment is in the `java-programming-assignment-41393-vinay` project folder. The supplied GitHub branch is already part of a Git repository, so it is initialized for this submission. To create and initialize a similar project locally, run:

```bash
mkdir git-basics-project
cd git-basics-project
git init
touch index.txt
git status
```

`git init` creates the repository metadata in the project folder. If you run it in a brand-new folder, Git may call the initial branch `master` or `main`, depending on your configuration.

## What the `.git` folder is

`.git` is the hidden directory Git creates inside the project when a repository is initialized. It stores repository metadata and history, including configuration, references, and objects used to track commits. It is not the project files themselves. Keep it in place: deleting it removes the local repository's history and tracking information. It is normally hidden in file browsers, and it is not shown as a regular project file on GitHub.

## The three Git file states

Git describes file states relative to the repository:

1. **Working directory (modified/untracked):** The file has been created or edited, but the changes have not been staged. A newly created `index.txt` is untracked.
2. **Staging area (staged):** After `git add index.txt`, Git has marked the current contents to be included in the next commit. Staging lets you choose which changes to commit.
3. **Committed (repository):** After `git commit`, the staged snapshot is recorded in the repository's history. Later edits return the file to the modified state until staged again.

A tracked file with no uncommitted changes is often called **clean**; that describes its current condition, rather than a fourth file state.

## `git status` output

The following is a representative `git status` output from the new-folder walkthrough, immediately after creating `index.txt` and before staging it. The exact branch name and wording can differ by Git version and configuration:

```text
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	index.txt

nothing added to commit but untracked files present (use "git add" to track)
```

This reports that `index.txt` is in the working directory but is not staged or committed. Run `git add index.txt` and then `git status` to see it listed under “Changes to be committed.”
