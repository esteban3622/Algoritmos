# Algoritmos 

## Introducción al Curso de Algoritmos

El curso de **Algoritmos** tiene como propósito fundamental brindar a los estudiantes las herramientas conceptuales y prácticas necesarias para el diseño y construcción de soluciones computacionales a través de estructuras lógicas y lenguajes de programación. Esta asignatura se posiciona como una base esencial en la formación de profesionales en ingeniería y tecnología, al permitir la comprensión y aplicación de técnicas de resolución de problemas mediante algoritmos claros, estructurados y eficientes.

### 🎯 Intención del curso

Este curso busca desarrollar en el estudiante la capacidad de **analizar problemas**, **diseñar algoritmos** utilizando pseudocódigo y diagramas de flujo, y posteriormente **implementarlos en un lenguaje de programación**. Se espera que el estudiante adquiera competencias fundamentales en el uso de estructuras de control, tipos de datos, métodos y principios de diseño algorítmico orientado a la solución de problemas reales.

### 🧠 Objetivos

- Comprender los fundamentos teóricos y prácticos de los algoritmos.
- Representar soluciones mediante diagramas de flujo y pseudocódigo.
- Implementar algoritmos utilizando estructuras de control básicas como decisiones y ciclos.
- Aplicar técnicas de modularización con el uso de métodos.
- Fomentar el pensamiento lógico, la capacidad de abstracción y el trabajo en equipo.

### 📌 Alcances del curso

Al finalizar el curso, el estudiante será capaz de:
- Resolver problemas usando sentencias de decisión, repetición y estructuras básicas de control.
- Diseñar programas sencillos que involucren operaciones lógicas, aritméticas y de control de flujo.
- Estructurar código reutilizable y documentado mediante métodos o funciones.
- Aplicar principios de buenas prácticas en programación desde etapas tempranas del desarrollo.

### 🗂️ Temas a tratar

El curso se estructura en tres etapas formativas principales:

1. **Etapa de Reconocimiento**
   - Diagnóstico de saberes previos.
   - Conceptos básicos de operadores y expresiones.

2. **Etapa de Contextualización**
   - Introducción a la algoritmia.
   - Representación gráfica (diagramas de flujo) y textual (pseudocódigo).
   - Tipos de datos, variables, constantes y uso de operadores.
   - Primeros programas secuenciales en lenguaje de programación.

3. **Etapa de Profundización**
   - Estructuras de decisión (if, switch).
   - Estructuras de repetición (while, for, do-while).
   - Algoritmos con variables de control: contadores, acumuladores, banderas.
   - Iteraciones controladas por condiciones o rangos.

4. **Etapa de Transferencia**
   - Diseño de algoritmos modulares mediante métodos o funciones.
   - Métodos con y sin retorno, con y sin parámetros.
   - Aplicaciones de casos reales mediante estudio de caso y solución computacional.

---

### 🥸 Códigos

En esta sección se encuentran los diferentes fragmentos de código y programas construidos a lo largo del curso de Algoritmos. Cada ejercicio está diseñado para reforzar los conceptos aprendidos en clase y aplicar las estructuras lógicas fundamentales en la programación de soluciones a problemas cotidianos.

Los ejemplos están organizados por temática para facilitar su consulta y reutilización. Cada subcarpeta contiene ejemplos, ejercicios y soluciones relacionadas con el tema central, además de comentarios que explican el propósito de cada bloque de código.

#### ❓ Condicionales

Esta sección presenta ejemplos del uso de estructuras condicionales, las cuales permiten que un programa tome decisiones basadas en condiciones lógicas. Los condicionales son esenciales para el control del flujo de ejecución en un programa, y se utilizan para ejecutar distintos bloques de código dependiendo de si una condición es verdadera o falsa.

Los ejemplos cubren desde condiciones simples hasta múltiples condiciones anidadas y validaciones de entrada del usuario.

Se incluyen tres tipos principales de condicionales:

* (`if`): Ejecuta un bloque de código si se cumple una condición.
    - [Sistema de Descuentos en una Tienda](https://github.com/esteban3622/Algoritmos/blob/main/Code/Conditionals/SistemaDescuentosTienda.java)
    - [Verificación de Acceso de Usuario](https://github.com/esteban3622/Algoritmos/blob/main/Code/Conditionals/VerificacionAccesoUsuario.java)
    - [Cálculo de Tarifa de Taxi](https://github.com/esteban3622/Algoritmos/blob/main/Code/Conditionals/CalculoTarifaTaxi.java)
    - [Clasificación de un estudiante según su nota](https://github.com/esteban3622/Algoritmos/blob/main/Code/Conditionals/ClasificacionEstudiante.java)
* (`if-else`): Permite ejecutar un bloque de código si se cumple una condición y otro diferente si no se cumple.
    - [Menú de restaurante](https://github.com/esteban3622/Algoritmos/blob/main/Code/Conditionals/MenuRestauranteIf.java)
* (`switch-case`): Se utiliza para seleccionar entre múltiples bloques de código, dependiendo del valor de una variable.
    - [Menú de restaurante](https://github.com/esteban3622/Algoritmos/blob/main/Code/Conditionals/MenuRestauranteSwitch.java)

#### 🔄 Ciclos

Los ciclos permiten repetir un bloque de código múltiples veces, ya sea mientras se cumpla una condición o durante un número determinado de veces. Los códigos aquí presentados permiten entender cómo se realizan conteos, sumatorias, búsqueda de elementos, validación de entradas, entre otras tareas repetitivas.

Esta subsección contiene ejemplos que ilustran el uso de las principales estructuras de repetición:

* (`for`): Útil cuando se conoce de antemano el número de repeticiones. Se usa comúnmente para recorrer rangos numéricos o estructuras como arreglos.
    - [Cuenta de seguridad](https://github.com/esteban3622/Algoritmos/blob/main/Code/Loops/CuentaBloqueadaSeguridadFor.java)
* (`while`): Ejecuta un bloque de código mientras una condición sea verdadera. Es útil cuando no se sabe con certeza cuántas veces se debe repetir el proceso.
    - [Calculador con menú](https://github.com/esteban3622/Algoritmos/blob/main/Code/Loops/CalculadorWhile.java)
    - [Tablas de múltiplicar](https://github.com/esteban3622/Algoritmos/blob/main/Code/Loops/TablasMultiplicarWhile.java)
* (`do-while`): Similar a `while`, pero garantiza que el bloque de código se ejecutará al menos una vez, ya que la condición se evalúa después de la primera iteración.

#### 🧩 Métodos
Los métodos (o funciones) son bloques de código reutilizables que se pueden invocar para ejecutar una tarea específica. Esta subsección contiene ejemplos de:

Métodos con o sin parámetros, dependiendo de si reciben o no valores de entrada.

Métodos con o sin valor de retorno, dependiendo de si devuelven o no un resultado después de su ejecución.

A través de estos ejercicios se refuerza el concepto de modularidad, que permite dividir un programa en partes más pequeñas, organizadas y reutilizables, mejorando la claridad, mantenimiento y escalabilidad del código.