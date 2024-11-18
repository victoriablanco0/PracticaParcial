package controlador;

import modelo.ALmacenesModelo;
import vista.AlmacenesVista;

public class AlmacenesControlador {
    AlmacenesVista vista;
    ALmacenesModelo modelo;

    public AlmacenesControlador(AlmacenesVista vista, ALmacenesModelo modelo){
        this.modelo=modelo;
        this.vista = vista;

        this.vista.setControlador(this);
    }

    public void run(){
        this.vista.mostrarMenu();
    }

    public void calcularIngresos(){
        int[][] ventas = modelo.getVentas();
        double[] precios = modelo.getPrecios();
        double total=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                total += ventas[i][j]*precios[j];              
            }
            
        }
    }

    public void mostrarResultados(int[][] tabla){
        for(int[] fila : tabla){
            for(int valor : fila){
                System.out.println(valor);
            }
        }
    }
}