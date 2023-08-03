package Entities;

public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int cantEnInventario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int cantEnInventario) {
        this.nombre = nombre.toLowerCase();
        this.categoria = categoria;
        this.precio = precio;
        this.cantEnInventario = cantEnInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantEnInventario() {
        return cantEnInventario;
    }

    public void setCantEnInventario(int cantEnInventario) {
        this.cantEnInventario = cantEnInventario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", cantEnInventario=" + cantEnInventario +
                '}';
    }
}
