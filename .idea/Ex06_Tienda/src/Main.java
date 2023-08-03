
import Services.ProductoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ProductoService ps = new ProductoService();

        int opt;

        System.out.println("-------Bienvenidos a la tienda-------");
        do {
        System.out.println("");
        System.out.println("Ingrese una opcion:");
        System.out.println("1.Cargar productos.");
        System.out.println("2.Modificar precio de producto.");
        System.out.println("3.Eliminar producto.");
        System.out.println("4.Mostrar productos.");
        System.out.println("5.Salir.");
        opt = input.nextInt();
        input.nextLine();

        switch (opt){
            case 1:
                ps.agregarProductos();
                break;
            case 2:
                System.out.println("Ingrese el producto a modificar");
                String prodACambiar = input.nextLine();
                if (ps.buscarProd(prodACambiar)) {
                    System.out.println("Ingrese el nuevo precio");
                    Double precioNuevo = input.nextDouble();
                    input.nextLine();
                    ps.modificarPrecio(prodACambiar, precioNuevo);
                    ps.mostrarProductos();
                } else {
                    System.out.println("");
                    System.out.println("El producto no se encuentra en la lista.");
                }
                break;
            case 3:
                System.out.println("Ingrese el producto a eliminar");
                String prodAEliminar = input.nextLine();
                if (ps.buscarProd(prodAEliminar)){
                    ps.eliminarProducto(prodAEliminar);
                    ps.mostrarProductos();
                } else {
                    System.out.println("");
                    System.out.println("El producto no se encuentra en la lista.");
                }
                break;
            case 4:
                ps.mostrarProductos();
                break;
            case 5:
                break;
        }

        } while (opt != 5);
        System.out.println("");
        System.out.println("Gracias por su visita, vuelva pronto.");
    }
}