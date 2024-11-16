public class App {
    public static void main(String[] args) throws Exception {
        if(args.length != 2){
            System.err.println("ERROR: debe haber ezactamente 2 argumenos");
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double suma = num1+num2;

        System.out.println("La suma es " + suma);
        } catch (NumberFormatException e) {

            
        }
    }
}
