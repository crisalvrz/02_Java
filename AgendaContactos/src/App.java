import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		Persona o = new Persona("Pepe","Álvarez","123456789" ,30);
		Persona q = new Persona();
		Persona m = new Persona("Susana", "Jovellanos", "899040", 60); 
		
		System.out.println(p);
		System.out.println(o);
		System.out.println(q);
		System.out.println(m);
		
		System.out.println("Nombre: "+o.getNombre());
		System.out.println("Apellidos: "+o.getApellidos());
		System.out.println("Edad: "+o.getEdad());
		
		p.setNombre("Juan");
		System.out.println("Nombre: "+p.getNombre());
		
		p.setApellidos("Fernández"+p.getApellidos());
		System.out.println("Apellidos:"+p.getApellidos());
		
		p.setEdad(50);
		System.out.println("Edad: " +p.getEdad());
		
		System.out.println(p);
		
		
		
		q.setNombre("Ana Maria");
		System.out.println("Nombre: "+q.getNombre());
		
		q.setApellidos("Fernández"+q.getApellidos());
		System.out.println("Apellidos:"+q.getApellidos());
		
		q.setEdad(55);
		System.out.println("Edad: " +q.getEdad());
		
		System.out.println(q);
		
		
		
		System.out.println("Array");
		//array 10 personas
		Persona[] personas = new Persona[10];
		personas[0]=p;
		personas[1]=o;
		personas[2]=m;
		
		for(int i=0; i< personas.length; i++) {
			if(personas[i] != null) {
				System.out.println(personas[i].getNombre()); //no se puede acceder a null porque no hay no get.- no se puede operar sobre null. Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Persona.getNombre()" because "personas[i]" is null
			}
		}
	
		System.out.println(p.getNombreCompleto());
		
		
		ArrayList<Persona> lista = new ArrayList<Persona>(); //Size 0
		//Insert
		lista.add(p);//Size 1 - Posicion 0
		lista.add(0, o); //si pongo 0 y la o está en 1 me lo mueve a esa posición
		p.setNombre("Ana");
		o.cumpleanyos();
		p.cumpleanyos();
		p.cumpleanyos();
		q.cumpleanyos();
		m.cumpleanyos();
		System.out.println(lista);
		//borrar
		//lista.remove(0);//Borra por posicion
		lista.remove(p);//Borra por elemento
		System.out.println(lista);
		
		Agenda agenda = new Agenda();
		agenda.addContacto(p);
		agenda.addContacto(o);
		agenda.addContacto(q);
		agenda.addContacto(m);
		
		//Dar la funcionalidad a la agenda para poder borrar un contacto por nombre;
	/*	if(agenda.eliminarContactoPorNombre("Ana")) {
			System.out.println("El contacto se ha eliminado");
		}else {
			System.out.println("El contacto no estaba en la agenda");
		}
		System.out.println(agenda.contactos());*/
		
		System.out.println("Mostrar los contactos Ana");
		agenda.mostrarContacto("ana");
	}
	
}