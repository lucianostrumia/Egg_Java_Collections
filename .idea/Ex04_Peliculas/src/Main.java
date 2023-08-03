import Services.PeliculaService;
import Utilities.Comparadores;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PeliculaService ps = new PeliculaService();

        int opt;

        System.out.println("");
        System.out.println("-----Bienvenidos a Cinema Strike-----");

        do {
            System.out.println("Que desea realizar?:");
            System.out.println("1-Cargar peliculas.");
            System.out.println("2-Mostrar peliculas.");
            System.out.println("3-Mostrar solo peliculas con duracion mayor a 2 horas.");
            System.out.println("4-Mostrar peliculas por su duracion, de mayor a menor.");
            System.out.println("5-Mostrar peliculas por su duracion, de menor a mayor.");
            System.out.println("6-Mostrar peliculas por titulo, ordenadas alfabeticamente");
            System.out.println("7-Mostrar peliculas por director, ordenadas alfabeticamente");
            System.out.println("0-Salir.");
            opt = input.nextInt();
            input.nextLine();

            switch (opt) {
                case 1:
                    ps.crearPeliculas();
                    break;
                case 2:
                    if (ps.getPeliculas().isEmpty()){
                        System.out.println("No hay peliculas cargadas");
                        break;
                    }
                    ps.mostrarPeliculas();
                    break;
                case 3:
                    if (ps.getPeliculas().isEmpty()){
                        System.out.println("No hay peliculas cargadas");
                        break;
                    }
                    ps.mostrarPeliculasMayoresADosHoras();
                    break;
                case 4:
                    if (ps.getPeliculas().isEmpty()){
                        System.out.println("No hay peliculas cargadas");
                        break;
                    }
                    Collections.sort(ps.getPeliculas(), Comparadores.ordenarPorDuracionOrdenDesc);
                    ps.mostrarPeliculas();
                    break;
                case 5:
                    if (ps.getPeliculas().isEmpty()){
                        System.out.println("No hay peliculas cargadas");
                        break;
                    }
                    Collections.sort(ps.getPeliculas(), Comparadores.ordenarPorDuracionOrdenAsc);
                    ps.mostrarPeliculas();
                    break;
                case 6:
                    if (ps.getPeliculas().isEmpty()){
                        System.out.println("No hay peliculas cargadas");
                        break;
                    }
                    Collections.sort(ps.getPeliculas(), Comparadores.ordenarPorTitulo);
                    ps.mostrarPeliculas();
                    break;
                case 7:
                    if (ps.getPeliculas().isEmpty()){
                        System.out.println("No hay peliculas cargadas");
                        break;
                    }
                    Collections.sort(ps.getPeliculas(), Comparadores.ordenarPorDirector);
                    ps.mostrarPeliculas();
                    break;
                case 0:
                    break;
            }
        } while (opt != 0);

        System.out.println("Progragrama finalizado, Ciao");
    }
}