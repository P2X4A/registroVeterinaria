# Agenda Veterinaria

Sistema de agenda de citas medicas de una veterinaria con mascotas, veterinarios y asignacion de citas.

## Detalle

| | |
|---|---|
| Tipo | Consola (MVC) |
| Archivos Java | 9 |
| Version de Java | 21 |
| Patron | Incluye una clase Demo con metodo main para poder ejecutar una demostracion |

## Funcionalidades

- Registro de mascotas con validacion de duplicados
- Registro de veterinarios
- Agenda por identificacion de veterinario
- Persistencia DAO con archivo
- Conversion a DTO para persistencia

## Estructura del proyecto

```
registroVeterinaria/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin co.edu.unbosque.controller.Demo
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).