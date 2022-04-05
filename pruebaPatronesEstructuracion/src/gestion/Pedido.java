package gestion;

import java.util.ArrayList;

import elementos.*;

public class Pedido {
	Cliente cliente;
	ArrayList<Elemento> pedidoElemento;
	ArrayList<Kit> pedidoKit;

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
		pedidoElemento = new ArrayList<>();
		pedidoKit = new ArrayList<>();
	}

	public void setElemento(Elemento elemento) {
		pedidoElemento.add(elemento);
	}

	public void setKit(Kit kit) {
		pedidoKit.add(kit);
	}

	public String toString() {
		String s = "";
		s += "Pedidos de " + this.cliente.getNombre() + ":";
		for (Elemento e : pedidoElemento) {
			s+="\n";
			s += e.toString();
		}
		for (Kit k : pedidoKit) {
			s+="\n";
			s += k.toString();
		}

		return s;
	}

}
