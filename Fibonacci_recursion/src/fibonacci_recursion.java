//Fibonacci: F(n)=F(n−1)+F(n−2)

import java.util.Scanner;

public class fibonacci_recursion {

	  public static int fibRecursion(int n) {
		    if (n == 0) { //casos base 0 y 1 (resultado es el mismo número)
		      return 0;
		    } 

		    if (n == 1 || n == 2) {
		      return 1;
		    }

		    // para el resto de números
		    return fibRecursion(n - 1) + fibRecursion(n - 2);
		  }

	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce un número: ");
	        int fib_len = scanner.nextInt();

	        System.out.print("Serie de Fibonacci: \n");

	        for (int i = 0; i < fib_len; i++) {
	            System.out.print(fibRecursion(i) + " ");
	        }

		    }};


