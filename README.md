
---

# 📚 **Análisis de algoritmos** 💻

## 🧠 **Unidad 1**

### ❓ **Algoritmos**

**¿Qué son los algoritmos?**
Los algoritmos son un conjunto de reglas para efectuar algún cálculo, bien sea a mano, o más frecuentemente en una máquina. 🤖

**¿Para qué sirve un algoritmo?**
Son útiles para:

- **Automatizar tareas**: Permite que las computadoras realicen tareas repetitivas sin intervención.
- **Resolver problemas**: Ofrecen soluciones sistemáticas a problemas complejos, como ordenar listas de datos o buscar información.
- **Optimizar tareas**: Ayudan a mejorar la eficiencia de procesos y reducir el tiempo necesario para completar las tareas.
- **Desarrollar software**: Son la base sobre la cual se construyen programas y aplicaciones.

En esencia, los algoritmos permiten que la tecnología funcione de manera ordenada y efectiva, facilitando muchas de las tareas que realizamos a diario. ⚙️

---

## 🧩 **Partes de un algoritmo**:

1. **Entrada**: Los datos o información que el algoritmo necesita para empezar. 📥
2. **Proceso**: Las instrucciones o pasos que se seguirán para transformar la entrada en salida. 🔄
3. **Salida**: El resultado final del algoritmo después de procesar la entrada. 📤
4. **Condiciones**: Decisiones lógicas que determinan el flujo del algoritmo. 🛤️

---

## 🔍 **Tipos de algoritmos**:

1. **Algoritmos de búsqueda**: Utilizados para encontrar elementos en una colección de datos, como por ejemplo una búsqueda binaria.
2. **Algoritmos de ordenamiento**: Se usan para organizar datos en orden específico, como por ejemplo ordenamiento por burbuja o quicksort.
3. **Algoritmos de cifrado**: Se utilizan para proteger datos mediante encriptación.
4. **Algoritmos de optimización**: Buscan la mejor solución posible para problemas complejos, como por ejemplo los algoritmos genéticos.
5. **Algoritmos de clasificación**: Agrupan datos en categorías predefinidas, como por ejemplo los algoritmos de clasificación en machine learning.

---

## 🤖 **Algoritmia**
Es el estudio de los algoritmos.

- La ciencia que permite evaluar los efectos de factores externos sobre los algoritmos disponibles.
- La ciencia que indica la forma de diseñar un nuevo algoritmo para una tarea concreta.

**En conclusión podemos decir que:**

- La algoritmia estudia las propiedades de los algoritmos y nos ayuda a elegir la solución más adecuada en cada situación.
- Es una buena elección para ahorrar **tiempo** y **dinero** 💸.
- Es una buena elección ya que marca la diferencia entre poder resolver un problema y no poder hacerlo. 🤯

---

## ⚡ **Eficiencia de algoritmos**
Un algoritmo debe ser rápido y usar la menor cantidad de recursos. Es una relación entre los recursos consumidos, principalmente tiempo y memoria, versus los productos obtenidos.

La eficiencia de algoritmos se refiere a qué tan bien realiza su tarea utilizando la menor cantidad posible de recursos, como tiempo de ejecución y memoria. En pocas palabras, se podría decir que es lograr el propósito del algoritmo de manera rápida y con un uso óptimo de recursos. ⏱️

---

## 🧮 **Análisis de algoritmos**
Fue creado por **Donald Knuth** y se refiere al proceso de encontrar la complejidad computacional de un algoritmo que resuelve un problema computacional dado, con el objetivo de proporcionar estimaciones teóricas de los recursos que necesita.

---

## 🧐 **Tipos de análisis**

1. **Análisis teórico** 📊
   Consiste en analizar el comportamiento del algoritmo en función de su rendimiento bajo condiciones extremas, como el tamaño máximo de entrada. Utiliza notaciones O(n) para describir la complejidad temporal y espacial.

   **Su función es:**
   - Predecir el comportamiento de un algoritmo sin necesidad de correrlo.
   - Comparar algoritmos de forma general.
   - Diseñar programas más eficientes desde el principio.
   - Entender los límites de un algoritmo, por ejemplo, saber si va a funcionar bien con millones de datos.

   **Ejemplo de análisis teórico:**
   ```python
   for i in range(n):
       print(i)
   ```
   El ciclo **for** se repite **n** veces. Cada impresión (`print`) toma un tiempo constante. Entonces, el tiempo total depende directamente de **n**.

   **Conclusión teórica:**
   El algoritmo tiene una complejidad de **O(n)**.
   *(Se lee: “orden de n”, o sea, si duplicas los datos, el tiempo también más o menos se duplica).*

   👉 **No hicimos pruebas, solo usamos lógica. Eso es análisis teórico.**

---

2. **Análisis empírico** 🖥️
   Es una forma de evaluar en la práctica, es decir, ejecutándolo realmente y observando qué tan bien funciona.

   **Su función principal es:**
   - Medir el rendimiento real de un algoritmo.
   - Detectar problemas que en teoría no se veían (como cuellos de botella o lentitud).
   - Comparar varios algoritmos para saber cuál funciona mejor en la práctica.

   **Ejemplo:**
   Imagina que tienes dos algoritmos para ordenar una lista de números:
   
   - **Algoritmo A** y **Algoritmo B**.

   Entonces haces el análisis empírico así:

   - Creas 3 listas: una con 10 números, otra con 1000, y otra con 1,000,000.
   - Ejecutas **Algoritmo A** y **Algoritmo B** en cada lista.
   - Mides cuánto tiempo tarda cada uno en terminar.
   - Anotas los resultados.

   | Tamaño de la lista | Tiempo A | Tiempo B |
   |--------------------|----------|----------|
   | 10 elementos       | 0,001 s  | 0,001 s  |
   | 1000 elementos     | 0,5 s    | 0,3 s    |
   | 1.000.000 de elementos | años 30 | 10 segundos |

   **Conclusión:** El **algoritmo B** es más rápido que el A para listas grandes.

   👉 **Eso es hacer un análisis empírico.**

---

### 📊 **Comparativa: Análisis teórico vs. Empírico**

| Característica     | Análisis teórico          | Análisis empírico        |
|--------------------|---------------------------|--------------------------|
| **¿Qué es?**        | Estudio matemático y lógico del algoritmo, sin ejecutarlo. | Estudio práctico, ejecutando el algoritmo para ver resultados reales. |
| **¿Cómo se hace?**  | Se analiza el código y se calcula su comportamiento con notación Big O. | Se mide el tiempo real, memoria usada y otros recursos al ejecutar el programa. |
| **¿Para qué sirve?**| Predecir el comportamiento ideal o esperado del algoritmo. | Ver cómo se comporta el algoritmo en una computadora real. |
| **¿Qué se estudia?**| Tiempo de ejecución en función de la entrada, consumo de espacio (teórico). | Tiempos de ejecución reales, consumo de memoria real. |
| **¿Ventaja?**       | No depende de la computadora ni de condiciones externas. | Permite descubrir problemas que la teoría no muestra. |
| **¿Desventaja?**    | A veces no predice comportamientos especiales. | Depende del hardware, software y puede variar. |

---

### 🧮 **Tipos de análisis:**

- **Peor caso**: Indica el mayor tiempo obtenido, considerando todas las entradas posibles.
- **Mejor caso**: Indica el menor tiempo obtenido, considerando todas las entradas posibles.
- **Medios** (Caso promedio): Indica el tiempo medio obtenido, considerando todas las entradas posibles.

---

## 🔢 **Notación Matemática en Algoritmos**

**Símbolos y conceptos importantes:**

- **Cálculo proposicional**: Trata con proposiciones (frases que pueden ser verdaderas o falsas).
  - **Variable booleana**: Puede ser **True** o **False**.
  - **Conjunción (AND ∧)**: Verdadero si ambos son verdaderos.
  - **Disyunción (OR ∨)**: Verdadero si al menos uno es verdadero.
  - **Negación (NOT ¬)**: Cambia verdadero a falso y viceversa.

- **Fórmulas booleanas**: Se construyen combinando variables, constantes (**True**, **False**), conectores y paréntesis.

- **Números e intervalos**:
  - **Z**: Conjunto de números enteros {..., -2, -1, 0, 1, 2, ...}.
  - **N**: Conjunto de números naturales (0, 1, 2, 3, ...).

- **Funciones y relaciones**:
  - **Función**: Asigna un valor de salida a cada entrada (como **f(x) = x²**).
  - **Relación**: Conecta elementos entre dos conjuntos (por ejemplo, "ser mayor que").

- **Cuantificadores**:
  - **∀ (para todo)**: Algo es cierto para todos los elementos.
  - **∃ (existe)**: Hay al menos un elemento para el cual es cierto.

- **Sumas y productos**:
  - **Σ (suma)**: Sumar muchos valores (ej: **Σ i=1 a 5 → 1+2+3+4+5**).
  - **Π (producto)**: Multiplicar muchos valores.

- **Logaritmos**:
  - **Logaritmo (log)**: Es el exponente al que debes elevar una base para obtener un número.
  - Ejemplo: **log₂(8) = 3**, porque **2³ = 8**.

---

