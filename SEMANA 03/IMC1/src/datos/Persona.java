package datos;

public class Persona {

    private String nombre;
    private double peso;
    private double talla;


    public Persona() {
        //hola soy un constructor vacio
        }

  

    public Persona (String paramNombre){
            this.nombre = paramNombre;
        }


    public String getNombre() {
            return nombre;
        }
    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    public double getPeso() {
            return peso;
        }
    public void setPeso(double peso) {
            this.peso = peso;
        }


    public double getTalla() {
            return talla;
        }  
        
    public void setTalla(double talla) {
            this.talla = talla;
        }
}
