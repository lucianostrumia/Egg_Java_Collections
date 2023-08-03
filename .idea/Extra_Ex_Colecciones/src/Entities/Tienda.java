package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    private Scanner read = new Scanner (System.in);

    public ArrayList <Producto>Venta( ArrayList <Producto> produs){

        System.out.println("Ingrese el nombre del producto que busca.");
        boolean estaba = false;
        String nombre = read.nextLine();
        nombre = nombre.toLowerCase();

        for (int i = 0; i < produs.size(); i++) {

            if (produs.get(i).getNombre().contains(nombre)) {
                estaba = true;
                if (produs.get(i).getCantEnInventario() != 0) {
                    produs.get(i).setCantEnInventario(produs.get(i).getCantEnInventario() - 1);
                    System.out.println("Compraste un/a "+produs.get(i).getNombre()+", pagaste: "+produs.get(i).getPrecio());
                }
                else {
                    System.out.println("No tenemos stock campeón" );
                }
            }
        }
        if (!estaba) {
            System.out.println("no tenemos ese producto.");
        }

        return produs;
    }

    public ArrayList<Producto> reposicion(ArrayList<Producto> produs) {

        System.out.println("Ingrese el nombre del producto que quiere reponer.");
        boolean estaba = false;
        String nombre = read.nextLine();
        nombre = nombre.toLowerCase();

        for (int i = 0; i < produs.size(); i++) {

            if (produs.get(i).getNombre().contains(nombre)) {
                System.out.println("Ingrese la cantidad a aumentar en stock");
                int cant = read.nextInt();

                estaba = true;
                produs.get(i).setCantEnInventario(produs.get(i).getCantEnInventario() + cant);
                System.out.println("Cantidad de "+produs.get(i).getNombre()+" incrementada en "+cant);
            }
        }
        if (!estaba) {
            System.out.println("no tenemos ese producto.");
        }
        return produs;
    }


}
