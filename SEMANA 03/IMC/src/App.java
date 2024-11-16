import com.coti.tools.Esdia;

import datos.Person;
import datos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
    Person[] personas = new Person[3];
    
        for(int i=0; i<personas.length; i++){
        personas[i]=new Person();

        String nombre = Esdia.readString("Introduzca el nombre de la persona: \n");
        personas[i].setNombre(nombre);

        double peso = Esdia.readDouble("Introduzca el peso de la persona: ");
        personas[i].setPeso(peso);

        double altura = Esdia.readDouble("Introduzca la altura de la persona: ");
        personas[i].setAltura(altura);  
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre());
        }
        Person masAlto=personas[0];
        Person masPesado=personas[0];
          

        for(int i = 0; personas.length<i;i++) {
        
        
                if(personas[i].getAltura()>masAlto.getAltura()){
            masAlto=personas[i];
            }
            if(personas[i].getPeso()>masPesado.getPeso()){
            masPesado=personas[i];
            }               

        }

        System.out.println("La persona mas alta es: " + masAlto.getNombre() + " con una altura de: " + masAlto.getAltura());
        System.out.println("La persona mas pesada es: " + masPesado.getNombre() + " con un pesp de: " + masPesado.getPeso());

        for(int i=0; i<personas.length; i++){
        System.out.println("El imc de la persona es " + personas[i].getPeso()/Math.pow(personas[i].getTalla(), 2));
        }
    }
}
