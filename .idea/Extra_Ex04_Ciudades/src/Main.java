import Services.CiudadService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CiudadService cs = new CiudadService();

        System.out.println("");
        System.out.println("Ingrese 10 ciudades, ingresando primero su codigo postal seguido de su nombre:");
        for (int i = 0; i < 10; i++) {
            cs.agregarCiudad();
        }
        cs.mostrarCiudades();

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("");
            System.out.println("------------Que desea realizar?------------");
            System.out.println("1- Agregar una ciudad.");
            System.out.println("2- Mostrar lista de ciudades.");
            System.out.println("3- Buscar una ciudad por codigo postal.");
            System.out.println("4- Eliminar 3 ciudades.");
            System.out.println("5- Salir.");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    cs.agregarCiudad();
                    break;
                case 2:
                    cs.mostrarCiudades();
                    break;
                case 3:
                    System.out.println("Ingrese el codigo postal de la ciudad a buscar:");
                    boolean busqueda = cs.mostrarCiudad(input.nextInt());
                    if (!busqueda){
                        System.out.println("No se encuentra una ciudad con ese codigo postal en la lista.");
                    }
                    break;
                case 4:
                    cs.eliminarCiudades();
                    break;
                default:
                    break;
            }
        }
    }
}
;