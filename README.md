# Veterinary Appointment Agenda - registroVeterinaria

## Description

Appointment scheduling system for a veterinary clinic: manage pets, veterinarians and medical appointments, with file persistence through the **DAO** pattern. The project includes a `Demo` class that runs the whole flow from the console.

Academic project developed for the **Java programming** courses - Systems Engineering, Universidad El Bosque.

## Author

- Sergio Alejandro Parra Rivera

## Technologies

- Java 21 (compiled with `maven-compiler-plugin`)
- Maven 3.8+ with `exec-maven-plugin` to run the application
- **MVC** architecture (`controller`, `model`, `persistence`)
- **DAO** pattern (`IDAO`, `CitaDAOImpl`) for file persistence

## Requirements

| Requirement | Version | How to check |
| --- | --- | --- |
| JDK | 21 or higher | `javac -version` |
| Maven | 3.8 or higher | `mvn -v` |
| Git | Any recent version | `git --version` |

## Installation

Follow these steps exactly so the application runs on the first try.

### 1. Clone the repository

```bash
git clone https://github.com/P2X4A/registroVeterinaria.git
```

### 2. Enter the project folder

```bash
cd registroVeterinaria
```

> On Windows, if your path contains spaces, always quote it, for example: `cd "C:\Users\Example\Documents\registroVeterinaria"`.

### 3. Verify your environment

```bash
javac -version
mvn -v
```

Expected: JDK 21 (or higher) and Maven 3.8 (or higher). If any command fails, install or update that tool before continuing.

### 4. Compile the project

```bash
mvn clean compile
```

What success looks like:

- The console ends with `BUILD SUCCESS`.
- A `target/classes/` folder is created with the compiled classes.

## Running the application

```bash
mvn exec:java
```

The demo flow runs in the terminal. The main class of this project is `co.edu.unbosque.controller.Demo`, configured in `pom.xml`.

Troubleshooting:

- `ClassNotFoundException` or missing main class: compile first with `mvn clean compile`.
- `UnsupportedClassVersionError`: your JDK is older than 21; install JDK 21 or higher and check it with `javac -version`.

## Main features

- **Pets and owners:** `Mascota` holds each pet registered in the clinic.
- **Veterinarians:** `Veterinario` and `Veterinaria` model the clinic staff and the clinic itself.
- **Appointment agenda:** `AgendaVeterinaria` schedules medical appointments between pets and veterinarians.
- **Persistence:** appointments are stored in files through the DAO layer (`CitaDAOImpl`, `IDAO`, `FileHandler`).
- **Demo entry point:** `Demo` executes a complete flow of the system so it can be run without extra setup.

## Project structure

```text
registroVeterinaria/
├── pom.xml
├── README.md
├── LICENSE
└── src/
    └── co/edu/unbosque/
        ├── controller/
        │   └── Demo.java                  # Entry point (main class)
        ├── model/
        │   ├── Veterinaria.java           # Clinic model
        │   ├── AgendaVeterinaria.java     # Appointment agenda
        │   ├── Mascota.java               # Pet entity
        │   ├── Veterinario.java           # Veterinarian entity
        │   └── MascotaDTO.java            # Pet record (DTO)
        └── persistence/
            ├── IDAO.java                  # Data access interface
            ├── CitaDAOImpl.java           # Appointment DAO
            └── FileHandler.java           # File reading and writing
```
