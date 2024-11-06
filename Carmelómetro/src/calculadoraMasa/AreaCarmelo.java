package calculadoraMasa;

import java.util.Scanner;

public class AreaCarmelo {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escoge: " +
                    "\n 1 - Calcular el área de Melito" +
                    "\n 2 - Calcular la comida que coge en su barriguita" +
                    "\n 3- Exit");
            Scanner calculo = new Scanner(System.in);
            int escogeCalculo = calculo.nextInt();

            switch (escogeCalculo) {
                case 1:
                    System.out.println("Vamos calcular el área del cuerpito");
                    Scanner cilindro = new Scanner(System.in);
                    System.out.println("Introduce la circunferencia de su barriguita en cm");
                    double circunferenciaCirculo = cilindro.nextDouble();
                    System.out.println("Introduce la medida de largo de colita a cuello, en cm");
                    double largoCircunferencia = cilindro.nextDouble();

                    double areaCircunferencia = circunferenciaCirculo * largoCircunferencia + ((circunferenciaCirculo * circunferenciaCirculo) / (Math.PI * 2));
                    System.out.println("El área de su torso es" + areaCircunferencia + " cm²");
                    break;

                case 2:
                    System.out.println("Vamos calcular la cantidad de comidita que coge en su estómago");
                    Scanner cantidadComida = new Scanner(System.in);
                    System.out.println("Introduce su peso en kg");
                    double pesoKilos = cantidadComida.nextDouble();

                    double cantidadFinal = (pesoKilos / 70) * Math.pow(4, 3);
                    System.out.println("La cantidad de comidita es " + cantidadFinal + " gr. Recuerda que esta cantidad es orientativa, consulta con tu vet.");
                    break;

                case 3:
                    System.out.println("Gracias por venir!...");
                    break;

                default:
                    System.out.println("Número invalido");
                    break;
            }
            if (escogeCalculo < 3) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
    }
}
