package Entities;

import java.util.Objects;

public class Pais implements Comparable<Pais>{

    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
