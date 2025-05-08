# Wiki de BuckShot Roulette / BuckShot Roulette Wiki

Bienvenido a la documentación técnica y al devlog de BuckShot Roulette. / Welcome to the technical documentation and devlog of BuckShot Roulette.

---

## 1. Documentación Técnica / Technical Documentation

### 1.1 Arquitectura del Proyecto (En progreso) / Project Architecture (In progress)

* **core/**: Lógica de juego (generación de balas, gestión de vida, turnos). / Game logic (bullet generation, health management, turn handling).
* **ui/**: Interfaz de usuario (consola o componentes web). / User interface (console or web components).
* **utils/**: Funciones auxiliares y helpers. / Helper functions and utilities.
* **config/**: Archivos de configuración JSON. / JSON configuration files.

### 1.2 Diagrama de Clases / Class Diagram

```mermaid
tclassDiagram
    Player <|-- HumanPlayer
    Player <|-- Dealer
    class Player {
        - String name
        - int life
        + shoot(): Boolean
        + useItem(item: Item)
    }
```

*Mermaid soportado en GitHub para visualizar diagramas.*

### 1.3 Documentación Automática / Generated Documentation

La documentación se genera con Dokka. Ejecuta:

```bash
./gradlew dokkaHtml
```

y encontrarás la salida en `build/dokka/html/`. / The documentation will be available in `build/dokka/html/`.

---

## 2. Devlog / Changelog

| Fecha / Date | Versión / Version | Cambios / Changes                        |
| ------------ | ----------------- | ---------------------------------------- |
| 2025-03-13   | 1.0.0             | - Lanzamiento inicial con README básico. |

* Mecánica de ruleta rusa y lógica de turnos.
  \| 2025-05-07        | 1.3.0             | - Actualización de README: motivación, instrucciones de despliegue ampliadas.
* Contributing.md bilingüe.
* Wiki bilingüe inicial.
  \| 2025-05-08        | 1.3.1             | - Correcciones menores en contributing y wiki.
  \| *Próximamente* / *Upcoming* | 1.4.0             | - Implementación de demo online.
* Documentación de CI/CD y releases automáticos.

---

*Este devlog se actualizará con cada release y cambio significativo.* / *This devlog will be updated with each release and significant change.*
