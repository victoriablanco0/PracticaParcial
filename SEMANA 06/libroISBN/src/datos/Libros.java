package datos;

public class Libros {
    private String titulo;
    private double precio;

public Libros(String titulo, double precio){
    this.titulo=titulo;
    this.precio=precio;
}

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    } 

    public String lineaLibro(){
        return "Libro: titulo: " +titulo+ " y precio: " +precio;
    }
}
