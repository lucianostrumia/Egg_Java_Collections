package Services;

import Entities.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {

    private Scanner input = new Scanner(System.in);

    ArrayList<Pelicula> peliculas = new ArrayList();

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void crearPeliculas() {

        String opt = "S";

        while(opt.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el titulo de la pelicula:");
            String tit = input.nextLine();
            System.out.println("Ingrese el director de la pelicula:");
            String dir = input.nextLine();
            System.out.println("Ingrese la duracion (en horas) de la pelicula:");
            Double dur = input.nextDouble();
            input.nextLine();

            peliculas.add(new Pelicula(tit, dir, dur));

            do {
                System.out.println("Desea ingresar otra pelicula? (S/N)");
                opt = input.nextLine();
            } while (!opt.equalsIgnoreCase("S") && !opt.equalsIgnoreCase("N"));
        }
    }

    public void mostrarPeliculas() {

        System.out.println("------------------------");
        for (Pelicula aux: peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("------------------------");
    }

    public void mostrarPeliculasMayoresADosHoras() {

        System.out.println("------------------------");
        for (Pelicula aux: peliculas) {
            if (aux.getDuracion() >= 2.0) {
                System.out.println(aux.toString());
            }
        }
        System.out.println("------------------------");
    }


}
