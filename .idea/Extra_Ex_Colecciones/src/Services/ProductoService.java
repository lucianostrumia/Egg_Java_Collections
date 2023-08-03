package Services;

import Entities.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {

    private Scanner leer = new Scanner(System.in);


    public Producto cargarProd() {
        Producto prodAux = new Producto();
        System.out.println("Ingrese el nombre del producto");
        prodAux.setNombre(leer.nextLine());
        System.out.println("Ingrese la categoria del producto");
        prodAux.setCategoria(leer.nextLine());
        System.out.println("Ingrese el precio del producto");
        prodAux.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la cantidad en stock");
        prodAux.setCantEnInventario(leer.nextInt());
        leer.nextLine();
        return prodAux;
    }

    public ArrayList<Producto> crearProductos(ArrayList<Producto> productos) {
        int cantProductos = 3;

        for (int i = 0; i < cantProductos; i++) {
            //carga de valores individuales, con sus validaciones
            productos.add(cargarProd());
        }
        return productos;
    }
    public void mostrarProductos(ArrayList<Producto> produs) {

        for (Producto prod: produs) {
            System.out.println(prod.toString());
        }
    }
}