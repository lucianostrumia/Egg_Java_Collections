package Services;

import Entities.Libro;

import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    private Scanner input = new Scanner(System.in);

    public boolean chequearStock(HashSet<Libro> libros, String tit) {

        boolean operacion = false;
        for (Libro aux : libros) {
            if (aux.getNombre().equalsIgnoreCase(tit)) {
                operacion = prestamo(aux);
            }
        }
        if (!operacion){
            System.out.println("No se encuentra un libro con el nombre ingresado.");
        }
        return operacion;
    }

    public boolean prestamo(Libro lib) {

        boolean prestamo = false;

        if ((lib.getNumeroDeEjemplares() - lib.getNumeroDeEjemplaresPrestados()) > 0) {
            lib.setNumeroDeEjemplaresPrestados(lib.getNumeroDeEjemplaresPrestados() + 1);
            prestamo = true;
        } else {
            System.out.println("No tenemos ejemplares de ese libro para prestar.");
        }
        return prestamo;
    }

    public boolean chequearDevolucion(HashSet<Libro> libros, String tit) {

        boolean operacion = false;
        for (Libro aux : libros) {
            if (aux.getNombre().equalsIgnoreCase(tit)) {
                operacion = devolucion(aux);
            }
        }
        if (!operacion){
            System.out.println("No se encuentra un libro con el nombre ingresado.");
        }
        return operacion;
    }

    public boolean devolucion(Libro lib) {

        boolean prestamo = false;

        if (lib.getNumeroDeEjemplaresPrestados() > 0) {
            lib.setNumeroDeEjemplaresPrestados(lib.getNumeroDeEjemplaresPrestados() - 1);
            prestamo = true;
        } else {
            System.out.println("No hemos prestado ningun ejemplar de ese libro.");
        }
        return prestamo;
    }

    public void mostrarLibros(HashSet<Libro> lista){

        System.out.println("-------------------");
        for (Libro aux: lista) {
            System.out.println(aux.toString());
        }
        System.out.println("-------------------");
    }
}
