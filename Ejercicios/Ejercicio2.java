/*
## Ejercicio 2: ¿Ves algún error en el precio?

En el mercado, podemos encontrar que el precio del producto **Pernil Iberic D'Engreix Llen. Azuaga** en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto. 

Análisis del Problema
Si el precio de 100 gramos es 5,95 €, entonces el precio de un kilogramo (1000 gramos) debería ser: 5,95€×10=59,5€
Esto significa que el precio correcto por kilogramo debería ser 59,5 €, no 29,75 € como indica el vendedor. Así que el precio indicado es incorrecto.

 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    
                // Precio por 100 gramos
                double precioPor100Gramos = 5.95;
        
                // Calcular el precio por kilo
                double precioPorKiloCalculado = precioPor100Gramos * 10;
        
                // Precio proporcionado por el vendedor
                double precioPorKiloVendedor = 29.75;
        
                // Imprimir los resultados
                System.out.println("Precio calculado por kilo: " + precioPorKiloCalculado + " ");
                System.out.println("Precio por kilo proporcionado por el vendedor: " + precioPorKiloVendedor + " ");
        
                // Verificar si el precio es correcto
                if (precioPorKiloCalculado == precioPorKiloVendedor) {
                    System.out.println("El precio proporcionado por el vendedor es correcto.");
                } else {
                    System.out.println("El precio proporcionado por el vendedor es incorrecto.");
                }
            }
        }
        

