import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerRef = new Scanner(System.in);
        System.out.printf("Introduce el año actual: ");
        int anioActual = scannerRef.nextInt();


        System.out.printf("Introduce el año de nacimiento: ");
        int nacimiento = scannerRef.nextInt();
        int edad = anioActual - nacimiento;
        System.out.printf("la edad de la persona es %d", edad);
    }
}
