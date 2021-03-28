package whitebuster;

public enum Tipo {
	
	PELICULA(15), VIDEOJUEGO(20);
	
	//cantidad m�xima d�as de pr�stamo
	
	public int diasPrestamo;
	
	private Tipo(int dias) {
		diasPrestamo = dias;
	}	
	
	public int getDiasPrestamo() {
		return diasPrestamo;
	}
}
