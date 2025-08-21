package tp1;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int montoTotal;
		
		System.out.println("Ingrese el monto total");
		montoTotal = Integer.parseInt(scanner.nextLine());
	
		int sueldoFijo = 44000;
		int total = (montoTotal * 16 / 100) + sueldoFijo ;
		
		System.out.println("El sueldo total es " + total);
		
		
		scanner.close();
		

	}

}
