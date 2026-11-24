# Working with remote repositories

This guide shows the usual clone, pull, and push workflow, explains `origin` and `main`, and describes how collaborators keep work coordinated.

> **About the transcript below:** This environment can commit files directly to GitHub, but it does not provide a local shell to run `git clone`, `git pull`, or `git push`. Therefore the terminal excerpts are representative examples, not captured output from a local run. Counts, hashes, usernames, and prompts vary. The repository and branch names are real; replace `<your-branch>` with the branch you create.

## Clone a repository

`git clone` downloads a repository and its history, then creates a working directory. The URL below is this repository's HTTPS clone URL:

```bash
git clone https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git
cd java-programming-assignment-41393-vinay
```

Representative output (object counts vary):

```text
Cloning into 'java-programming-assignment-41393-vinay'...
...
```

A clone normally configures the source remote as `origin` and checks out the remote's default branch, `main` in this repository. Verify the remote and branches with:

```bash
git remote -v
git branch -a
```

Representative output:

```text
origin  https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git (fetch)
origin  https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git (push)
* main
  remotes/origin/HEAD -> origin/main
  remotes/origin/main
```

## Pull updates and make a change

Before starting work, update local `main` from the remote. Then create a separate working branch, make a change, commit it, and push that branch to GitHub:

```bash
git switch main
git pull origin main
git switch -c <your-branch>

# Edit or add your project files, then stage and commit them:
git add <files>
git commit -m "Describe the change"
git push -u origin <your-branch>
```

Representative pull output when there are no new commits:

```text
From https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay
 * branch            main       -> FETCH_HEAD
Already up to date.
```

Representative push output (the new branch and commit hash depend on your work):

```text
Enumerating objects: ...
Counting objects: ...
Writing objects: ...
To https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git
 * [new branch]      <your-branch> -> <your-branch>
branch '<your-branch>' set up to track 'origin/<your-branch>'.
```

`git pull origin main` fetches the latest `main` from `origin` and integrates it into the currently checked-out branch. Run it while on local `main` to update local `main`. If you want to bring the latest `main` into an existing feature branch, first switch to that feature branch, then pull `origin main` (and resolve any conflicts Git reports). After committing and pushing, check synchronization with:

```bash
git status -sb
git fetch origin
git status -sb
```

Representative clean status:

```text
## <your-branch>...origin/<your-branch>
nothing to commit, working tree clean
```

## What `origin` and `main` mean

- **`origin`** is the conventional name Git assigns to the remote repository URL when you clone. It is an alias, not a special server or branch. Use `git remote -v` to see which URL it refers to. A repository can have additional remotes with other names.
- **`main`** is this repository's default branch: a branch name pointing to a line of commits intended to hold the primary, integrated work. It is not a remote name. `origin/main` is your local remote-tracking reference showing the last fetched position of the remote's `main`; `git fetch` or `git pull` updates that reference.
- **Local vs. remote:** a local branch (such as `main`) is in your clone. `origin/main` is a remote-tracking reference. `git push` sends commits to a remote; `git pull` fetches remote commits and integrates them into the current local branch.

## A real-life collaboration workflow

1. A teammate clones the repository once, then fetches/pulls the latest `main` before beginning a task.
2. They create a focused feature branch, such as `feature/login-validation`, and make small, descriptive commits there. They avoid committing directly to shared `main`.
3. They push the feature branch with `git push -u origin feature/login-validation` and open a pull request so teammates can review and discuss the changes.
4. Reviewers run checks, suggest changes, and approve when the work is ready. The author makes requested updates on the same branch and pushes them; the pull request updates automatically.
5. After approval and passing checks, the branch is merged into `main` using the team's chosen merge strategy. The author fetches/pulls the updated `main` and removes the finished local/remote feature branch when appropriate.
6. If `main` changes while work is in progress, the author brings those updates into the feature branch (by merging or rebasing according to team policy), resolves conflicts, runs tests, and pushes the updated branch.

This keeps unfinished work isolated, makes changes reviewable, and helps everyone coordinate against a shared, up-to-date `main` without overwriting each other's work.

## Submission record

This assignment document was committed directly to the GitHub branch `working-with-remote-repositories-week1-24`. That GitHub-side commit is the submitted change. The representative shell transcripts above explain the commands to run in a local clone; they are not claimed as actual local command output.
