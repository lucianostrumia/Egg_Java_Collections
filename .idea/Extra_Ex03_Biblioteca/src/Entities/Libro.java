package Entities;

public class Libro {

    private String nombre;
    private String autor;
    private int numeroDeEjemplares;
    private int numeroDeEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String nombre, String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumeroDeEjemplaresPrestados() {
        return numeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(int numeroDeEjemplaresPrestados) {
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDeEjemplares=" + numeroDeEjemplares +
                ", numeroDeEjemplaresPrestados=" + numeroDeEjemplaresPrestados +
                '}';
    }
}
