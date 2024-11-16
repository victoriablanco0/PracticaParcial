package datos;

public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public Persona(){ //valores por defecto que yo considero
        this.nombre="Sin nombre";
        this.altura = 1.70;
        this.peso=70.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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
