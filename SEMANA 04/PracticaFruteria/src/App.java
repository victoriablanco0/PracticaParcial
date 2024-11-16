import com.coti.tools.Esdia;

import datos.Producto;

public class App {
    public static void main(String[] args) throws Exception {
            int numeroProductos=Esdia.readInt("Introduzca el numero de productos que vende la fruteria: ");
            Producto[] productos = new Producto[numeroProductos];

            String separador = "+" + "-".repeat(120) + "+";

            for (int i = 0; i < numeroProductos; i++) {
                String nombreProducto = Esdia.readString("Introduzca el nombre del producto: ");
                double precioProducto = Esdia.readDouble("Introduzca el precio SIN IVA del producto");
                double cantidadProducto = Esdia.readDouble("Introduzca cuantos kilos va a comprar: ");
                productos[i] = new Producto(nombreProducto, precioProducto);
                productos[i].setCantidad(cantidadProducto);
            }

            mostrarTicket(productos);
    }


    private static void mostrarTicket(Producto[] productos){
        String separador = "+" + "-".repeat(120) + "+";
        System.out.println(separador);
        System.out.println("| Cliente" + " ".repeat(112) + "|");
        System.out.println(separador);
        for (Producto producto : productos) { // recorrer el array productos
            System.out.println(String.format("| %-20.20s | %-10.2f %10.10s | %35.35s %10.2f | %20.2f   |", producto.getNombre(), producto.getCantidad(), "kg", "precio Kg con IVA ", producto.getPrecioConIva(), producto.getPrecioTotalConIVA()  ));
            
        }
        double total =0;
        for(Producto producto:productos){
            total +=producto.getPrecioTotalConIVA();
        }
        System.out.println(separador);
        System.out.println(String.format("|  Total con Iva  %20.20d ", total));
        System.out.println(separador);

    }
}
