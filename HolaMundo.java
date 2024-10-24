import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hello Juan soy un gran programador");

        System.out.println("Hola Juankiss ");
        System.out.printf("Aqui va una cadena: %s ", "juankiss");
        System.out.printf("Aqui va un numero: %s ", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Juan Carlos", 42);

        var entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombre = entrada.nextLine();
        System.out.print("Ingrese su edad :");
        var entero = entrada.nextInt();
        System.out.print("su nombre es " +nombre);
        System.out.println(" y tiene " +entero+ " años");
       

        entrada.close();

    }
}
