package Services;

import Entities.Numero;

import java.util.Scanner;

public class NumeroService {

    private Scanner input = new Scanner(System.in);

    Numero listaNumeros = new Numero();

    public void ingresarNumero(int n){

        listaNumeros.getLista().add(n);
    }

    public boolean validarNumero(int n){

        return n == (-99);
    }

    public void mostrarValores(){

        System.out.println("Se han ingresado "+listaNumeros.getLista().size()+" numeros a la lista.");
        int suma = 0;
        for (int aux: listaNumeros.getLista()) {
            suma+=aux;
        }
        System.out.println("Los numeros ingresados suman "+suma+".");
        System.out.println("Y el promedio de todos ellos es "+suma/(listaNumeros.getLista().size()));
    }
}
