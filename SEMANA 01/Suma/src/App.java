import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerRef = new Scanner(System.in);
        System.out.println("Introduzca el primer entero");
        int num1 = scannerRef.nextInt();
        System.out.println("Introduzca el segundo entero");
        int num2 = scannerRef.nextInt();
        int suma = num1 +num2;
        System.out.println("La suma de ambos es = " + suma);
        

    }
}
