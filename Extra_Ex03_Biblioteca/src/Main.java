import Entities.Libro;
import Services.LibroService;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashSet<Libro> listaLibros = new HashSet();
        LibroService ls = new LibroService();

        String cond = "S";

        while (cond.equalsIgnoreCase("s")){
            Libro aux = new Libro();
            System.out.println("Ingrese el titulo del libro:");
            aux.setNombre(input.nextLine());
            System.out.println("Ingrese el autor:");
            aux.setAutor(input.nextLine());
            System.out.println("Ingrese la cantidad de copias:");
            aux.setNumeroDeEjemplares(input.nextInt());
            System.out.println("Ingrese la cantidad de copias prestadas:");
            aux.setNumeroDeEjemplaresPrestados(input.nextInt());
            input.nextLine();
            listaLibros.add(aux);

            do {
                System.out.println("Desea ingresar otro libro? (S/N)");
                cond = input.nextLine();
            } while (!cond.equalsIgnoreCase("S") && !cond.equalsIgnoreCase("N"));
        }

        System.out.println("");
        ls.mostrarLibros(listaLibros);

        int opt = 0;

        while (opt != 3) {
            System.out.println("");
            System.out.println("------- Que desea realizar? -------");
            System.out.println("1- Tomar libro prestado.");
            System.out.println("2- Retornar libro.");
            System.out.println("3- Salir.");
            opt = input.nextInt();
            input.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Que libro desea tomar prestado?");
                    String libroAPrestar = input.nextLine();
                    Boolean prest = ls.chequearStock(listaLibros, libroAPrestar);
                    if (prest) {
                        System.out.println("Prestamo autorizado");
                    }
                    ls.mostrarLibros(listaLibros);
                    break;
                case 2:
                    System.out.println("Que libro desea devolver");
                    String libroADevolver = input.nextLine();
                    Boolean devol = ls.chequearDevolucion(listaLibros, libroADevolver);
                    if (devol) {
                        System.out.println("Gracias por devolver el libro");
                    }
                    ls.mostrarLibros(listaLibros);
                    break;
                default:
                    break;
            }
        }
    }
}