import Entities.Alumno;
import Services.AlumnoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AlumnoService as = new AlumnoService();
        String cond = "S";
        boolean alumnoNoSeEncuentra = true;

        as.crearAlumnos();

        System.out.println("-------Calcular promedios-------");

        while (cond.equalsIgnoreCase("s")) {
            System.out.println("Ingrese alumno");
            String alumnoPromediado = input.nextLine();

            for (Alumno alu: as.getListaAlumnos()) {
                if (alu.getNombre().equalsIgnoreCase(alumnoPromediado)) {
                    System.out.println("El promedio final de "+alu.getNombre()+" es: "+as.notaFinal(alu));
                    alumnoNoSeEncuentra = false;
                    break;
                }
            }
            if (alumnoNoSeEncuentra) {
                System.out.println("El alumno no se encuentra en la lista");
            }
            System.out.println("------------");

            do {
                System.out.println("Desea ingresar otro alumno? (S/N)");
                cond = input.nextLine();
            } while (!cond.equalsIgnoreCase("s") && !cond.equalsIgnoreCase("n"));
        }
    }
}