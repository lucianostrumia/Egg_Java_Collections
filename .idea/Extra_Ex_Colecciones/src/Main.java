
import Entities.Producto;
import Entities.Tienda;
import Services.ProductoService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Producto> listaProd = new ArrayList<>();
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ProductoService ps = new ProductoService();
        Tienda t = new Tienda();

            int opcion = -1;

            while (opcion!= 0){

                System.out.println("1-Cargar Productos.");
                System.out.println("2-Vender.");
                System.out.println("3-Reponer producto.");
                System.out.println("4-Mostrar productos.");

                System.out.println("0-Salir");
                System.out.println("Ingrese una opcion: ");
                opcion = leer.nextInt();
                leer.nextLine();
                switch (opcion) {

                    case 1:
                        listaProd = ps.crearProductos(listaProd);
                        break;
                    case 2:
                        listaProd = t.Venta(listaProd);
                        break;
                    case 3:
                        listaProd = t.reposicion(listaProd);
                        break;
                    case 4:
                        ps.mostrarProductos(listaProd);
                        break;
                    case 0:
                        System.out.println("Gracias, vuelva pronto");
                        break;


                }
                //cierre switch
            }//cierre while
        }//cierre main

    }//cierra clase
