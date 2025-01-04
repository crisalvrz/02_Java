
public class Persona {
	//Atributos (public privated or protected) -aquí almacena info
	private String nombre;
	private String apellidos;
	private String telefono;
	private int edad;

	//Constructor
	//1. Por defecto - no almacena nada, valores defecto
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.edad=0;
	}
	
	//2. Con parámetros
	public Persona(String nombre, String apellidos, String telefono, int edad) { //ojo no son atributos- alquí se almacenan parámetros
		this.nombre= nombre;
		this.apellidos= apellidos;
		this.telefono=telefono;
		this.edad= edad;
	}

	
	public void cumpleanyos() {
		this.edad++;
	}
	
	public String getNombreCompleto() {
		return this.nombre+" "+this.apellidos;
	}
	
	//getters: devuelven el valor de los atributos que quiera devolver. Son públicos
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	//Setters - cambiar el nombre del atributo ej. antes era Pepe ahora es Juan
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	
	public void setEdad(int edad) {
		this.edad= edad;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="+telefono+", edad=" + edad + "]";
	}
	
}
