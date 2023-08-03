package Services;

import Entities.Producto;

import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    private Scanner input = new Scanner(System.in);
    Producto listaProductos = new Producto();

    public void agregarProductos(){

        String opt = "S";

        while (opt.equalsIgnoreCase("s")){
            System.out.println("Ingrese el producto");
            String nombre = input.nextLine();
            System.out.println("Ingrese el precio");
            Double precio = input.nextDouble();
            input.nextLine();
            listaProductos.getProductos().put(nombre, precio);

            do {
                System.out.println("Quiere ingresar otro producto? S/N)");
                opt = input.nextLine();
            } while (!opt.equalsIgnoreCase("s") && !opt.equalsIgnoreCase("n"));
        }
    }

    public void mostrarProductos(){

        System.out.println("-------------------------");
        for (Map.Entry<String, Double> aux : listaProductos.getProductos().entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Producto: "+key+". Precio: "+value);
        }
        System.out.println("-------------------------");
    }
    public void eliminarProducto(String p){
        listaProductos.getProductos().remove(p);
    }

    public void modificarPrecio(String p, Double pr){

        for (Map.Entry<String, Double> aux : listaProductos.getProductos().entrySet()) {
            if (aux.getKey().equalsIgnoreCase(p)) {
                aux.setValue(pr);
            }
        }
    }

    public boolean buscarProd(String p){

        return listaProductos.getProductos().containsKey(p);
    }
}
