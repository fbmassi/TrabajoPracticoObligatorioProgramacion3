# Trabajo Práctico Obligatorio de Programación III: Backtracking
## Generador de Palabras con Backtracking

Este repositorio contiene un algoritmo en Java para generar todas las posibles combinaciones de palabras dentro de un rango específico de longitud, utilizando conjuntos predefinidos de letras. El proyecto emplea la técnica de backtracking para explorar sistemáticamente configuraciones válidas de palabras.

## Introducción

El lenguaje humano se ha desarrollado a lo largo de milenios, formando un vasto conjunto de palabras mediante combinaciones de letras. Este proyecto aborda la necesidad de generar palabras dentro de un rango de longitud determinado, respetando conjuntos específicos de letras proporcionados como entrada.

## Funcionamiento del Algoritmo

El algoritmo `generarPalabras` se implementa utilizando la técnica de backtracking, lo que permite construir palabras paso a paso y podar ramas que exceden la longitud máxima deseada. Aquí se resume el flujo y las características clave del algoritmo:

1. **Inicialización y Configuración**: Se inicia con la función `descubrirPalabrasDeLaHumanidad`, que establece los parámetros iniciales para la generación de palabras.

2. **Generación de Palabras**: Para cada longitud de palabra en el rango especificado (desde `rangoDesde` hasta `rangoHasta`), se llama a `generarPalabras`. Esta función construye todas las combinaciones posibles de palabras utilizando los conjuntos de letras proporcionados.

3. **Backtracking**:
   - **Construcción de Palabras**: Comienza con una palabra vacía y agrega letras recursivamente. Cuando se alcanza la longitud objetivo de la palabra, se agrega al conjunto de resultados.
   - **Poda**: Se detiene la exploración de ramas cuando la longitud de la palabra excede `rangoHasta`, optimizando así el proceso.
   - **Recursividad**: Explora todas las combinaciones posibles de letras para cada posición de la palabra, manteniendo el orden de los conjuntos de letras.

4. **Resultados**: Al finalizar todas las iteraciones y llamadas recursivas, la lista `resultado` contiene todas las palabras generadas dentro del rango especificado.

![](Imagenes/"Captura de pantalla 2024-06-22 a la(s) 12.23.22 a. m.")

## Análisis de Complejidad Temporal Teórica y Práctica

El análisis de complejidad temporal del algoritmo se desglosa como sigue:

### Teórica

Dado el análisis de las operaciones realizadas y la estructura recursiva del algoritmo, la complejidad temporal se estima como `

[IMAGEN]

donde \( L \) representa el número de letras en los conjuntos de letras analizados.

### Práctica

La clase de prueba `AlgoritmoLenguajeDeLaHumanidadImplTest` evalúa el rendimiento del método `descubirPalabrasDeLaHumanidad`. Las pruebas muestran que el algoritmo mantiene tiempos de ejecución consistentemente eficientes para diferentes tamaños de entrada (5, 10, 50, 100 palabras).

| Tamaño de Entrada | Tiempo Promedio (s) |
|--------------------|---------------------|
| 5 Palabras         | 0.0016              |
| 10 Palabras        | 0.0020              |
| 50 Palabras        | 0.0018              |
| 100 Palabras       | 0.0556              |

### Conclusiones

Basado en los resultados obtenidos, el algoritmo es efectivo para generar una variedad significativa de palabras dentro de los parámetros establecidos. Se observa eficiencia en términos de tiempo de ejecución para volúmenes moderados de datos de entrada. Sin embargo, podría tener limitaciones en complejidad temporal al enfrentarse a grandes volúmenes de datos.

