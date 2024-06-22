# Trabajo Práctico Obligatorio de Programación III: Backtracking
## Generador de Palabras con Backtracking

Este repositorio contiene un algoritmo en Java para generar todas las posibles combinaciones de palabras dentro de un rango específico de longitud, utilizando conjuntos predefinidos de letras. El proyecto emplea la técnica de backtracking para explorar sistemáticamente configuraciones válidas de palabras.

## Introducción
El lenguaje humano ha evolucionado a lo largo de milenios, conformando un extenso alfabeto de letras que se combinan para formar palabras de variadas longitudes. Estas palabras, a su vez, constituyen el tejido del universo lingüístico en el que nos comunicamos y expresamos ideas. En este contexto, surge la necesidad de desarrollar algoritmos capaces de explorar y generar todas las combinaciones
posibles de palabras dentro de un rango específico de longitud, utilizando conjuntos predeterminados de letras. 
El objetivo de este trabajo es diseñar un algoritmo basado en la técnica de Backtracking para encontrar todas las palabras posibles que se puedan formar con letras provenientes de N conjuntos, respetando un rango de longitud de X a Y letras. Este enfoque permite generar palabras de manera sistemática y eficiente,
respetando las restricciones impuestas por los conjuntos de letras y los límites de longitud. Primero, desarrollaremos nuestra estrategia para abordar el problema, considerando las particularidades y desafíos que presenta. A continuación, presentaremos el pseudocódigo que formaliza la solución propuesta, seguido de un
análisis detallado de la complejidad teórica del algoritmo. Por último, implementaremos el algoritmo en Java y realizaremos pruebas empíricas para verificar si la complejidad temporal observada coincide con la teórica.

## Descripción del Problema
Diseñar un algoritmo utilizando la técnica Backtracking para encontrar todas las palabras posibles de X a Y letras, donde X e Y son los límites del rango de la longitud de las palabras a encontrar.

Entrada:
- Dos números enteros X e Y, que representan el rango de longitud de las palabras a generar y N conjuntos de letras, donde cada conjunto representa las posibles letras en una posición específica de la palabra.

Salida:
- Todas las palabras posibles que se pueden formar utilizando las letras de los conjuntos dados y que tengan una longitud en el rango de X a Y (X ≤ longitud de la palabra ≤ Y).

## Técnica de Backtracking
Backtracking es una técnica algorítmica para resolver problemas recursivamente construyendo una solución de pieza en pieza y removiendo soluciones que fallan en cumplir los criterios del problema en cualquier punto del tiempo. Es particularmente útil para problemas que requieren la generación de todas las configuraciones posibles de un conjunto dado, como el problema de generación de palabras en este caso.

## Estrategia de Resolución
El algoritmo utilizará la técnica de backtracking para generar todas las posibles combinaciones de letras que forman palabras dentro del rango de longitud especificado. La idea es construir las palabras de forma recursiva, agregando una letra a la vez y retrocediendo cuando se alcanza una longitud.

## Funcionamiento del Algoritmo
El algoritmo `generarPalabras` se implementa utilizando la técnica de backtracking, lo que permite construir palabras paso a paso y podar ramas que exceden la longitud máxima deseada. Aquí se resume el flujo y las características clave del algoritmo:

1. **Inicialización y Configuración**: Se inicia con la función `descubrirPalabrasDeLaHumanidad`, que establece los parámetros iniciales para la generación de palabras.

2. **Generación de Palabras**: Para cada longitud de palabra en el rango especificado (desde `rangoDesde` hasta `rangoHasta`), se llama a `generarPalabras`. Esta función construye todas las combinaciones posibles de palabras utilizando los conjuntos de letras proporcionados.

3. **Backtracking**:
   - **Construcción de Palabras**: Comienza con una palabra vacía y agrega letras recursivamente. Cuando se alcanza la longitud objetivo de la palabra, se agrega al conjunto de resultados.
   - **Poda**: Se detiene la exploración de ramas cuando la longitud de la palabra iguala `longitudObjetivo`, optimizando así el proceso.
   - **Recursividad**: Explora todas las combinaciones posibles de letras para cada posición de la palabra, manteniendo el orden de los conjuntos de letras.

4. **Resultados**: Al finalizar todas las iteraciones y llamadas recursivas, la lista `resultado` contiene todas las palabras generadas dentro del rango especificado.

![](Imagenes/pseudocodigo)

## Análisis de Complejidad Temporal Teórica y Práctica

El análisis de complejidad temporal del algoritmo se desglosa como sigue:

### Teórica
La función generarPalabras es recursiva y se llama L veces en el peor de los casos, siendo L la cantidad de letras que tiene el conjunto que estamos analizando. Por lo tanto, podemos estimar…
- A = L, ya que se llama L veces a la función, siendo L el número de letras que tiene la etapa que estamos analizando. Este número muy probablemente sea mayor a 1.
- B = 1, ya que en cada llamado recursivo se reduce en uno la entrada, siendo esta nuestros conjuntos de letras posibles.
- K = 0, ya que el peor de los costos externos a la función recursiva son constantes.

Como se trata de una resta, la complejidad temporal se define por:

![](Imagenes/matrizResta)

Esta función cae en el caso A > 1. Por lo tanto, la complejidad temporal, en el peor de los casos es igual a…

![](Imagenes/complejidad1)

donde \( L \) representa el número de letras en los conjuntos de letras analizados.

También hay que tener en cuenta que la función recursiva ocurre dentro de otro ciclo que se repite (Y – X + 1) veces en la función principal y que el costo de ejecutar ‘generarPalabras’ no es el mismo para cada longitud deseada. Por lo tanto, la complejidad temporal total la podemos calcular como...

![](Imagenes/complejidadFinal)

### Práctica
La clase de prueba `AlgoritmoLenguajeDeLaHumanidadImplTest` evalúa el rendimiento del método `descubirPalabrasDeLaHumanidad`. Las pruebas muestran que el algoritmo mantiene tiempos de ejecución consistentemente eficientes para diferentes tamaños de entrada (5, 10, 50, 100 palabras).

![](Imagenes/resultados)

### Conclusiones
Basado en los resultados obtenidos del algoritmo descubirPalabrasDeLaHumanidad, se puede concluir que es efectivo para generar una variedad significativa de palabras dentro de los parámetros establecidos. En particular, se observó que al emplear conjuntos específicos de letras, se pueden crear cantidades variadas de palabras que cumplen con criterios específicos de longitud y combinación de letras.
Sin embargo, es importante reconocer la necesidad de ajustar los parámetros para lograr que se genere una cantidad de palabras deseada. Basado en los resultados de la medición de la complejidad temporal para los diferentes casos de prueba en el estudio del algoritmo descubirPalabrasDeLaHumanidad, se pueden las siguientes observaciones:
 - Consistencia de los tiempos: los tiempos de ejecución para generar las
palabras se mantienen relativamente estables en los casos en que se
generan 5, 10 y 50 palabras.
 - Complejidad temporal: se observa que conforme aumenta el número de palabras generadas (de 5 a 100 palabras), los tiempos de ejecución aumentan de manera gradual y se mantienen consistentemente eficientes en los casos de 5, 10 y 50 palabras.
Nos resultó llamativo que el promedio de la complejidad temporal para generar 10 palabras sea mayor que el que se obtuvo para generar 50 palabras. Esto sugeriría que Este patrón sugiere que el
algoritmo es eficiente para volúmenes moderados de datos de entrada, manteniendo tiempos de ejecución relativamente bajos, constantes y predecibles.
Sin embargo, es importante destacar que al generar 100 palabras, la complejidad temporal experimenta un aumento significativo, respecto a los valores promedio anteriores. Esto podría indicar que el
algoritmo tiene limitaciones en cuanto a eficiencia para manejar grandes cantidades de datos
de entrada.
Para sintetizar: destacamos que el método utilizado para generar palabras de acuerdo con los criterios establecidos. Sin embargo, se observa que podría tener limitaciones en términos de complejidad temporal al enfrentarse a volúmenes grandes de datos de entrada. Es fundamental seguir evaluando el rendimiento del método con diversas variaciones en los parámetros de entrada para optimizar su eficiencia.
