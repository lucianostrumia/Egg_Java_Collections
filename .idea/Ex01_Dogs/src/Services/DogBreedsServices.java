package Services;

import Entities.DogBreeds;
import java.util.Iterator;

public class DogBreedsServices {

    DogBreeds lista = new DogBreeds();

    public void agregarRaza(String r){

        lista.getBreeds().add(r);
    }
    public void mostrarLista (){

        System.out.println("-----Lista de razas-----");
        for (String aux: lista.getBreeds()) {
            System.out.println("-" + aux);
        }
    }
    public void eliminarRaza(String r){

        Iterator<String> it = lista.getBreeds().iterator();
        boolean noEsta = false;

        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equalsIgnoreCase(r)) {
                it.remove();
                noEsta = true;
            }
        }

        if (!noEsta) {
            System.out.println("La raza no se encuentra en la lista.");
        }
    }
}
