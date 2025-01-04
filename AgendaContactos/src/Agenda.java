import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> datos;
	
	public Agenda() {
		this.datos=new ArrayList<Persona>();
	}
	
	//Permite añadir contactos a la agenda
	public boolean addContacto(Persona p) {
		return datos.add(p);
	}
	
	// Eliminar contactos
	public boolean eliminarContactoPorNombre(String nombre) {
		//tengo que recorrer el ArrayList(datos) elemento a elemento hasta que encuentre  el elemento de nombre "nombre" y eliminarlo 
		//si lo encuentro lo elimino y devuelvo true
		//si llego al final y no lo encuentro devuelvo false
		for (int i=0; i< datos.size(); i++) { //desde donde, hasta cuando y paso
			if(datos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				datos.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Persona> contactos() {
		return datos;
	}
	
	//recibe un nombre, no devuelve nada y muestra los contactos por nombre;
	public void mostrarContacto(String nombre) {
		for (int i=0; i< datos.size(); i++) {
			if(datos.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())) {
				System.out.println(datos.get(i));
			}
		}
	}

	
}
