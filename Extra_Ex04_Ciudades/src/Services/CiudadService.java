package Services;

import Entities.Ciudad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadService {

    Ciudad listaCiudades = new Ciudad();
    private Scanner input = new Scanner(System.in);

    public void agregarCiudad(){

        System.out.println("Ingrese el codigo postal de la ciudad:");
        int cP = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el nombre de la ciudad:");
        String nom = input.nextLine();
        listaCiudades.getCiudades().put(cP, nom);
    }

    public void mostrarCiudades(){

        System.out.println("-----------------------");
        for (Map.Entry<Integer, String> aux : listaCiudades.getCiudades().entrySet()) {
            System.out.println(aux.getKey()+": "+aux.getValue());
        }
        System.out.println("-----------------------");
    }

    public boolean mostrarCiudad(int codigo){

        boolean seEncontro = false;
        System.out.println("-----------------------");
        for (Map.Entry<Integer, String> aux : listaCiudades.getCiudades().entrySet()) {
            if (aux.getKey() == codigo) {
                System.out.println(aux.getKey()+": "+aux.getValue());
                seEncontro = true;
            }
        }
        System.out.println("-----------------------");
        return seEncontro;
    }

    public void eliminarCiudades(){

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el codigo postal de la ciudad a eliminar numero "+(i+1)+":");
            listaCiudades.getCiudades().remove(input.nextInt());
        }
    }


}
