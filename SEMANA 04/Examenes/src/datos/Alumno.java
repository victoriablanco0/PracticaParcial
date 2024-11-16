package datos;

public class Alumno {
    private double parcial1;
    private double parcial2;
    private double evaluacion;
    private double Nota;

    public Alumno(double parcial 1, double parcial2, double evaluacion){
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.evaluacion = evaluacion;
    }
    



    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getParcial1Ponderado(){
        return parcial1*0.1;
    }
    public double getParcial2Ponderado(){
        return parcial2*0.1;
    }
    public double getEvaluacionPonderado(){
        return evaluacion*0.8;
    }
    public double getNota(){
        return getParcial1Ponderado() + getParcial2Ponderado() + getEvaluacionPonderado();
    }


}
