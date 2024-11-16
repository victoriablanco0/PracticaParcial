import datos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
       Persona persona = new Persona();
        System.out.println("El nombre es " + persona.getNombre() + " , la altura es " + + persona.getAltura() + " y el peso es " + persona.getPeso());

    }
}
