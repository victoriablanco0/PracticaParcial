package vista;

import javax.swing.text.html.StyleSheet;

import com.coti.tools.Esdia;

import controlador.AlmacenesControlador;

public class AlmacenesVista {
    final int ALMACENES = 5;
        final int PRODUCTOS = 2;
        
        int[][] ventas = new int[ALMACENES][PRODUCTOS];
        double[] precios = new  double[PRODUCTOS];

    AlmacenesControlador controlador;
    public void mostrarMenu(){
        boolean salir=false;

        while(!salir){
            System.out.println("\nMenú:");
            System.out.println("1.- Leer tabla de ventas");
            System.out.println("2.- Leer tabla de precios");
            System.out.println("3.- Calcular ingresos totales");
            System.out.println("4.- Mostrar resultados");
             System.out.println("5.- Salir");

            int opcion = Esdia.readInt("Introduzca la opcion deseada; ");
            switch (opcion) {
                case 1:
                    leerTablaVentas();
                    break;
                case 2:
                    leerTablaPrecios();
                    break;
                case 3:
                    calcularIngresos();
                    break;
                case 4:
                    mostrarResultados();
                    break;

                default:
                    salir = true;
                    break;
            }
        }
    }

    private void leerTablaVentas(){
        System.out.println("Vamos a leer la tabla de ventas, Introduce las ventas (unidades) para cada almacén y producto: ");
        for(int i=0; i<ALMACENES; i++){
            for(int j=0; j<PRODUCTOS; j++){
                ventas[i][j] = Esdia.readInt("Almacen " +i+1+ "Producto " + j+1+ ": ");
            }

        }
    }

    private void leerTablaPrecios(){
        System.out.println("Vamos a leer la tabla de precios, Introduce el precio para cada producto: ");
        for(int i=0; i<ALMACENES; i++){
            
            precios[i] = Esdia.readInt("Producto " + i+1+ ": ");
            

        }
    }


    private void calcularIngresos(){
        controlador.calcularIngresos();
    }

    private void mostrarResultados(int[][]){
        controlador.mostrarResultados();
    }

    public void setControlador(AlmacenesControlador almacenesControlador){
        this.controlador = almacenesControlador;
    }
}
