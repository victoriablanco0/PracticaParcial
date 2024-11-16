package datos;

public class Producto {
    private String nombre;
    private double precio;
    private double cantidad;
    private final double IVA = 0.21;

    public Producto (String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioConIva(){
        final double IVA=0.21;
        return precio*(1+IVA);
    }

    public double getPrecioTotal(){
        return cantidad*getPrecioConIva();
    }

    public double getPrecioTotalConIVA(){
        return (precio*cantidad*(1+IVA));
    }

}
