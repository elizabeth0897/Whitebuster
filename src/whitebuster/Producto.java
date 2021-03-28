package whitebuster;

public class Producto {
	
	private long codigo;
	private String nombre;
	private Tipo tipo;
	public int precio;
	public String estado; // disponible o no disponible para prestamo
	
	public Producto(long codigo, String nombre, Tipo tipo, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public String setDiasPrestamo(int dias) {
		if (dias <= this.getTipo().getDiasPrestamo() ) {
		tipo.diasPrestamo = dias;
			return "El producto estar� en pr�stamo por " + dias + " d�as";
		}
		else {
			return "El producto s�lo puede ser prestado un m�ximo de " + getTipo().getDiasPrestamo() + " d�as";
		}
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Tipo getTipo() {
		return tipo;

	}
}

