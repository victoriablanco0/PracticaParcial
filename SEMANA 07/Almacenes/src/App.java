import controlador.AlmacenesControlador;
import modelo.ALmacenesModelo;
import vista.AlmacenesVista;

public class App {
    public static void main(String[] args) throws Exception {
        AlmacenesVista vista = new AlmacenesVista();
        ALmacenesModelo modelo = new ALmacenesModelo();
        AlmacenesControlador controlador = new AlmacenesControlador(vista, modelo);

        controlador.run();
    }
}
