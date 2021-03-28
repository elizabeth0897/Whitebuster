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
			return "El producto estará en préstamo por " + dias + " días";
		}
		else {
			return "El producto sólo puede ser prestado un máximo de " + getTipo().getDiasPrestamo() + " días";
		}
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Tipo getTipo() {
		return tipo;

	}
}

