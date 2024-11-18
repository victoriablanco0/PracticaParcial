package controlador;

import javax.swing.text.View;

import modelo.ModeloSuma;
import vista.VistaSuma;

public class ControladorSuma {
    ModeloSuma model;
    VistaSuma view;

public ControladorSuma(VistaSuma view, ModeloSuma model){
    this.view=view;
    this.model=model;

    this.view.setControlador(this);
}
public void run(){
    this.view.showMenu();
}

public void guardarNumeros(int primerNumero, int segundoNumero){
    model.setNum1(primerNumero);
    model.setNum2(segundoNumero);
}

public void calcularSuma(){
    model.sum();
}
public int getPrimerNumero(){
    return model.getNum1();
}

public int getSegundoNumero(){
    return model.getNum2();
}

public int getResultado(){
    return model.getResultado();
}

//getters y setters de controladorsuma
public ModeloSuma getModel() {
    return model;
}
public void setModel(ModeloSuma model) {
    this.model = model;
}
public VistaSuma getView() {
    return view;
}
public void setView(VistaSuma view) {
    this.view = view;
}



}
