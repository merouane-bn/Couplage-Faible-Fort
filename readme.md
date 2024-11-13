# TP: Strong Coupling vs. Loose Coupling in Java

## Overview

This hands-on project (TP) explores **strong coupling** and **loose coupling** through the development of a Java-based student management application. The application supports adding, updating, and retrieving student data using various storage methods (list and dictionary). The project is structured into three stages:

1. **Static Instantiation**: Initial setup using a list for student storage.
2. **Application Extension**: Replace list-based storage with a dictionary-based approach.
3. **Dynamic Instantiation**: Enable dynamic selection of storage method, with expanded functionality like updating student information.

## Project Structure

The project is divided into three main packages:

- **`dao`**: Data Access Object for managing student storage.
- **`metier`**: Handles the core business logic.
- **`presentation`**: Provides the main entry point for application execution.

### Core Classes

- **`Etudiant`**: Represents a student with `id`, `nom`, `prenom`, and `email`.
- **`EtudiantDAO`**: Implements DAO pattern with a `List<Etudiant>` for student storage.
  - **Attributes**:
    - `List<Etudiant> etudiants`: List to store students.
  - **Methods**:
    - `public Etudiant addEtudiant(Etudiant etudiant)`: Adds a student.
    - `public List<Etudiant> getAllEtudiants()`: Retrieves all students.
- **`EtudiantDAODictionary`**: Alternative DAO that uses a `Map<String, Etudiant>` for storage.
- **`EtudiantManager`**: Manages business logic via a DAO.
  - **Methods**:
    - `addEtudiant(Etudiant etudiant)`: Adds a student with email verification.
    - `getAllEtudiants()`: Retrieves all stored students.

## Setup Instructions

### Requirements

- **Java SDK** (latest stable version)
- **IntelliJ IDEA** or another Java IDE

### Installation Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/merouane-bn/Couplage-Faible-Fort.git
   ```

2. **Open Project in IntelliJ IDEA**:
  - Launch IntelliJ IDEA.
  - Go to `File > Open...`, then select the project directory.
  - If prompted to import as a Maven or Gradle project, select `Import`.

3. **Build the Project**:
  - Wait for IntelliJ to download dependencies, if applicable, and build the project.

## Running the Application

1. In the `presentation` package, locate `MainDictionary.java`.
2. Right-click `MainDictionary.java` and select **Run 'MainDictionary.main()'**.
3. Alternatively, open the file and click the green **Run** button next to the main method.

The application should now start, allowing you to add, update, and retrieve student data.

---

## TP Instructions Breakdown

### 🟢 Part 1: Static Instantiation

1. Set up a new project in IntelliJ and create three packages: `dao`, `metier`, and `presentation`.

In the **`dao` package**:
- Implement the `Etudiant` class with fields for `id`, `nom`, `prenom`, and `email`.
- Implement `EtudiantDAO` with a `List<Etudiant>` to manage student entries and add methods for adding and retrieving students.

In the **`metier` package**:
- Implement `EtudiantManager` to handle adding and retrieving students through `EtudiantDAO`.

In the **`presentation` package**:
- Create a `Presentation` class with a `main` method to initialize the `EtudiantManager`, add students, and test the implementation.

### 🟢 Part 2: Application Extension

1. Implement `EtudiantDAODictionary` in the **`dao` package**, using a `Map<String, Etudiant>` for storage.
2. Update `EtudiantManager` to utilize `EtudiantDAODictionary` as the storage backend.
3. Refactor methods in `EtudiantManager` to interact with the dictionary-based implementation.

### 🟢 Part 3: Dynamic Instantiation

To achieve dynamic selection of storage implementation, implement a common DAO interface for both `EtudiantDAO` and `EtudiantDAODictionary`.

1. **Create a DAO Interface**: Define an interface specifying methods for adding and retrieving students.
2. **Implement the Interface**: Ensure both `EtudiantDAO` and `EtudiantDAODictionary` implement this interface.
3. **Refactor `EtudiantManager`**: Update `EtudiantManager` to depend on the DAO interface, allowing it to use any compatible DAO implementation, enhancing modularity and reducing coupling.

---

## Adding Update Functionality

To extend the application, add an update method in both `EtudiantDAO` and `EtudiantDAODictionary` that allows modification of student details (excluding `id`).

---

## Usage Guide

- **Add Student**: Use `addEtudiant` in `EtudiantManager` to store a student in either list or dictionary format.
- **Retrieve All Students**: Call `getAllEtudiants` to fetch all students from the selected storage.
- **Update Student**: Modify a student’s `nom`, `prenom`, or `email` without changing the `id`.

This structure and functionality provide a hands-on example of strong vs. loose coupling in Java applications, making it easy to extend and maintain the application.