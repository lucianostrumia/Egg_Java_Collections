import Services.DogBreedsServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DogBreedsServices dbs = new DogBreedsServices();

        String opt = "S";

        while (opt.equalsIgnoreCase("S")) {

            System.out.println("Ingrese una raza de perros");
            String raza = input.nextLine();
            dbs.agregarRaza(raza);
            System.out.println("Desea ingresar otra raza? (S/N)");
            opt = input.nextLine();
        }

        dbs.mostrarLista();
        System.out.println("");

        System.out.println("Ingrese una raza a eliminar de la lista:");
        String razaEliminar = input.nextLine();

        dbs.eliminarRaza(razaEliminar);
        System.out.println("");

        dbs.mostrarLista();


    }
}