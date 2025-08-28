package clase01;

import java.util.Scanner;

public class practicafor2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un numero entero positivo");
		int n = Integer.parseInt(input.nextLine());

		int acumulador = 0;


		for(int i = 1; i <= n; i++){
			acumulador += i;
			System.out.println(" i = " + n + " acumulador " + acumulador);
		}
		System.out.println("La suma de " + n + " = " + acumulador);
		input.close();





	}

}
