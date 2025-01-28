
public class principal {
	public static void main(String[] args) {
		
		Vehiculo p = new Vehiculo("3652LDT", "Mondeo", "Ford", 2001, 67000);
		Vehiculo q = new Vehiculo("6483YGF", "Cherokee", "Jeep", 2019);
		
		System.out.println(p);
		System.out.println(q);
		
		p.añadirKm(-500);
		q.añadirKm(500);
		
		System.out.println(p);
		System.out.println(q);
	}
}