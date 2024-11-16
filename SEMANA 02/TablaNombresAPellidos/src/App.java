import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
    String nombre = Esdia.readString("Introduzca su nombre");
    String apellidos = Esdia.readString("Introduzca los apellidos");

    int longitudNombre = nombre.length();
    int longitudApellidos = apellidos.length();
    int anchoNombre = Math.max("Nombre".length(), longitudNombre);
    int anchoApellidos = Math.max("Apellidos".length(), longitudApellidos);

    int anchoTotal = anchoNombre + anchoApellidos + 7; // con bordes y espacios

  

    imprimirSeparador(anchoTotal);
    imprimirFila("Nombre", "Apellidos", anchoNombre, anchoApellidos);
    imprimirSeparador(anchoTotal);
    imprimirFila(nombre, apellidos, anchoNombre, anchoApellidos);
    imprimirSeparador(anchoTotal);

}


    public static void imprimirSeparador(int anchoTotal){
    for(int i=0; i<anchoTotal; i++){
        System.out.printf("*");
    }
    System.out.println();
    } 
  
    public static void imprimirFila(String textoIzquierda, String textoDerecha, int anchoIzquierda, int anchoDerecha) {
        System.out.printf("* %-" + anchoIzquierda + "s * %-" + anchoDerecha + "s *\n", textoIzquierda, textoDerecha);
    }

}