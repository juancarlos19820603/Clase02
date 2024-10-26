//Pida tres palabras por parte del usuario y la salida de las tres palabras en la pantalla. Por ejemplo,

/*
Introduzca palabra 1: Adiós
Introduzca palabra 2: y
Introduzca palabra 3: Hola
Adiós y Hola
 */
import java.util.Scanner;

public class TresPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner

        System.out.print("Introduzca palabra 1: ");
        String palabra1 = scanner.nextLine(); // Leer la primera palabra

        System.out.print("Introduzca la palabra 2: ");
        String palabra2 = scanner.nextLine(); //leer la segunda palabra

        System.out.print("Introduzca la palabra 3: ");
        String palabra3 = scanner.nextLine(); //leer la tercera palabra

        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);//Imprimir concatenando las palabras introducidas por el usuario
    }    
}
