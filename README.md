# Java Programming Assignment

A learning repository for module-wise and week-wise Java programming assignments. This project follows a small, focused GitHub workflow for documenting and reviewing changes.

## Repository structure

```text
README.md
.gitignore
src/
└── HelloWorld.java
```

Java source files reside under `src/`. Add each module or exercise under an appropriately named package or folder under `src/`.

## GitHub workflow

Follow a branch and pull request workflow for every change:

1. **Pull the latest changes:**
   ```bash
   git switch main
   git pull origin main
   ```
2. **Create a feature branch:**
   ```bash
   git switch -c feature/short-description
   ```
3. **Make small, focused changes and stage them:**
   ```bash
   git add <files>
   ```
4. **Commit with a descriptive message:**
   ```bash
   git commit -m "Add feature description"
   ```
5. **Push the feature branch to remote:**
   ```bash
   git push -u origin feature/short-description
   ```
6. **Open a Pull Request:** Create a PR on GitHub comparing your feature branch against `main`, request review, and merge once checks pass.
7. **Clean up after merge:**
   ```bash
   git switch main
   git pull origin main
   git branch -d feature/short-description
   ```

## Issues and pull requests

- **GitHub Issues:** Used to track tasks, bugs, feature requests, and project backlogs. Issues document requirements, discussions, and acceptance criteria. When completing work associated with an issue, reference it in your pull request (e.g., `Closes #1` or `Fixes #1`) to automatically close the issue upon merge.
- **Pull Requests (PRs):** Used to propose changes from a feature branch into a target branch (like `main`). Pull requests provide a platform for code review, inline comments, automated CI/CD checks, and collaborative discussion before code enters production.
- **Pull Request Link:**
  - Pull Request: https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay/pull/2

## Git best practices for Java projects

1. **Small, focused commits:** Each commit should represent a single logical change or bugfix. Avoid monolithic commits that touch unrelated areas.
2. **Clear and descriptive commit messages:** Use imperative, informative commit messages (e.g., `Add Java project README and Git ignore rules` instead of `changes`).
3. **Never commit sensitive data:** Keep passwords, secrets, API keys, tokens, and private credentials out of version control.
4. **Exclude build artifacts and binaries:** Do not commit compiled `.class` files, `.jar` files, build folders (`target/`, `build/`, `out/`), or IDE metadata (`.idea/`, `.vscode/`). Always configure `.gitignore` properly.
5. **Branching strategy:** Never push directly to `main`. Always work on dedicated feature branches and use pull requests for merging.
6. **Review before committing:** Use `git status` and `git diff` to verify the exact changes staged for commit.

## Java setup & execution

Compile and run the Java source file from the repository root:

```bash
javac src/HelloWorld.java
java -cp src HelloWorld
```

Compiled `.class` files are automatically excluded by `.gitignore`.
