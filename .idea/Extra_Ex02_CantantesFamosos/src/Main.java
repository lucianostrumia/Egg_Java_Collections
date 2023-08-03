import Entities.CantanteFamoso;
import Services.CantanteFamosoService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CantanteFamosoService cfs = new CantanteFamosoService();
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un cantante:");
            String cantante = input.nextLine();
            System.out.println("Ingrese su disco con mas ventas:");
            String disco = input.nextLine();
            listaCantantes.add(cfs.ingresarCantante(cantante, disco));
        }
        cfs.mostrarCantantes(listaCantantes);
        System.out.println("");

        int opt;
        do {
            System.out.println("Que desea realizar?");
            System.out.println("---------------------------");
            System.out.println("1- Ingresar otro cantante.");
            System.out.println("2- Mostrar todos los cantantes.");
            System.out.println("3- Eliminar un cantante de la lista.");
            System.out.println("4- Salir.");

            opt = input.nextInt();

            while (opt < 1 || opt > 4) {
                System.out.println("La opcion ingresada es incorrecta, intente nuevamente");
                opt = input.nextInt();
            }
            input.nextLine();

            switch (opt){
                case 1:
                    System.out.println("Ingrese el nombre:");
                    String cantante = input.nextLine();
                    System.out.println("Ingrese su disco con mas ventas:");
                    String disco = input.nextLine();
                    listaCantantes.add(cfs.ingresarCantante(cantante, disco));
                    break;
                case 2:
                    cfs.mostrarCantantes(listaCantantes);
                    break;
                case 3:
                    System.out.println("Ingrese el cantante a eliminar:");
                    String cantanteAEliminar = input.nextLine();
                    boolean validar = cfs.buscarCantante(listaCantantes, cantanteAEliminar);
                    if (validar){
                        cfs.eliminarCantante(listaCantantes, cantanteAEliminar);
                    } else {
                        System.out.println("Ese cantante no existe en la lista.");
                    }
                    break;
                case 4:
                    break;
            }
        } while (opt != 4);
        System.out.println("-----Programa terminado.-----");
    }
}