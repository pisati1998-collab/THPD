package tp1;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contadorEdad = 0 , edad , edadMayoresImpares = 0 ;



		for(int i = 1; i <= 5 ; i++ ) {
			System.out.println("Ingrese su edad");
			edad = Integer.parseInt(input.nextLine());
			contadorEdad += edad;
			if(edad % 2 != 0 && edad >= 18) {

				edadMayoresImpares += 1;




			}


		}

		System.out.println("El promedio es " + (1.0*contadorEdad/5));
		System.out.println("Las edad impares " + edadMayoresImpares);


		input.close();






	}

}
