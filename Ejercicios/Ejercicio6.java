/*
 ## Ejercicio 6: ¿Qué precio tenían antes del descuento?

En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo. Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante el mes de septiembre.

Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento?

 */


public class Ejercicio6 {
    public static void main(String[] args) {
      
                // Precio pagado después del descuento
                double precioPagado = 34.00;
        
                // Descuento del 15%
                double porcentajeDescuento = 0.15;
        
                // Calcular el precio original
                double precioOriginal = precioPagado / (1 - porcentajeDescuento);
        
                // Imprimir el resultado
                System.out.printf("El precio original antes del descuento era: %.2f", precioOriginal);
            }
        }