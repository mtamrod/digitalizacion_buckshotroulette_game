# BuckShot Roulette - Juego de Estrategia en Kotlin / Strategy Game in Kotlin

## Motivación / Motivation

**Español:**
Este proyecto se originó en un contexto académico para abordar un par de ejercicios pendientes de curso. Tras completarlo, surgió la idea de seguir mejorándolo y convertirlo en una demostración pública del trabajo individual, con el fin de contribuir a la comunidad de desarrollo y ofrecer una experiencia lúdica y satisfactoria a los usuarios.

**English:**
This project was initially created for academic purposes to tackle a couple of pending assignments. After its completion, it was decided to continue refining it with the goal of showcasing an individual’s small-scale work to a broader audience, contributing to the developer community, and providing users with an enjoyable and rewarding experience.

## Descripción del Proyecto / Project Description

**Español:**
**BuckShot Roulette** es un juego desarrollado en Kotlin donde dos jugadores (un humano y un dealer controlado por IA) se enfrentan en una partida de ruleta rusa con una escopeta cargada aleatoriamente con balas reales (dañinas) y balas falsas (inofensivas). El objetivo es reducir la vida del oponente a cero mediante turnos alternados, utilizando objetos estratégicos para obtener ventajas.

**English:**
**BuckShot Roulette** is a game developed in Kotlin where two players (one human and an AI-controlled dealer) engage in a Russian roulette match with a shotgun loaded randomly with real (harmful) and dummy (harmless) rounds. The goal is to reduce the opponent’s life to zero through alternate turns, using strategic items for advantages.

## Cómo Ejecutar / How to Run and Deploy

**Español:**

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/tuUsuario/buckshot-roulette.git
   cd buckshot-roulette
   ```
2. **Requisitos Previos:**

   * Tener instalado **Kotlin 1.8+** y **JVM 11+**.
   * (Opcional) SDKMAN! o Homebrew para gestionar versiones de Kotlin.
3. **Compilar el proyecto:**

   ```bash
   ./gradlew build
   ```

   Esto generará un archivo ejecutable `buckshot-roulette.jar` en `build/libs/`.
4. **Ejecutar la aplicación:**

   ```bash
   java -jar build/libs/buckshot-roulette.jar
   ```
5. **Opciones adicionales: (Aún no implementadas)**

   * `--mode=demo`: Arranca en modo demostración sin IA.
   * `--config=path/to/config.json`: Carga configuraciones personalizadas (número de rondas, objetos extra, etc.).
6. **Despliegue en entornos web (opcional):**

   * Convierte el juego en una aplicación web con Kotlin/JS o empaquétalo con Electron.
   * Sube el paquete a un servidor estático (Netlify, Vercel) o a un contenedor Docker.

**English:**

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourUser/buckshot-roulette.git
   cd buckshot-roulette
   ```
2. **Prerequisites:**

   * **Kotlin 1.8+** and **JVM 11+** installed.
   * (Optional) SDKMAN! or Homebrew for Kotlin version management.
3. **Build the project:**

   ```bash
   ./gradlew build
   ```

   This will produce an executable `buckshot-roulette.jar` in the `build/libs/` directory.
4. **Run the application:**

   ```bash
   java -jar build/libs/buckshot-roulette.jar
   ```
5. **Additional options: (Not yet implemented)**

   * `--mode=demo`: Starts in demo mode without AI.
   * `--config=path/to/config.json`: Loads custom settings (number of rounds, extra items, etc.).
6. **Web deployment (optional):**

   * Port the game to a web app using Kotlin/JS or bundle it with Electron.
   * Deploy the bundle to a static hosting service (Netlify, Vercel) or a Docker container.

\--- Principales / Key Features

| Español                                                                                                                                                | English                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Generación Aleatoria de Balas:** Cada ronda carga entre 3 y 6 balas reales o falsas.                                                                 | **Random Bullet Generation:** Each round loads between 3 and 6 real or dummy rounds.                                                               |
| **Objetos Especiales:** Los jugadores pueden usar objetos como cigarrillos (curan vida), lupas (revelan la próxima bala) y cervezas (descartan balas). | **Special Items:** Players can use items such as Cigarettes (heal health), Magnifying Glasses (reveal the next round), and Beers (discard rounds). |
| **Gestión de Turnos:** El jugador humano elige acciones (usar objeto o disparar), mientras el dealer actúa aleatoriamente.                             | **Turn Management:** The human player chooses actions (use item or shoot), while the dealer acts randomly.                                         |
| **Sistema de Vida:** Ambos jugadores comienzan con 5 puntos de vida.                                                                                   | **Health System:** Both players start with 5 health points.                                                                                        |

---

## Objetivos del Proyecto / Project Objectives

**Español:**

1. **Licencia abierta y colaborativa:** Se ha establecido una licencia permisiva para fomentar la adopción y modificación del proyecto sin ánimo de lucro. De este modo se crea una comunidad de usuarios y desarrolladores que puedan contribuir con mejoras, reporte de errores y compartir extensiones gráficas o de funcionalidad.

2. **Alineación organizacional y expansión colaborativa:** Aunque inicialmente el proyecto está impulsado por un único desarrollador, se busca:

   * Comunicar progresos y recibir feedback de otros desarrolladores a través de GitHub Issues y Pull Requests.
   * Invitar a diseñadores gráficos para crear assets (imágenes, iconos) y mejorar la experiencia de usuario.
   * Abrir canales en redes o foros especializados (p.ej. Discord, LinkedIn) para tomar ideas de la comunidad y coordinar futuras aportaciones.

3. **Accesibilidad, comprensibilidad y escalabilidad del código:** Se ha buscado documentar exhaustivamente el código usando KDoc para todas las clases y funciones, describiendo parámetros, valores de retorno y ejemplos de uso. Se plantea implementar una organización del repositorio con módulos claros:

   * `core/` para la lógica de juego.
   * `ui/` para componentes de interfaz.
   * `utils/` para funciones auxiliares.
   * Incluir un índice de documentación automática generado con Dokka que facilite la navegación y aporte búsquedas rápidas.

4. **Impacto de la digitalización en la empresa:** Análisis de cómo BuckShot Roulette puede:

   * **Ámbito digital:** Demostrar el potencial de software ágil y modular para proyectos internos, fomentando el uso de Kotlin y herramientas modernas.
   * **Ámbito empresarial:** Servir como caso de estudio para la transformación digital, mostrando ahorro de tiempo y recursos en simulaciones de entrenamiento para IA.
   * **Ámbito cultural:** Reflejar una cultura de innovación y colaboración abierta, incentivando a los equipos a experimentar con código abierto.
   * **Ámbito innovador:** Inspirar la integración de mecánicas de juego en procesos formativos y de testing, apoyando la innovación de productos y servicios digitales.

**English:**

1. **Open-source and Collaborative License:** A permissive license has been established to encourage adoption and modification of the project without profit motive. This creates a community of users and developers who can contribute improvements, report bugs, and share graphical or functional extensions.

2. **Organizational Alignment and Collaborative Expansion:** Although the project is initially driven by a single developer, it aims to:

   * Communicate progress and receive feedback from other developers via GitHub Issues and Pull Requests.
   * Invite graphic designers to create assets (images, icons) and enhance user experience.
   * Open channels on social platforms or specialized forums (e.g., Discord, LinkedIn) to gather community ideas and coordinate future contributions.

3. **Code Accessibility, Comprehensibility, and Scalability:** The code has been thoroughly documented using KDoc for all classes and functions, describing parameters, return values, and usage examples. The repository is organized into clear modules:

   * `core/` for game logic.
   * `ui/` for interface components.
   * `utils/` for helper functions.
   * Includes an automatically generated documentation index with Dokka for easy navigation and quick searches.

4. **Digitalization Impact Analysis:** Examination of how BuckShot Roulette can:

   * **Digital Scope:** Showcase the potential of agile and modular software for internal projects, promoting the use of Kotlin and modern tools.
   * **Business Scope:** Serve as a case study for digital transformation, demonstrating time and resource savings in AI training simulations.
   * **Cultural Scope:** Reflect a culture of innovation and open collaboration, encouraging teams to experiment with open-source code.
   * **Innovative Scope:** Inspire the integration of gaming mechanics into training and testing processes, supporting innovation in digital products and services.

---

## Ciclo de Vida del Dato / Data Lifecycle (5b)

**Español:**

* **Generación y Gestión:** Las balas y objetos se generan al inicio de cada ronda (`generarBalas()`, `generarObjetos()`) y se almacenan en listas mutables (`MutableList<Bala>`, `MutableList<Items<Jugador>>`). Durante los turnos se modifican (e.g., `balas.removeFirst()`).
* **Consistencia:** La integridad se garantiza mediante métodos que actualizan estados directamente (e.g., `jugador.vida -= danio`).
* **Futuras Mejoras:** Implementar persistencia de datos (guardar estadísticas de partidas en JSON o bases de datos).

**English:**

* **Generation and Management:** Rounds and items are generated at the start of each round (`generarBalas()`, `generarObjetos()`) and stored in mutable lists (`MutableList<Bala>`, `MutableList<Items<Jugador>>`). They are modified during turns (e.g., `balas.removeFirst()`).
* **Consistency:** Integrity is ensured through methods that directly update states (e.g., `jugador.vida -= danio`).
* **Future Improvements:** Implement data persistence (store match statistics in JSON or databases).

---

## Almacenamiento en la Nube / Cloud Storage (5f)

**Español:**

* **Situación Actual:** No se usa almacenamiento en la nube.
* **Alternativas Consideradas:** Bases de datos locales para simplicidad, pero la nube ofrece mayor escalabilidad y acceso remoto.

**English:**

* **Current Situation:** No cloud storage is used.
* **Considered Alternatives:** Local databases for simplicity, though cloud storage provides better scalability and remote access.

---

## Seguridad y Regulación / Security and Compliance (5i)

**Español:**

* **Medidas Actuales:** No se manejan datos sensibles.
* **Riesgos Potenciales:** Si se añaden perfiles de usuario, será necesario cumplir con protección de datos.
* **Futuras Mejoras:** Añadir cifrado y hashing de contraseñas al incorporar datos sensibles.

**English:**

* **Current Measures:** No sensitive data is handled.
* **Potential Risks:** Adding user profiles would require data protection compliance.
* **Future Improvements:** Add encryption and password hashing when handling sensitive data.

---

## Implicación de las THD en Negocio y Planta / Impact of Digital Technologies on Business and Operations (2e)

**Español:**

* **Impacto Actual:** Aunque es un juego, la lógica de turnos y gestión de recursos podría adaptarse a simuladores de decisiones en entornos industriales.
* **Beneficios Potenciales:** Mejora de procesos operativos mediante simulación de escenarios críticos.

**English:**

* **Current Impact:** While primarily a game, its turn-based and resource management logic could be adapted for decision-making simulators in industrial settings.
* **Potential Benefits:** Enhanced operational processes through critical scenario simulations.

---

## Mejoras en IT y OT / IT and OT Enhancements (2f)

**Español:**

* **Integración IT/OT:** La estructura del juego puede extenderse para automatizar flujos de trabajo (e.g., aprobación de tareas en cadena).
* **Automatización:** Modelar fallos en sistemas industriales y realizar pruebas de resistencia usando la lógica de balas/objetos.

**English:**

* **IT/OT Integration:** The game structure can be extended to automate workflows (e.g., chained task approvals).
* **Automation:** Model system failures and conduct stress tests in industrial systems using bullet/item logic.

---

## Tecnologías Habilitadoras Digitales / Enabling Digital Technologies (2g)

**Español:**

* **Tecnologías Usadas:** Kotlin para programación modular y funciones de alto orden.
* **Futuras THD:** APIs REST para guardar puntuaciones en línea, Machine Learning para mejorar la IA del dealer.

**English:**

* **Technologies Used:** Kotlin for modular programming and higher-order functions.
* **Future Digital Technologies:** REST APIs for online score storage, Machine Learning to enhance dealer AI.

---

¡Diviértete jugando a **BuckShot Roulette**! 🎮 / Have fun playing **BuckShot Roulette**! 🎮
