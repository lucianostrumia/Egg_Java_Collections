import Services.NumeroService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        NumeroService ns = new NumeroService();

        boolean stop;

        System.out.println("Ingrese numeros para insertar en la lista:");
        System.out.println("(Si desea detenerse, inserte el numero -99 que dara fin al agregado.)");
        do {
            int num = input.nextInt();
            stop = ns.validarNumero(num);
            if (!stop) {
                ns.ingresarNumero(num);
            } else {
                ns.mostrarValores();
            }
        } while (!stop);

    }
}