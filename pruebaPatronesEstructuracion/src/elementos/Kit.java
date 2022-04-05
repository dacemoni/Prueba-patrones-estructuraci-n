package elementos;

import java.util.ArrayList;

public class Kit {

	double precioKit;
	int codigoKit;
	ArrayList<Elemento> listaElementos;
	
	public Kit(int codigoKit) {
		super();
		this.codigoKit = codigoKit;
		listaElementos = new ArrayList<>();
	}

	public double getPrecioKit() {
		return precioKit;
	}

	public void setPrecioKit() {
		double aux;
		for (Elemento e : listaElementos) {
			precioKit += e.getPrecio();
		}
		aux = precioKit * 0.1;
		precioKit = precioKit - aux;
	}

	public int getCodigoKit() {
		return codigoKit;
	}

	public void setCodigoKit(int codigoKit) {
		this.codigoKit = codigoKit;
	}

	@Override
	public String toString() {
		return "Kit [precioKit = " + precioKit + ", codigoKit = " + codigoKit + ", listaElementos = " + listaElementos + "]";
	}

}
