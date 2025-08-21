package tp1;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int numeroEntero1, numeroEntero2;
		System.out.println("Ingrese el primer numero natural");
		numeroEntero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Ingrese el segundo numero natural");
		numeroEntero2 = Integer.parseInt(scanner.nextLine());
		
		int suma = numeroEntero1 + numeroEntero2;
		int resta = numeroEntero1 - numeroEntero2;
		int multiplicacion = numeroEntero1 * numeroEntero2;
		double division = numeroEntero1 / numeroEntero2; 
		
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " +  resta ); 
		System.out.println("La multiplicacion  es " + multiplicacion );
		System.out.println("la division es " + division);
		
		scanner.close();
		

	}

}
