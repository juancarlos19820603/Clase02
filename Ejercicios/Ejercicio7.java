/*
 ## Ejercicio 7: Calculadora Básica
Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola.

 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
       
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el primer número
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        
        // Solicitar al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Realizar las operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;
        
        // Comprobar si el segundo número es diferente de cero para la división
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (numero2 != 0) {
            System.out.println("División: " + division);
        }

        // Cerrar el scanner
        scanner.close();
    }
}

