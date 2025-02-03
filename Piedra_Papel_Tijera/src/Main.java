import java.util.Random;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("Piedra, Papel o Tijeras, un, dos, tres... elige");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        int indiceOrdenador = random.nextInt(3);
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