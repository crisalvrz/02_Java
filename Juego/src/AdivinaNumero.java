import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdivinaNumero {
    public static void main(String[] args) {

        int numeroPensado = ThreadLocalRandom.current().nextInt(1, 100);
        try (Scanner sc = new Scanner(System.in)) {
			int numeroPropuesto;
			do {
			    System.out.println("Intenta adivinar el número que estoy pensando. Venga, di un número: ");
			    numeroPropuesto = sc.nextInt();
			    if (numeroPensado > numeroPropuesto) {
			        System.out.println("El número que he pensado es mayor que el introducido");
			    } else if (numeroPensado < numeroPropuesto) {
			        System.out.println("El número que he pensado es menor que el introducido");
			    }
			} while (numeroPensado != numeroPropuesto); //! da la vuelta a la condición (si no en vez de si)
		}

        System.out.println("Al fin has acertado cacho tonto, el número que pensé fue: " + numeroPensado);
    }
}
