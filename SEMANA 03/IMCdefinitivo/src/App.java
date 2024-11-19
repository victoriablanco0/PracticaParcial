import com.coti.tools.Esdia;

import datos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
    Persona[] personas = new Persona[3];
    for (int i = 0; i < personas.length; i++) {
        
        String nombre = Esdia.readString("Introduzca el nombre de la persona: ");
        double altura = Esdia.readDouble("Introduzca la altura de la persona: ");
        double peso = Esdia.readDouble("Introduzca el peso de la persona: ");
        personas[i] = new Persona(nombre, altura, peso);
    }
    
    for(int i=0; i<personas.length; i++){
        System.out.println("La persona " +i+ " se llama " + personas[i].getNombre() + " tiene un peso de " +personas[i].getPeso()+ " y una altura de " +personas[i].getAltura());

    }

    Persona masAlto = personas[0];
    Persona masPesado = personas[0];
    for(Persona persona : personas){
        if(masAlto.getAltura()<persona.getAltura()){
            masAlto = persona;
        }
    }

    System.out.println("La persona mas alta es: " + masAlto.getNombre());
    for(Persona persona : personas){
        double imc = calcularIMC(persona.getPeso(),persona.getAltura());
        System.out.println("El imc de la persona es " +imc);
    }
   

    }

    public static double calcularIMC(double peso, double altura){
        return (peso/Math.pow(altura, 2));
    }
}
