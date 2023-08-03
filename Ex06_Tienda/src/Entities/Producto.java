package Entities;

import java.util.HashMap;

public class Producto {

    private HashMap<String, Double> productos = new HashMap();

    public Producto() {
    }

    public Producto(HashMap<String, Double> productos) {
        this.productos = productos;
    }

    public HashMap<String, Double> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Double> productos) {
        this.productos = productos;
    }
}
