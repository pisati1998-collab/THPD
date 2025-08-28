package tp1;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);

		int numeroEntero;
		System.out.println("Ingrese un numero Natural");
		numeroEntero = Integer.parseInt(input.nextLine());

		for(int i = 1; i <= numeroEntero ; i++) {

			if(i % 3 == 0 && i % 5 !=0) {

				System.out.println(i+ " ");
			}


		}

		input.close();





	}

}
