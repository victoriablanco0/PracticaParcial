import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerRef = new Scanner(System.in);
        System.out.println("Introduzca la edad");
        int edad = scannerRef.nextInt();
        // No consume el salto de línea

        // Consumir el salto de línea sobrante
        scannerRef.nextLine();

        System.out.println("Introduzca el nombre");
        String nombre = scannerRef.nextLine();

        System.out.println("El nombre es " + nombre + " y la edad es " + edad);
    }

}
