package tp1;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nota;

		do {

			System.out.println("Ingrese una nota entre 0 y 10");
			nota = Integer.parseInt(input.nextLine());

			if(nota < 0 || nota > 10) {

				System.out.println(" Error: La nota ingresada tiene que ser entre 0 y 10 ");

			} 

		}while(nota < 0 || nota > 10);
		System.out.println(" Nota valida ingresada " +nota);
		input.close();






	}

}
