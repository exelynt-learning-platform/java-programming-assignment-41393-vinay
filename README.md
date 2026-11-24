# Git & GitHub Version Control Essentials for Developers

A complete Java project demonstrating end-to-end Git and GitHub version control practices, including repository initialization, atomic commits, feature branching, merge conflict resolution, remote management, and repository hygiene.

---

## 1. Project Overview

This project consists of an extensible Java greeting application accompanied by developer documentation and version control notes. It demonstrates how modern software teams manage codebases collaboratively using Git and GitHub.

### Repository Structure
```text
.
├── .gitignore                      # Excludes binaries, build artifacts, and IDE configurations
├── README.md                       # Project overview, setup steps, and version control audit
├── notes/
│   ├── feature-enhancement.md      # Feature branch architecture and design notes
│   └── version-control-notes.md    # Comprehensive Git and GitHub workflow reference
└── src/
    ├── GreetingService.java        # Modular business logic for greetings and version metadata
    └── HelloWorld.java             # Main application entry point
```

---

## 2. Setup & Execution Steps

### Prerequisites
- Java Development Kit (JDK 11 or higher)
- Git (2.30+ recommended)

### Build and Run Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git
   cd java-programming-assignment-41393-vinay
   ```

2. **Compile the Java source files:**
   ```bash
   javac -d out src/*.java
   ```

3. **Run the compiled application:**
   ```bash
   java -cp out HelloWorld
   ```

### Expected Output
```text
=========================================
   Git & GitHub Essentials Java Demo    
=========================================
Main Branch: Version 1.0 Production Release
Greeting: Hello, Developer! Welcome to GitHub collaboration.
Build Status: Feature branch enhancement merged cleanly
```

---

## 3. Remote Repository Configuration

The local repository was connected to GitHub using `git remote add origin`:

```bash
git remote add origin https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git
```

### Verified Remote Output (`git remote -v`)
```text
origin	https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git (fetch)
origin	https://github.com/exelynt-learning-platform/java-programming-assignment-41393-vinay.git (push)
```

- **Local Repository**: Resides on the local disk inside `.git/`, facilitating offline commits, private branch exploration, and rapid staging.
- **Remote Repository**: Hosted on GitHub, providing a public, collaborative source of truth, automated continuous integration, and secure off-site backup.

---

## 4. Branching, Merging & Merge Conflict Resolution

### Branching Strategy
1. The base development branch was maintained on `git-github-version-control-essentials-for-developers-week1-24`.
2. A feature branch `feature/greeting-enhancement` was created for modular additions:
   ```bash
   git checkout -b feature/greeting-enhancement
   ```
3. Multiple focused commits were recorded on the feature branch (`GreetingService.java` and architectural notes).

### Merge Conflict Simulation & Resolution
To demonstrate real-world conflict handling:
1. `src/HelloWorld.java` was updated on the main branch for production release notes.
2. `src/HelloWorld.java` was concurrently modified on `feature/greeting-enhancement` to integrate `GreetingService`.
3. When executing `git merge feature/greeting-enhancement`, Git identified overlapping modifications and prompted a conflict:
   ```text
   Auto-merging src/HelloWorld.java
   CONFLICT (content): Merge conflict in src/HelloWorld.java
   Automatic merge failed; fix conflicts and then commit the result.
   ```
4. **Conflict Markers Inspected**:
   ```java
<<<<<<< HEAD
        System.out.println("Main Branch: Version 1.0 Production Release");
        System.out.println("Environment: Java SE Development");
=======
        System.out.println("Greeting: " + GreetingService.getPersonalizedGreeting("Developer"));
        System.out.println("Build Status: Feature branch enhancement active");
>>>>>>> feature/greeting-enhancement
   ```
5. **Resolution Applied**: Both enhancements were integrated cleanly:
   ```java
        System.out.println("Main Branch: Version 1.0 Production Release");
        System.out.println("Greeting: " + GreetingService.getPersonalizedGreeting("Developer"));
        System.out.println("Build Status: Feature branch enhancement merged cleanly");
   ```
6. The resolved file was staged and committed with `git commit -m "Merge branch 'feature/greeting-enhancement' and resolve conflict in HelloWorld.java"`.

---

## 5. Commit History & Graph Output

Below is the verified output of `git log --oneline --graph` demonstrating branch divergence, commit progression, and the merge point:

```text
*   d0cdc5d Merge branch 'feature/greeting-enhancement' and resolve conflict in HelloWorld.java
|\  
| * 08613ce Document feature enhancement architecture in notes
| * dbc34e4 Implement GreetingService and enhance HelloWorld output on feature branch
* | a5d6047 Update HelloWorld output on main branch for release baseline
|/  
* 7ef4730 Add core HelloWorld Java application
* c0507fb Initialize project structure with .gitignore and version control notes
```

### Commit Discipline
- Each commit is atomic and focuses on a single logical change.
- Commit messages use clear, imperative descriptions.
- The repository satisfies and exceeds the minimum required count of 5 commits.

---

## 6. Security and Repository Hygiene

- **`.gitignore` Rules**: Excludes all `.class` binaries, packaging archives (`.jar`, `.war`), build output directories (`target/`, `build/`, `out/`, `bin/`), and IDE configurations (`.idea/`, `.vscode/`, `*.iml`).
- **No Sensitive Data**: Passwords, API tokens, `.env` files, and local private keys are strictly blocked and excluded.
