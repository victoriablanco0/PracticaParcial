package controlador;

import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

public class CalculadoraControlador {

    CalculadoraVista vista;
    CalculadoraModelo modelo;
    public CalculadoraControlador(CalculadoraVista vista, CalculadoraModelo modelo){
        this.vista = vista;
        this.modelo = modelo;

        this.vista.setControlador(this);
    }

    
    public void run(){
        this.vista.mostrarMenu();
    }

    public void guardarNumeros(int primerNumero, int segundoNumero){
        modelo.setNum1(primerNumero);
        modelo.setNum2(segundoNumero);
    }

    public void calcularSuma(){
        modelo.sum();
    }

    public int getPrimerNumero(){
        return modelo.getNum1();
    }

    public int getSegundoNumero(){
        return modelo.getNum2();
    }

    public int getResultado(){
        return modelo.getResultado();
    }



    //getters y setters del metodo CalculadoraControlador
    public CalculadoraModelo getModelo() {
        return modelo;
    }
    public CalculadoraVista getVista() {
        return vista;
    }
    public void setModelo(CalculadoraModelo modelo) {
        this.modelo = modelo;
    }
    public void setVista(CalculadoraVista vista) {
        this.vista = vista;
    }


}
