package tp1;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;

		System.out.println("Ingrese un numero Entero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese un numero Entero");
		num2 = Integer.parseInt(input.nextLine());

		if(num1 <= num2) {
			System.out.println("Incluyendolo");

			for(int i = num1 ; i <= num2 ; i++ ) {

				System.out.print(i + "  ");

			} 



			System.out.println("\nExcluyendolo");
			for(int j = num1 + 1; j < num2; j++) {

				System.out.print(j+" ");


			} 
		}
		else {

			System.out.println("Error");
		}

	}
}
