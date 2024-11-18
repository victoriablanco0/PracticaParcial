package vista;

import com.coti.tools.Esdia;

import controlador.CalculadoraControlador;

public class CalculadoraVista {

    CalculadoraControlador controlador;

    public void mostrarMenu(){
        boolean salir = false;
        while(!salir){
            System.out.println("1. Leer numeros: ");
            System.out.println("2. Calcular la suma: ");
            System.out.println("3. Mostrar resultado: ");
            System.out.println("4. Salir: ");
            int opcion = Esdia.readInt("Introduzca la opcion deseada: ");

            switch (opcion) {
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
                    System.out.println("Salir");
                    break;
            
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

        private void leerNumeros(){
            int primerNumero = Esdia.readInt("Introduzca el primer numero: ");
            int segundoNumero = Esdia.readInt("Introduzca el segundo numero: ");
            controlador.guardarNumeros(primerNumero, segundoNumero);

        }
        
        private void calcularSuma(){
            controlador.calcularSuma();
        }

        private void mostrarResultado(){
            System.out.println("El resultado es: " + controlador.getResultado());
        }
        
        public void setControlador(CalculadoraControlador calculadoraControlador){
            this.controlador = calculadoraControlador;
        }



}
