package modelo;

public class ModeloSuma {
    private int num1;
    private int num2;
    private int resultado;

    public ModeloSuma(){}



    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public void sum(){
        this.resultado = this.num1 + this.num2;
    }
    
    
}
