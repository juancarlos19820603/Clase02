/*
 
## Ejercicio 4: ¿Cuánto se ha gastado Carmen?
La posibilidad de ir al cine entre semana pagando un precio reducido es una tradición en las salas de cine españolas, lo que se conoce como El día del espectador. En algunos cines, el día del espectador suele ser los miércoles y las entradas se reducen hasta en un 70%. La única pega es que suele ir mucha más gente...

Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 23€. Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?

 */

public class Ejercicio4 {
    public static void main(String[] args) {
    
                // Cantidad de dinero que Carmen llevaba y la que le queda
                double dineroInicial = 23.00;
                double dineroRestante = 12.75;
        
                // Calcular cuánto se ha gastado
                double gasto = dineroInicial - dineroRestante;
        
                // Imprimir el resultado
                System.out.printf("Carmen se ha gastado: %.2f ", gasto);
            }
        }
        
        
  