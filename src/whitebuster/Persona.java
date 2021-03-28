package whitebuster;

public class Persona {
	private long cedula;
	private String nombre;
	public Rol rol;
	String[] peliculasEnPrestamo;
	Cuenta cuenta;
	
	Persona(long cedula, String nombre, Rol rol){ //constructor datos persona
		this.cedula = cedula;
		this.nombre = nombre;
		this.rol = rol;
	}
	
	public void asignarCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
		cuenta.persona = this;
	}
	
	
	
	
	

}
