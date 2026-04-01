

---

# HilosGalgos 🐕

Simulación de una carrera de galgos utilizando **hilos en Java** (`Thread`).

## Descripción

Este proyecto modela una carrera entre tres galgos que corren de forma concurrente. Cada galgo se ejecuta en su propio hilo y, al finalizar su tiempo de carrera, se registra automáticamente en la clasificación final.

## Estructura del proyecto

```
HilosGalgos/
├── src/
│   ├── CarreraGalgos.java   # Clase principal (main)
│   ├── Galgo.java           # Clase que extiende Thread e implementa Corredor
│   └── Corredor.java        # Interfaz con los métodos getNombre() y correr()
└── .gitignore
```

## Tecnologías

- Java (JDK 8 o superior)
- Programación concurrente con `Thread`
- Sincronización con `synchronized`

## Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/SoNataLiia/HilosGalgos.git
   ```
2. Compila los archivos Java:
   ```bash
   javac src/*.java
   ```
3. Ejecuta el programa:
   ```bash
   java -cp src CarreraGalgos
   ```
4. Introduce el tiempo de carrera en milisegundos cuando se solicite.

## Ejemplo de uso

```
Introduce el tiempo de carrera en milisegundos: 
1000
Niki ha llegado en posición 1
Mika ha llegado en posición 2
Tina ha llegado en posición 3

Clasificación final:
Niki
Mika
Tina
```

> El orden de llegada puede variar en cada ejecución, ya que depende del planificador de hilos del sistema operativo.

## Conceptos clave

- **`Thread`**: cada galgo es un hilo independiente.
- **`synchronized`**: garantiza que la clasificación se actualice sin condiciones de carrera (*race conditions*).
- **`join()`**: el hilo principal espera a que todos los galgos terminen antes de mostrar la clasificación.

## Autora

**SoNataLiia** — Nataliia Sokhatska

---

Puedes pegar este contenido directamente en un archivo `README.md` en la raíz de tu repositorio desde GitHub (botón **Add a README**).
