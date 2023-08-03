import Services.PaisService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        PaisService ps = new PaisService();

        ps.ingresarPais();

        System.out.println("-------Paises ingresados, ordenados alfabeticamente-------");

        ps.mostrarPaisesAlfab();

        String opt = "S";

        while (opt.equalsIgnoreCase("s")){
            System.out.println("");
            System.out.println("Ingrese un pais a eliminar de la lista");
            String paisAEliminar = input.nextLine();

            boolean aux = ps.buscarPais(paisAEliminar);

            if (aux){
                ps.eliminarPais(paisAEliminar);
                ps.mostrarPaises();
            } else {
                System.out.println("No se puede eliminar, ya que el pais no se encontraba en la lista.");
            }
            do {
                System.out.println("");
                System.out.println("Desea eliminar otro pais? (S/N)");
                opt = input.nextLine();
            } while (!opt.equalsIgnoreCase("S") && !opt.equalsIgnoreCase("n"));
        }
        System.out.println("Listo entonces wachin...");
    }
}