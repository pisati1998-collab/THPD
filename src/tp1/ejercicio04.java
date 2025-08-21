package tp1;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double horaTrabajo;
		double cantidadHoras;
		
				
		System.out.println("Ingrese el valor de la hora de trabajo");
		horaTrabajo =Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese la cantidad de horas trabajadas ");
		cantidadHoras = Double.parseDouble(scanner.nextLine());
		
		double horasSemanales = ( cantidadHoras * 5) + ( cantidadHoras * 1.0/ 2);
		double salarioSemanal = horasSemanales * horaTrabajo;
		
		System.out.println("El salario es " + salarioSemanal);
		
		scanner.close();

	}

}
