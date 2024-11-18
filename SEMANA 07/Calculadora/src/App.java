import com.coti.tools.Esdia;

import controlador.CalculadoraControlador;
import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("CALCULADORA");
       CalculadoraVista vista = new CalculadoraVista();
       CalculadoraModelo modelo = new CalculadoraModelo();
       CalculadoraControlador controlador = new CalculadoraControlador(vista, modelo);

       controlador.run();

    }
}
