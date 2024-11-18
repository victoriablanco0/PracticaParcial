import controlador.ControladorSuma;
import modelo.ModeloSuma;
import vista.VistaSuma;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CALCULADORA");
        ModeloSuma model = new ModeloSuma();
        VistaSuma view = new VistaSuma();
        ControladorSuma controlador = new ControladorSuma(view, model);
       

        controlador.run();
    }
}
