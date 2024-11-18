import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.coti.tools.Esdia;

import datos.Libros;

public class App {
    private static HashMap<String, Libros> libros = new HashMap<>();
    public static void main(String[] args) throws Exception {
        boolean salir=false;
        while(!salir){
            mostrarMenu();
            
            int opcion = Esdia.readInt("Introduzca la opcion deseada: ");
            switch (opcion) {
                case 1:
                    leerLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    modificarLibro();
                    break;
                case 4:
                    listarLibro();
                    break;
                case 5:
                    salir = true;
                    break;            
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }


       

    }

    public static void mostrarMenu(){
        System.out.println("1.- Crear un libro: ");
        System.out.println("2.- Eliminar un libro: ");
        System.out.println("3.- Modificar un libro: ");
        System.out.println("4.- Listar un libro: ");
        System.out.println("5. Salir");
    }

    public static void leerLibro(){
        String titulo = Esdia.readString("Introduce el titulo del libro: ");
        double precio = Esdia.readDouble("Introduzca el precio del libro: ");
        String isbn = Esdia.readString("Inrtoduzca el isbn del libro: ");
        libros.put(isbn, new Libros(titulo, precio));
    }

    public static void eliminarLibro(){
        String isbn = Esdia.readString("Introduzca el isbn del libro a eliminar: ");
        if(libros.containsKey(isbn)){
            libros.remove(isbn);
            System.out.println("Libro con isbn: " +isbn+" eliminado con éxito");
        }else{System.out.println("Libro no encontrado");}
    }

    public static void modificarLibro(){
        String isbn = Esdia.readString("Introduzca el isbn del libro a modificar: ");
        if(libros.containsKey(isbn)){
            String nuevoTitulo = Esdia.readString("Introduzca el nuevo titulo: ");
            double nuevoPrecio = Esdia.readDouble("Introduzca el nuevo precio del libro: ");
            libros.put(isbn,new Libros(nuevoTitulo, nuevoPrecio));               
            
            System.out.println("Libro con isbn: " +isbn+" modificado con éxito");
        }else{System.out.println("Libro no encontrado");}
    }

    public static void listarLibro(){
        if(libros.isEmpty()){
            System.out.println("No hay libros para listar: ");
        }

        for(Map.Entry<String, Libros> entry : libros.entrySet()){
            String isbn = entry.getKey();
            Libros value = entry.getValue();
            System.out.println(String.format("isbn: %9s -%s", isbn, value.lineaLibro()));
        }
    }
}
