package datos;

public class Persona {
    private String nombre;
    private double altura;
    private double peso;


public Persona(String nombre, double altura, double peso){
    this.nombre=nombre;
    this.altura=altura;
    this.peso=peso;
} //constructor


    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nomnbre){
        this.nombre = nombre;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
