
public class Vehiculo {
// info a almacenar: matricula, modelo, marca, año, km; poder aumentar los km pero no bajar- clase que maneje el vehículo; getters y setters;
	private String matricula;
	private String modelo;
	private String marca;
	private int anyo;
	private int km;
	
//constructores : necesitamos 2, utilizará el que se adecúe según le demos el dato km o no.

	public Vehiculo (String matricula, String modelo, String marca, int anyo) {
		this.matricula= matricula;
		this.modelo=modelo;
		this.marca=marca;
		this.anyo=anyo;
		this.km=0;
	}
	
	public Vehiculo (String matricula, String modelo, String marca, int anyo, int km) {
		this.matricula= matricula;
		this.modelo=modelo;
		this.marca=marca;
		this.anyo=anyo;
		this.km=km;
	}
	
//getters y setters
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getAño() {
		return anyo;
	}
	public void setAño(int año) {
		this.anyo = año;
	}
	
	public int getKm() {
		return km;
	}

//método aumentar km: suma los que tiene a los recorridos, dando un nuevo valor. Se limita que no se pueda restar km.

	public int añadirKm(int kms) {
		try {
			if(kms<=0) {
				throw new IllegalArgumentException("Los kms han de ser mayores de 0");
			}
			this.km += kms;
			}catch(IllegalArgumentException e) { //e es un objeto, se comporta como una clase.
				System.out.println("Error: "+e.getMessage());
			}
			return this.km;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", anyo=" + anyo
				+ ", km=" + km + "]";
	}
	
}
