package gestion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ikea extends Gestor{
	
	public static void Lanzar(Scanner teclado) {
        Gestor gc = new Gestor();
        Scanner teclado2 = new Scanner(System.in);
        int opcion = 0;
        while (opcion!=9) {

            System.out.println("\n-- Menu --\n");
            menu();
            try {
                opcion = teclado2.nextInt();

            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (opcion) {
                case 1:
                    gc.mostrarClientes();
                    break;
                case 2:
                    gc.crearCliente(teclado2);
                    break;
                case 3:
                    gc.crearElemento(teclado);
                    break;
                case 4:
                    gc.crearKit(teclado);
                    break;
                case 5:
                    gc.crearPedido(teclado);
                    break;
                case 6:
                    gc.mostrarPedido();
                    break;
                case 7:
                    gc.mostrarElementos();
                    break;
                case 8:
                    gc.mostrarKits();
                    break;
                case 9:
                	System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("La opcion elegida no existe.");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("1 - Mostrar Clientes");
        System.out.println("2 - Crear un cliente");
        System.out.println("3 - Crear un elemento");
        System.out.println("4 - Crear un kit");
        System.out.println("5 - Crear un pedido");
        System.out.println("6 - Mostrar pedidos");
        System.out.println("7 - Mostrar elementos");
        System.out.println("8 - Mostrar kits");
        System.out.println("9 - Salir");
    }

}
