package Services;

import Entities.Pais;

import java.util.*;


public class PaisService {

    private Scanner input = new Scanner(System.in);
    Set<Pais> paises = new HashSet<>();

    public void ingresarPais(){

        String opt = "S";

        while (opt.equalsIgnoreCase("s")){
            System.out.println("Ingrese un pais");
            paises.add(new Pais(input.nextLine()));

            do {
                System.out.println("Desea ingresar otro pais?");
                opt = input.nextLine();
            } while (!opt.equalsIgnoreCase("s") && !opt.equalsIgnoreCase("n"));
        }
        mostrarPaises();
    }

    public void mostrarPaises(){

        System.out.println("----------------");
        for (Pais aux: paises) {
            System.out.println(aux.getNombre());
        }
        System.out.println("----------------");
    }

    public void mostrarPaisesAlfab(){

        TreeSet<Pais> paisesOrdenadosAlfab = new TreeSet<>(paises);
        System.out.println("----------------");
        for (Pais aux: paisesOrdenadosAlfab) {
            System.out.println(aux.getNombre());
        }
        System.out.println("----------------");
    }

    public boolean buscarPais(String p) {

        boolean seEncontro = false;

        for (Pais aux: paises) {
            if (aux.getNombre().equalsIgnoreCase(p)){
                seEncontro = true;
            }
        }
        return seEncontro;
    }

    public void eliminarPais(String p){

        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()){
            if (it.next().getNombre().equals(p)) {
                it.remove();
            }
        }
    }
}
