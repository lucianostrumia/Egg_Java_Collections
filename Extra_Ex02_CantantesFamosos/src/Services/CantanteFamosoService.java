package Services;

import Entities.CantanteFamoso;

import java.util.ArrayList;
import java.util.Iterator;

public class CantanteFamosoService {

    public CantanteFamoso ingresarCantante(String cant, String disco){

        return new CantanteFamoso(cant, disco);
    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> list){

        System.out.println("---------------------------");
        for (CantanteFamoso aux: list) {
            System.out.println("Cantante: "+aux.getNombre()+". Disco mas vendido: "+aux.getDiscoMasVendido());
        }
        System.out.println("---------------------------");
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> list, String cant){

        Iterator<CantanteFamoso> it = list.iterator();

        while (it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(cant)){
                it.remove();
            }
        }
    }

    public boolean buscarCantante(ArrayList<CantanteFamoso> list, String cant){

        boolean existe = false;
        for (CantanteFamoso aux: list) {
            if (aux.getNombre().equalsIgnoreCase(cant)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
}
