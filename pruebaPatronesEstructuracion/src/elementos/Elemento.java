package elementos;

public class Elemento{

	double precio;
	int codigo;
	
	public Elemento(double precio, int codigo) {
		super();
		this.precio = precio;
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Elemento [precio = " + precio + ", codigo = " + codigo + "]";
	}
	
}
