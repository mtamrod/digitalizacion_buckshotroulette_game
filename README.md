# BuckShot Roulette - Juego de Estrategia en Kotlin

## Descripción del Proyecto
**BuckShot Roulette** es un juego desarrollado en Kotlin donde dos jugadores (un humano y un dealer controlado por IA) se enfrentan en una partida de ruleta rusa con una escopeta cargada aleatoriamente con balas reales (que causan daño) y falsas (inofensivas). El objetivo es reducir la vida del oponente a cero mediante turnos alternados, utilizando objetos estratégicos para obtener ventajas.

### Características Principales:
- **Generación Aleatoria de Balas**: Cada ronda carga entre 3 y 6 balas (reales o falsas).
- **Objetos Especiales**: Los jugadores pueden usar objetos como cigarrillos (curan vida), lupas (revelan la próxima bala) y cervezas (descartan balas).
- **Gestión de Turnos**: El jugador humano elige acciones (usar objeto o disparar), mientras el dealer actúa aleatoriamente.
- **Sistema de Vida**: Ambos jugadores inician con 5 puntos de vida.

## Preguntas y Respuestas

### Ciclo de Vida del Dato (5b)
- **Generación y Gestión**: 
  - Las balas y objetos se generan al inicio de cada ronda (`generarBalas()`, `generarObjetos()`).
  - Los datos se almacenan en listas mutables (`MutableList<Bala>`, `MutableList<Items<Jugador>>`) y se modifican durante los turnos (ej: `balas.removeFirst()`).
- **Consistencia**: 
  - La integridad se garantiza mediante métodos que actualizan estados directamente (ej: `jugador.vida -= danio`).
- **Futuras Mejoras**: 
  - Implementar persistencia de datos (ej: guardar estadísticas de partidas en JSON o bases de datos).

---

### Almacenamiento en la Nube (5f)
- **Situación Actual**: No se usa almacenamiento en la nube.
- **Alternativas Consideradas**: 
  - Bases de datos locales para simplicidad, pero la nube ofrece mayor escalabilidad y acceso remoto.

---

### Seguridad y Regulación (5i)
- **Medidas Actuales**: 
  - No se manejan datos sensibles, por lo que no hay medidas específicas.
- **Riesgos Potenciales**: 
  - Si se añaden perfiles de usuario, se requeriría cumplir con la protección de datos.
- **Futuras Mejoras**: 
  - En caso de añadir datos sensibles, añadir cifrado y almacenamiento de contraseñas con hash.

---

### Implicación de las THD en Negocio y Planta (2e)
- **Impacto Actual**: 
  - Es un juego, pero su lógica de turnos y gestión de recursos podría adaptarse para:
    - Simuladores de toma de decisiones en entornos industriales.
- **Beneficios Potenciales**: 
  - Mejora de procesos operativos mediante simulación de escenarios críticos.

---

### Mejoras en IT y OT (2f)
- **Integración IT/OT**: 
  - La estructura del juego podría extenderse para automatizar flujos de trabajo (ej: aprobación de tareas en cadena).
- **Automatización**: 
  - Usar la lógica de balas/objetos para modelar fallos en sistemas industriales y pruebas de resistencia.

---

### Tecnologías Habilitadoras Digitales (2g)
- **Tecnologías Usadas**: 
  - **Kotlin**: Lenguaje moderno con soporte para POO y funciones de alto orden.
- **Futuras THD**: 
  - **APIs REST**: Para guardar puntuaciones en línea.
  - **Machine Learning**: Mejorar la IA del dealer (ej: predecir elecciones del jugador).

---

## Cómo Ejecutar
1. Clona el repositorio.
2. Abre el proyecto en IntelliJ IDEA o un IDE compatible con Kotlin.
3. Ejecuta `Main.kt` y sigue las instrucciones del menú.

## Requisitos
- Kotlin 1.8+
- JVM 11+

¡Diviértete jugando a **BuckShot Roulette**! 🎮
