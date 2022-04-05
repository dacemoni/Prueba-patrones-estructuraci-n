package gestion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import elementos.*;


public class Gestor {
	
	ArrayList<Cliente> listaClientes;
	ArrayList<Elemento> listaElemento;
	ArrayList<Kit> listaKit;
	ArrayList<Pedido> listaPedidos;

	public Gestor() {
		listaClientes = new ArrayList<Cliente>();
		listaElemento = new ArrayList<Elemento>();
		listaKit = new ArrayList<Kit>();
		listaPedidos = new ArrayList<>();
	}

	public void crearCliente(Scanner teclado) {
		System.out.println("¿Nombre?");
		String nombre = teclado.next();
		Cliente c = new Cliente(nombre);
		listaClientes.add(c);

		System.out.println("Cliente n.º" + c.id + " [" + c.getNombre() + "] añadido");
	}

	public void mostrarClientes() {
		if (listaClientes.isEmpty()) {
			System.out.println("No hay clientes");
		} else {
			System.out.println("-- Clientes --\n");
		}
		for (Cliente c : listaClientes) {
			System.out.println(c.toString());
		}
	}

	public void mostrarElementos() {
		if (listaElemento.isEmpty()) {
			System.out.println("No hay elementos");
		} else {

		}
		for (Elemento elemento : listaElemento) {
			System.out.println(elemento.toString());
		}
	}

	public void mostrarKits() {
		if (listaKit.isEmpty()) {
			System.out.println("No hay kits");
		} else {

		}
		for (Kit kit : listaKit) {
			System.out.println(kit.toString());
		}
	}

	public void crearElemento(Scanner teclado) {
		System.out.println("¿Codigo del elemento?");
		int codigo = teclado.nextInt();
		System.out.println("¿Precio del elemento?");
		double precio = teclado.nextDouble();

		Elemento e = new Elemento(precio, codigo);
		listaElemento.add(e);
	}

	public void crearKit(Scanner teclado) {
		System.out.println("¿Codigo del kit?");
		int codigo = teclado.nextInt();
		
		Kit k = new Kit(codigo, <Elementos>);
		listaKit.add(k);
	}

	public void crearPedido(Scanner teclado) {
		if (!listaClientes.isEmpty()) {
			int eleccion = 0;
			Pedido p;
			while (true) {
				System.out.println("¿Para que cliente?");
				mostrarClientes();
				try {
					eleccion = teclado.nextInt();
					eleccion--;
					p = new Pedido(listaClientes.get(eleccion));
					break;

				} catch (InputMismatchException e) {
					teclado.next();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("No valido");
				}
			}
			int salir = listaElemento.size();
			eleccion = salir++;
			while (eleccion != salir) {
				System.out.println("¿Que elemento agregar al pedido?");
				for (Elemento o : listaElemento) {
					System.out.println(o.toString());
				}
				System.out.println(salir + ": Terminar");
				try {
					eleccion = teclado.nextInt();
					if (eleccion == salir) {
						break;
					}
					eleccion--;
					p.setElemento(listaElemento.get(eleccion));
				} catch (InputMismatchException e) {
					teclado.next();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("No valido");
				}
			}
			listaPedidos.add(p);
		}
	}

	public void mostrarPedido() {
		for (Pedido p : listaPedidos) {
			System.out.println(p.toString());
		}
	}

}