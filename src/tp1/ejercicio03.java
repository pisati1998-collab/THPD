package tp1;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroEntero;
		System.out.println("Ingrese numero entero");
		numeroEntero = Integer.parseInt(scanner.nextLine());
		System.out.println("La multiplicacion es " + numeroEntero * 5);
		System.out.println("La division es " + numeroEntero * 1.0 / 2);
		
		scanner.close();
		

	}

}
