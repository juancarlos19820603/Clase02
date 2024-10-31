/*
 ## Ejercicio 9: Conversión de Temperaturas
Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
```
Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15
```

 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
      
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca la temperatura en Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Calcular la temperatura en Fahrenheit y Kelvin
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        // Mostrar los resultados
        System.out.printf("Temperatura en Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura en Kelvin: %.2f K%n", kelvin);

        // Cerrar el scanner
        scanner.close();
    }
}

