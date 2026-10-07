# Taller de Recursividad en Java

## Datos del estudiante

- **Nombre:** [Ximena Talaga Montenegro]
- **Programa:** Ingeniería Informática
- **Asignatura:** Estructura de Datos Lineales 
- **Institución:** Institución Universitaria Colegio Mayor del Cauca

## Descripción del taller

Este taller reúne 14 ejercicios en Java que resuelven problemas de forma **recursiva**, es decir, mediante métodos que se llaman a sí mismos. Cada solución se apoya en dos elementos:

- **Caso base:** la condición que detiene la recursión y devuelve un resultado directo.
- **Caso recursivo:** la llamada del método a sí mismo con un problema más pequeño, que se acerca al caso base.

Los ejercicios cubren operaciones con números, series matemáticas, cadenas, arreglos y matrices.

| # | Ejercicio | Clase |
|---|-----------|-------|
| 1 | Calcular el factorial de un número | `Ejercicio1` |
| 2 | Invertir un número entero (123 → 321) | `Ejercicio2` |
| 3 | Sumatoria de la serie 1 + 1/2 + 1/3 + ... + 1/n | `Ejercicio3` |
| 4 | Sumar los dígitos de un número (123 → 6) | `Ejercicio4` |
| 5 | Sumatoria de 1 hasta el número leído | `Ejercicio5` |
| 6 | Potencia: base elevada al exponente | `Ejercicio6` |
| 7 | Máximo común divisor (algoritmo de Euclides) | `Ejercicio7` |
| 8 | Copiar una cadena en otra | `Ejercicio8` |
| 9 | Cociente de la división entera (restas sucesivas) | `Ejercicio9` |
| 10 | Multiplicación mediante sumas sucesivas | `Ejercicio10` |
| 11 | Suma de los elementos de un arreglo | `Ejercicio11` |
| 12 | Suma de los elementos de una matriz m × n | `Ejercicio12` |
| 13 | Serie de Fibonacci hasta un límite | `Ejercicio13` |
| 14 | Función de Ackermann | `Ejercicio14` |

## Estructura del repositorio

```
Taller-Recursividad/
│
├── src/
│   └── Recursividad/
│       ├── Ejercicio1.java
│       ├── Ejercicio2.java
│       ├── ...
│       └── Ejercicio14.java
│
└── README.md
```

## Requisitos

- **JDK 11 o superior** (Java Development Kit).
- Para comprobarlo, abre una terminal y escribe:

```bash
java -version
javac -version
```

## Instrucciones para ejecutar los programas

### Opción 1: desde la terminal

1. Clona el repositorio (o descárgalo como ZIP):

```bash
git clone https://github.com/<usuario>/Taller-Recursividad.git
```

2. Entra a la carpeta de los ejercicios:

```bash
cd Taller-Recursividad/src/Recursividad
```

3. Compila el ejercicio que quieras ejecutar (o todos a la vez):

```bash
javac Ejercicio1.java
# o, para compilar todos:
javac *.java
```

4. Ejecútalo:

```bash
java Ejercicio1
```

5. Ingresa los datos que pide el programa por consola. Por ejemplo, en el ejercicio 14:

```
Ingrese m: 
3
Ingrese n: 
2
Ackermann(3, 2) = 29
```

### Opción 2: desde Visual Studio Code

1. Instala la extensión **Extension Pack for Java**.
2. Abre la carpeta del proyecto (`Taller-Recursividad`).
3. Abre el archivo del ejercicio que quieras probar, por ejemplo `Ejercicio1.java`.
4. Pulsa el botón **Run** que aparece sobre el método `main`.
5. Escribe los datos en la terminal integrada.

## Ejemplos de prueba

| Ejercicio | Entrada | Salida esperada |
|-----------|---------|-----------------|
| 1 | `5` | `120` |
| 2 | `123` | `321` |
| 4 | `123` | `6` |
| 5 | `5` | `15` |
| 6 | base `2`, exponente `3` | `8` |
| 7 | `48` y `18` | `6` |
| 9 | `17` y `5` | `3` |
| 10 | `7` y `3` | `21` |
| 13 | límite `8` | `0 1 1 2 3 5 8 13 21` |
| 14 | `3` y `2` | `29` |

## Notas

- Cada archivo es independiente y tiene su propio método `main`.
- Los ejercicios validan las entradas que podrían provocar una recursión infinita (por ejemplo, números negativos o divisores iguales a cero).
- La función de Ackermann crece muy rápido: se recomienda usar valores pequeños (`m <= 3`) para evitar un `StackOverflowError`.
