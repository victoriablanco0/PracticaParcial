package modelo;

import controlador.AlmacenesControlador;

public class ALmacenesModelo {
    private int[][] ventas;
    private double[] precios;
    private double ingresos;


public void AlmacenesModelo(){};




    //getters y setters
    public int[][] getVentas() {
        return ventas;
    }
    public void setVentas(int[][] ventas) {
        this.ventas = ventas;
    }
    public double[] getPrecios() {
        return precios;
    }
    public void setPrecios(double[] precios) {
        this.precios = precios;
    }
    public double getIngresos() {
        return ingresos;
    }
    public void setInrgesos(double ingesos) {
        this.ingresos = ingresos;
    }

    
    
    
}
