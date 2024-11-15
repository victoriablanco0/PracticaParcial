import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console consoleRef = System.console();
        System.out.println("Introduce el año actual:");
        String anioatualStr = consoleRef.readLine();
        int anioatual = Integer.parseInt(anioatualStr);

        System.out.println("introduce el año de nacimiento");
        String nacimientoStr = consoleRef.readLine();
        int nacimiento = Integer.parseInt(nacimientoStr);

        int edad = anioatual-nacimiento;
        System.out.println("Su edad es: " + edad);

    }
}
