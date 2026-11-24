# Java Programming Assignment

A learning repository for module-wise and week-wise Java programming assignments. This project follows a small, focused GitHub workflow for documenting and reviewing changes.

## Repository structure

```text
README.md
.gitignore
src/         # Java source files
```

Add each module or exercise under an appropriately named package or folder under `src/`.

## GitHub workflow

Use a feature branch and pull request for every change:

```bash
git switch main
git pull origin main
git switch -c feature/short-description
# Make a focused change
git add <files>
git commit -m "Add Java assignment documentation"
git push -u origin feature/short-description
```

Open a pull request on GitHub, request review, pass checks, and merge the approved branch into `main`. After merging, update local `main`:

```bash
git switch main
git pull origin main
git branch -d feature/short-description
```

## Issues and pull requests

A **GitHub issue** tracks a task, bug, question, or feature request. It provides a place to describe the required outcome, acceptance criteria, and discussion. Link an issue from a pull request with text such as `Closes #1` so GitHub closes it after merge.

A **pull request (PR)** proposes changes from one branch into another. It shows the diff, discussion, checks, reviewers, and merge status. A PR should be small and easy to review, with a clear title and summary.

This documentation change was delivered through the feature branch `feature/github-collaboration-best-practices-week1-24` and pull request:

- Pull request: https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay/pull/2

## Java Git best practices

- Make small, focused commits that contain one logical change.
- Write clear commit messages, such as `Add Java project documentation` rather than `Update files`.
- Never commit passwords, API keys, tokens, private keys, or local configuration secrets.
- Do not commit compiled output or editor metadata. Keep `*.class`, `target/`, `build/`, `out/`, IDE folders, logs, and temporary files ignored.
- Keep source code, tests, and build configuration organized and reviewable.
- Pull the latest `main` before creating a branch or resolving integration changes.
- Use branches for work, open pull requests for review, and merge only after checks and review pass.
- Add or update tests with behavior changes and run them before pushing.
- Avoid force-pushing shared branches; use it only when team policy permits, and never rewrite another contributor's work unexpectedly.

## Java setup

Compile and run a Java source file from the repository root, for example:

```bash
javac src/HelloWorld.java
java -cp src HelloWorld
```

Compiled `.class` files are intentionally excluded by `.gitignore`.
