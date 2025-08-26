package tp1;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese el ancho");
		int ancho = Integer.parseInt(input.nextLine());

		System.out.println("Ingresar el largo");
		int largo = Integer.parseInt(input.nextLine());


		for(int i = 0; i < largo; i++ ) {
			// ciclo que imprime a lo largo
			for(int j= 0; j < ancho  ;j++) {
				// ciclo que se imprime a lo ancho
				System.out.print("X");


			}
			System.out.println();
			ancho++; // para que sea escalonado  de menor a mayor 

			input.close();


		} 







	}

}
