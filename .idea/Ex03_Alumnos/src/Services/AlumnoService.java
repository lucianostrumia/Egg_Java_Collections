package Services;

import Entities.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    private Scanner input = new Scanner(System.in);

    ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void crearAlumnos() {

        String crear = "S";

        while (crear.equalsIgnoreCase("s")) {
            Alumno aux = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            aux.setNombre(input.nextLine());

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota n° "+(i+1)+" de "+aux.getNombre());
                aux.getNotas().add(input.nextInt());
                input.nextLine();
            }

            listaAlumnos.add(aux);

            do {
                System.out.println("Desea crear otro alumno? (S/N)");
                crear = input.nextLine();
            } while (!crear.equalsIgnoreCase("s") && !crear.equalsIgnoreCase("n"));
        }
    }
    public int notaFinal(Alumno a){

       int promedio = (a.getNotas().get(0) + a.getNotas().get(1) + a.getNotas().get(2)) / 3;

       return promedio;
    }

}
