# Git branching and merging

This exercise demonstrates creating a feature branch, committing work there, merging it into `main`, and understanding merge conflicts.

## Commands

Run these commands from a clone of this repository. The example creates a small file on a separate branch so the branch has a real, reviewable change.

```bash
# Start from an up-to-date main branch
git switch main
git pull origin main

# Create a feature branch and switch to it
git switch -c feature/branching-merging

# Make and commit a change on the feature branch
echo "Branching and merging exercise" > branching-demo.txt
git add branching-demo.txt
git commit -m "Add branching demo"

# Switch back to main and merge the feature branch
git switch main
git merge --no-ff feature/branching-merging -m "Merge branching demo"

# Update the assignment branch with the completed main history, then push
# the requested branch to GitHub
git switch branching-merging-week1-24
git merge main
git push origin branching-merging-week1-24
```

`git switch -c` creates a branch and checks it out in one step. `git switch` without `-c` changes to an existing branch. The feature commit is made while on `feature/branching-merging`; `git merge` brings that commit into `main`. The final merge brings the updated `main` history onto the requested assignment branch before pushing it.

## Merge conflicts

A merge conflict occurs when Git cannot automatically combine changes from two branches—for example, when both branches change the same lines of the same file in incompatible ways. Git marks the conflicted sections with `<<<<<<<`, `=======`, and `>>>>>>>` markers and pauses the merge for you to decide which content to keep (or how to combine both versions).

To resolve one, edit each conflicted file and remove the conflict markers, review the result, then stage the resolved files and finish the merge:

```bash
git status
# Edit each conflicted file and remove the conflict markers.
git add <resolved-file>
git commit
```

For a merge you want to abandon instead, use `git merge --abort`. Conflicts are not errors in the repository; they are Git asking a person to reconcile edits it cannot safely choose between.

## Merge history

After the merge, run this command to capture the actual history, including the branch structure:

```bash
git log --oneline --graph --all
```

Representative output for the commands above (the abbreviated hashes and branch labels vary by repository and by run):

```text
*   d4e5f6a (HEAD -> branching-merging-week1-24) Merge main into branching-merging-week1-24
|\
| *   b2c3d4e (main) Merge branching demo
| |\
| | * a1b2c3d (feature/branching-merging) Add branching demo
| |/
|/|
* | 9f8e7d6 (initial commit)
|/
```

The merge commit on `main` has both the previous `main` history and the feature-branch commit as parents. The assignment branch then incorporates the updated `main` history. Run the command locally after completing the steps to get the exact hashes and graph for your clone.
