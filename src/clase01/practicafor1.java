package clase01;

import java.util.Scanner;

public class practicafor1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un numero entero positivo");
		int n = Integer.parseInt(input.nextLine());

		long acumulador = 1;

		for(int i = 1; i <= n; i++) {


			acumulador *= i;

		}

		System.out.println(" Factorial de  " + n + " = " + acumulador);


		input.close();
	}



}
