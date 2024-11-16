import com.coti.tools.Esdia;

import datos.Persona;

public class App {
   /*  public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Tom");
        Persona p2 = new Persona("Dick");
        Persona p3 = new Persona("Harry");

        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
        System.out.println(p3.getNombre());
       
    }*/


    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[3];    //[..... , ..... , .....]  crea la lista de 3 posiciones para personas

        for (int index = 0; index < personas.length; index++) {
// en java el array empieza en 0, luego tenemos [0], [1] y [2]
            personas[index] = new Persona();
            String promptNombre = String.format("Ingrese el nombre de la persona %d: \n", index+1);
            String nombre = Esdia.readString_ne(promptNombre);
            personas[index].setNombre(nombre);

            //String.format es lo mismo que printf
            String promptPeso = String.format("Ingrese el peso de la persona %s: \n", personas[index].getNombre());
            double peso = Esdia.readDouble(promptPeso);
            personas[index].setPeso(peso);       
            
            String promptTalla = String.format("Ingrese la talla de la persona %s: \n", personas[index].getNombre());
            double talla = Esdia.readDouble(promptTalla);
            personas[index].setTalla(talla);

        }


        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre());
        }


        Persona masAlta = personas[0];
        Persona masPesada = personas[0];

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getTalla() > masAlta.getTalla()) {
               masAlta = personas[i];
            
            }
            if (personas[i].getPeso() > masPesada.getPeso()) {
                   masPesada = personas[i];
            }
            
            
            
      
        }


                



        System.out.println("La persona mas alta es: " + masAlta.getNombre() + "con altura de " + masAlta.getTalla());
        System.out.println("La persona mas pesada es: " + masPesada.getNombre() + "con peso de " + masPesada.getPeso());


    }

    
}
