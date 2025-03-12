import java.util.Random;
import java.util.Scanner;

public class Main {

	//función devuelve entre el máximo y mínimo que diga, incluyendo el máximo.
	public static int generarAleatorio(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	} 
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijeras"};
        
        System.out.println("Piedra, Papel o Tijeras, un, dos, tres... elige");
        String eleccionUsuario = scanner.nextLine().toLowerCase(); //se podría trucar

        int indiceOrdenador = random.nextInt(3);
      //  (int)(Math.random()*3) : mayor secuencia entre 0 y 1.
      // random.nextInt(indiceOrdenador, indiceOrdenador)- existe la posibilidad por sobrecarga/polimorfismo para return 5-15. El límite superior no lo genera.
      // si no hubiera método: <o> no sirve porque son operadores booleanos
       
        String eleccionOrdenador = opciones[indiceOrdenador];
        
        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras")) {
            System.out.println("Elección inválida. Debes elegir piedra, papel o tijeras.");
            return;
        }

        System.out.println("Tú has dicho: " + eleccionUsuario);
        System.out.println("Y yo: " + eleccionOrdenador);

        if (eleccionUsuario.equals(eleccionOrdenador)) {
            System.out.println("Ups, empate, volvamos a jugar");

        } else if ((eleccionUsuario.equals("piedra") && eleccionOrdenador.equals("tijeras")) ||
                   (eleccionUsuario.equals("papel") && eleccionOrdenador.equals("piedra")) ||
                   (eleccionUsuario.equals("tijeras") && eleccionOrdenador.equals("papel"))) {
            System.out.println("Esta vez parece que has ganado, no te confíes");
 
        } else {
            System.out.println("Looser haha");
        }
    }
}