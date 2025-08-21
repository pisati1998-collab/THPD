package tp1;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 , num2;
	
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Ingrese el segundo  numero");
		num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("El valor de num1 es " + num1);
		System.out.println("El valor de num2 es " + num2);
		
		int aux = num1; 
		 num1 = num2; // num1 toma el valor de num2
		 
		 num2 = aux; // num2 toma el valor de num1
		 
		 System.out.println("El valor de num1 es " + num1);
		 System.out.println("El valor de num2 es " + num2);
		 
		 scanner.close();
		 

	}

}
