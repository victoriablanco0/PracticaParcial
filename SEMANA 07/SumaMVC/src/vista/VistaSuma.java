package vista;

import java.util.EnumSet;

import com.coti.tools.Esdia;

import controlador.ControladorSuma;

public class VistaSuma {
    ControladorSuma controlador;

    public void showMenu(){
        boolean salir = false;
    while(!salir){
       
    System.out.println("1.- Leer los números");
    System.out.println("2.- Calcular la suma");
    System.out.println("3.- Mostrar el resultado");
    System.out.println("4.- Salir");
    int n = Esdia.readInt("Introduzca la opcion deseada");

    switch (n) {
        case 1:
        leerNumeros();
            break;
        
        case 2:
        calcularSuma();
        break;

        case 3:
        mostrarResultado();
        break;
        
        case 4: 
        salir = true;
        break;

        default: System.out.println("Opcion no valida");
            break;
    }
        
    } 
    }



    public void leerNumeros(){
        int primerNumero = Esdia.readInt("Introduzca el primer numero: ");
        int segundoNumero = Esdia.readInt("Introduzca el segundo numero: "); 
        controlador.guardarNumeros(primerNumero, segundoNumero);

    }

    public void calcularSuma(){
        controlador.calcularSuma();
    }

    public void mostrarResultado(){
        System.out.println("el resultado es " + controlador.getResultado());
    }

    public void setControlador(ControladorSuma controladorSuma){
        this.controlador = controladorSuma;
    }





    
}

