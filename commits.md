# Git Commit History

```text
e2630e9 Add a Java example explaining Git status and commits
1c517b5 Add a runnable Git workflow demo
517b373 Initial commit
```

## Two Common Beginner Mistakes

### 1. Committing changes without staging them

A beginner may edit a file and run `git commit` without first running `git add`. Git commits only the contents that are staged, so unstaged edits are left outside the commit. The solution is to review changes with `git status`, stage the intended files using `git add`, and then commit.

### 2. Writing vague commit messages

Messages such as "update" or "changes" do not explain what was modified or why. This makes the commit history difficult to understand later. Commit messages should be short and meaningful, for example, "Add Git status and commit example".
