import java.util.Scanner; // string inmutable; array puede reemplazar x posición; string caracteres alfanuméricos solo.

public class Calculadora {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int sumar(int a,int b) { //creamos las funciones para cada operación con números genéricos para poder repetirla más veces
		return a+b;
	}
	
	public static int restar(int a, int b) {
		return a-b;
	}
	
	public static int multiplicar(int a, int b) {
		return a*b;
	}
	
	public static int dividir(int a, int b) {
		if(b==0) {
			System.out.println("No podemos dividir entre 0"); //sacamos el mensaje aunque retornemos 0, solucionaremos más tarde
			return 0;		
		} 
		return a/b;
	}

	public static int factorial(int a) { //las variables mejor nombrarlas mejor como num1 num2 en vez de a, b
		int fact = 1;
		for(int i=a; i>1;i--) { //for(desde donde-hasta cuando-operacion)
			fact = fact*i;
			System.out.println("i: "+i+ " fact: "+fact);
		}
		return fact;
	}
	
	public static int raiz(int b) { //seguir aqui----añadir la opcion para calcular la raiz entera de 1 numero -> ej 37 -> 6 porque 6*6=36<37 y 7*7=49>37
		int r = 0;
		while(r*r<b) {
			r++;
		}
		return --r; //cuidado con el orden de -- y ++, ya que si está antes lo saca así
	}
	
	public static float temperatura(float a) { //fijarse en el orden de las operaciones y tipos
		return (a- 32) * 5 /9; // de F a Cº
	}
	
	public static boolean bisiesto(int anyo) {
		return anyo%4==0 && anyo%100!=0 || anyo%400==0; 
	}
	
	public static int mayor(int num1, int num2, int num3) {
		if(num1>=num2) {
			if (num1>=num3) {
				return num1;
			}else {
				return num3;
			}
		}else {
			if (num2>=num3) {
				return num2;
			}else {
				return num3;
			}
		}
	}
	
	public static String nota(int num1) {
		if(num1<5) {
			return "Suspenso";
		}else if(num1<7) {
			return "Aprobado";
		}else if(num1<9) {
			return "Notable";
		}else if(num1<10) {
			return "Sobresaliente";
		}else if(num1==10) {
			return "Matrícula de honor";
		}
		return "Nota no válida";
	}
	
	public static String MasaCorporal(double peso, double altura) {
		double imc =peso / (altura*altura);
		if(imc<=18.50) {
			return "Bajo peso";
		}else if(imc<=25) {
			return "Normal";
		}else if(imc<30) {
			return "Sobrepeso";
		}
		return "Obesidad";
	}
	
	public static double coordenadas(int x, int y) {
		return Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
	}
	
	public static double circunferencia(int x, int y) {
		double radio =coordenadas(x, y); //llamada a la funcion anterior- no declaro tipos!! las funciones ya tienen que tener esos tipos.
		return Math.PI * 2 * radio;
	}
	
	public static void menu() {
		System.out.println("Selecciona la operación a realizar");         //menu
		System.out.println("1. Sumar"); 
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Factorial");
		System.out.println("6. Raíz");
		System.out.println("7. De F a C");
		System.out.println("8. Bisiesto o no bisiesto:");
		System.out.println("9. Número mayor de 3 números:");
		System.out.println("10. Nota:");
		System.out.println("11. Masa corporal:");	
		System.out.println("12. Coordenadas:");
		System.out.println("13. Coordenadas de una circunferencia");
		}
	
	public static void opcionSuma() {
		System.out.println("Vamos a sumar pues");
		System.out.println("Teclea el primer número");
		int num1 = scanner.nextInt();
		 
		System.out.println("Teclea el segundo número");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(sumar(num1,num2));   
	}
	
	public static void opcionResta() {
		System.out.println("Vamos a restar:");
		System.out.println("Teclea el primer número");
		int num1 = scanner.nextInt();
		 
		System.out.println("Teclea el segundo número");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(restar(num1,num2));
	}
	
	public static void opcionMutiplicar() {
		System.out.println("Vamos a multiplicar:");
		System.out.println("Teclea el primer número");
		int num1 = scanner.nextInt();
		 
		System.out.println("Teclea el segundo número");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(multiplicar(num1,num2));
	}
	
	public static void opcionDividir() {
		System.out.println("Vamos a dividir:");
		System.out.println("Teclea el primer número");
		int num1 = scanner.nextInt();
		 
		System.out.println("Teclea el segundo número");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(dividir(num1,num2));
	
	}
	
	public static void opcionFactorial() {
		System.out.println("Vamos a hacer el factorial:");
		System.out.println("Teclea el número");
		int num1 = scanner.nextInt();
	
		 
		System.out.println("Resultado:");
		System.out.println(factorial(num1));
	
	}
	
	public static void opcionRaiz() {
		System.out.println("Vamos a hacer la raíz:");
		System.out.println("Teclea el número");
		int num1 = scanner.nextInt();
	
		 
		System.out.println("Resultado:");
		System.out.println(raiz(num1));
	
	}
	public static void opcionTemperatura() {
		System.out.println("Vamos a pasar de F a C");
		System.out.println("Teclea el número");
		int num1 = scanner.nextInt();
	
	}

	public static void opcionBisiesto() {
		System.out.println("Vamos a ver si es bisiesto o no");
		System.out.println("Teclea el año");
		int num1 = scanner.nextInt();
	
		 
		System.out.println("Resultado:");
		System.out.println(bisiesto(num1));
	}
			
	public static void opcionMayor() {
		System.out.println("Vamos a comparar tres números");
		System.out.println("Teclea el primer número");
		int num1 = scanner.nextInt();
		 
		System.out.println("Teclea el segundo número");
		int num2 = scanner.nextInt();
		
		System.out.println("Teclea el tercer número");
		int num3 = scanner.nextInt();
	
		 
		System.out.println("Resultado:");
		System.out.println(mayor(num1, num2, num3));
	}
	
	public static void OpcionNota() {
		System.out.println("Dime tu nota");
		int num1 = scanner.nextInt();
		System.out.println("Resultado:");
		System.out.println(nota(num1));
	}
	
	public static void opcionMasaCorporal() {
		System.out.println("Vamos a calcular la masa:");
		System.out.println("Introduce el peso");
		int num1 = scanner.nextInt();
		 
		System.out.println("Introduce la altura");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(MasaCorporal(num1,num2));
	
	}
	
	public static void opcionCoordenadas() {
		System.out.println("Vamos a calcular la distancia:");
		System.out.println("Introduce x");
		int num1 = scanner.nextInt();
		 
		System.out.println("Introduce y");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(coordenadas(num1,num2));
	}
	
	public static void opcionCircunferencia() {
		System.out.println("Vamos a calcular la distancia dentro de una circunferencia:");
		System.out.println("Introduce x");
		int num1 = scanner.nextInt();
		 
		System.out.println("Introduce y");
		int num2 = scanner.nextInt();	
		 
		System.out.println("Resultado:");
		System.out.println(coordenadas(num1,num2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
		// modificiar los case para que solo haya una llamada a una función en cada 1 -done
		//añadir la opcion para calcular la raiz entera de 1 numero -> ej 37 -> 6 porque 6*6=36<37 y 7*7=49>37
		// se resuelve con el for(){}
		int opcion = scanner.nextInt(); 
		switch(opcion){ 
  
		case 1:                                                     //casos para cada operacion
			    opcionSuma();          //le pasamos la función
		break; 
		
		case 2:
				opcionResta();
		break;
		
		case 3:
				opcionMutiplicar();
		break;
		
		
		 case 4:
				opcionDividir();
				
		break;
		
		 case 5:
			 	opcionFactorial();
		break;
			
		 case 6:
			 	opcionRaiz();
		break;
		
		 case 7:
			 	opcionTemperatura();
		break;
		
		 case 8:
			 	opcionBisiesto();
		break;
		
		 case 9:
			 	opcionMayor();
		break;
		
		 case 10:
			 	OpcionNota();
		break;
		
		 case 11:
			 	opcionMasaCorporal();
		break;
		
		 case 12:
			 	opcionCoordenadas();
			 	
		 case 13:
			 	opcionCircunferencia();
		break;
		}
	}

}