# Contributing to BuckShot Roulette / Contribuir a BuckShot Roulette

Thank you for your interest in contributing to BuckShot Roulette! This document outlines the steps and best practices for contributing to the project.

¡Gracias por tu interés en contribuir a BuckShot Roulette! Este documento detalla los pasos y buenas prácticas para aportar al proyecto.

## Table of Contents / Tabla de Contenidos

1. [Contribution Process](#contribution-process) / [Proceso de Contribución](#proceso-de-contribución)
2. [Reporting Issues](#reporting-issues) / [Reportar Issues](#reportar-issues)
3. [Pull Requests](#pull-requests) / [Pull Requests](#pull-requests)
4. [Code Style](#code-style) / [Estilo de Código](#estilo-de-código)
5. [Roadmap & Enhancement Areas](#roadmap--enhancement-areas) / [Roadmap y Áreas de Mejora](#roadmap-y-áreas-de-mejora)
6. [Contact & Support Channels](#contact--support-channels) / [Contacto y Canales de Soporte](#contacto-y-canales-de-soporte)

---

## Contribution Process / Proceso de Contribución

**English:**

1. **Fork** the main repository.
2. **Clone** your fork locally:

   ```bash
   git clone https://github.com/yourUser/buckshot-roulette.git
   cd buckshot-roulette
   ```
3. **Create** a descriptive branch for your change:

   ```bash
   git checkout -b feat/new-feature
   ```
4. **Develop** your contribution in the branch and **document** changes in commit messages.
5. **Run** unit tests and ensure everything compiles:

   ```bash
   ./gradlew test
   ```
6. **Sync** with the original repository’s main branch:

   ```bash
   git remote add upstream https://github.com/originalProject/buckshot-roulette.git
   git fetch upstream
   git rebase upstream/main
   ```
7. **Submit** your Pull Request:

   * Go to the "Pull Requests" section on GitHub.
   * Select your branch and clearly describe your changes.

**Español:**

1. **Fork** el repositorio principal.
2. **Clona** tu fork en local:

   ```bash
   git clone https://github.com/tuUsuario/buckshot-roulette.git
   cd buckshot-roulette
   ```
3. **Crea** una rama descriptiva para tu cambio:

   ```bash
   git checkout -b feat/nueva-funcionalidad
   ```
4. **Desarrolla** tu aporte en la rama y **documenta** los cambios en los mensajes de commit.
5. **Ejecuta** las pruebas unitarias y verifica que todo compile:

   ```bash
   ./gradlew test
   ```
6. **Sincroniza** con la rama principal del repositorio original:

   ```bash
   git remote add upstream https://github.com/proyecto-original/buckshot-roulette.git
   git fetch upstream
   git rebase upstream/main
   ```
7. **Envía** tu Pull Request:

   * Dirígete a la sección "Pull Requests" en GitHub.
   * Selecciona tu rama y describe claramente tus cambios.

---

## Reporting Issues / Reportar Issues

**English:**

1. Create a new *Issue* on GitHub when you find a bug or have an enhancement idea.
2. Use appropriate labels (`bug`, `enhancement`, `question`).
3. Provide steps to reproduce the issue or a detailed description of the suggestion.

**Español:**

1. Crea un nuevo *Issue* en GitHub si encuentras un error o tienes una idea de mejora.
2. Usa etiquetas correspondientes (`bug`, `enhancement`, `question`).
3. Proporciona pasos para reproducir el problema o una descripción detallada de la sugerencia.

---

## Pull Requests

**English:**

* Each PR should be linked to an existing Issue.
* Include tests or usage examples when applicable.
* Keep your branch focused on a single topic.
* Follow the code style guidelines (see next section).

**Español:**

* Cada PR debe estar asociado a un Issue.
* Incluye pruebas o ejemplos de uso si aplica.
* Mantén tu rama enfocada en un solo tema.
* Sigue las guías de estilo de código (ver sección siguiente).

---

## Code Style / Estilo de Código

**English:**

* **Language:** Kotlin.
* **Documentation:** Use KDoc for classes and functions. Example:

  ```kotlin
  /**
   * Calculates damage inflicted by a bullet.
   * @param power Bullet power.
   * @return Resulting damage.
   */
  fun calculateDamage(power: Int): Int { ... }
  ```
* **Formatting:** Follow the official Kotlin style (4-space indentation, lines under 100 characters).
* **Commits:** Clear messages with format `type: short description`, e.g., `feat: add demo mode`.

**Español:**

* **Lenguaje:** Kotlin.
* **Documentación:** Usa KDoc para clases y funciones. Ejemplo:

  ```kotlin
  /**
   * Calcula el daño infligido por una bala.
   * @param power Potencia de la bala.
   * @return Daño resultante.
   */
  fun calculateDamage(power: Int): Int { ... }
  ```
* **Formateo:** Sigue el estilo oficial de Kotlin (indentación de 4 espacios, líneas menores a 100 caracteres).
* **Commits:** Mensajes claros con formato `tipo: descripción breve`, p.ej., `feat: añadir modo demo`.

---

## Roadmap & Enhancement Areas / Roadmap y Áreas de Mejora

**English:**

* **Web Integration:** Kotlin/JS or Electron.
* **AI Improvements:** Advanced machine learning techniques.
* **Customization:** New items, game modes.
* **Documentation:** Advanced configuration examples.

**Español:**

* **Integración Web:** Kotlin/JS o Electron.
* **Mejoras de IA:** Técnicas avanzadas de machine learning.
* **Personalización:** Nuevos objetos, modos de juego.
* **Documentación:** Ejemplos de configuración avanzada.

---

## Contact & Support Channels / Contacto y Canales de Soporte

**English:**

* **GitHub Discussions:** For general discussions and questions.
* **Discord:** #buckshot-roulette channel on our server.
* **LinkedIn:** Periodic devlog posts.

**Español:**

* **GitHub Discussions:** Para charlas y preguntas generales.
* **Discord:** Canal #buckshot-roulette en nuestro servidor.
* **LinkedIn:** Publicaciones periódicas del devlog.
