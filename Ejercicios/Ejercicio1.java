/*
Ejercicio 1:  6 / 2 ( 1 + 2 )

El orden de los operadores aritméticos es muy importante ya que dependiendo del orden obtenemos un resultado u otro. En programación, el orden de los operadores es el mismo que el utilizado en matemáticas

 * Para resolver este ejercicio en Java, comencemos por analizar el orden de los operadores en la operación matemática 6/2(1+2).
 
 * Paso 1: Evaluación de la Operación Matemática
La expresión original es: 6/2(1+2)
Podemos escribirla de la siguiente manera para entender el orden de operaciones:6/2∗(1+2)

En matemáticas y en la mayoría de los lenguajes de programación, se sigue el orden de operadores PEMDAS:

Paréntesis
Exponentes
Multiplicación y División (de izquierda a derecha)
Adición y Sustracción (de izquierda a derecha)
Primero, resolvemos el paréntesis: 1+2=3

Luego, procedemos con la división y multiplicación de izquierda a derecha:6/2∗3

Aquí, 6 dividido por 2 da 3: 3∗3=9
Por lo tanto, el resultado correcto de la operación es 9.

Paso 2: Diferencias entre Calculadoras
La otra calculadora da un resultado de 1 porque está interpretando la operación de forma diferente. Algunas calculadoras pueden interpretar el número adyacente al paréntesis como un multiplicador más fuerte, es decir, las calculadoras que devuelven 1 están tratando la expresión como: 6/(2∗(1+2))

En este caso, se resuelve el paréntesis y luego la multiplicación dentro del paréntesis: 6/(2∗3)=6/6=1

Implementación en Java
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        int resultado = 6 / 2 * (1 + 2);
        System.out.println("El resultado es: " + resultado);

    }
}