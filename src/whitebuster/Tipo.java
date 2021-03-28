package whitebuster;

public enum Tipo {
	
	PELICULA(15), VIDEOJUEGO(20);
	
	//cantidad máxima días de préstamo
	
	public int diasPrestamo;
	
	private Tipo(int dias) {
		diasPrestamo = dias;
	}	
	
	public int getDiasPrestamo() {
		return diasPrestamo;
	}
}
