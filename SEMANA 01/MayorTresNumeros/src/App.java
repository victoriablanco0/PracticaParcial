import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerRef = new Scanner(System.in);

        System.out.println("Introduzca el primer enetero ");
        int num1 = scannerRef.nextInt();
        System.out.println("Introduzca el segundo enetero ");
        int num2 = scannerRef.nextInt();
        System.out.println("Introduzca el tercer enetero ");
        int num3 = scannerRef.nextInt();
        int mayor = num1;

        if(num2>= num1){
            mayor = num2;
            if(num3>=num2){
                mayor=num3;
            }
        }
        System.out.println("el mayor de los tres numeros es " + mayor);
    }
}
