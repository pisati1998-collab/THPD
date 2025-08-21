package tp1;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su edad");
		int edad = Integer.parseInt(scanner.nextLine());
		System.out.println("Ingrese su genero (M o F)");
		char genero = scanner.nextLine().charAt(0);
		scanner.close();
		final int EDAD_MINIMA = 1;
		final int EDAD_MAXIMA = 120;
		final int JUBILACIONHOMBRE = 65;
		final int JUBILACIONMUJER = 60;
		
		boolean edadEnRango =edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA;
		boolean generoValido = genero == 'M' || genero == 'F'; 
		/*
		if(edadEnRango && generoValido) {
			System.out.println("Datos validos");
			*/if(edad >=JUBILACIONHOMBRE) {
				System.out.println("Te podes jubilar");
				
			}
			
		   else if(edad >=JUBILACIONMUJER && genero == 'F') {
			   System.out.println("Te podes Jubilar");
		   
		   
		   }else {
			   System.out.println("Todadavia no te podes jubilar ");
			
			
			
		}
		
			
		

	}


}
	
		

	


