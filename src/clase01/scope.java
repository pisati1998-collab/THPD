package clase01;

import java.util.Scanner;

public class scope {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double horaTrabajo;
		double cantidadHoras;
		final  double HORAS_SEMANALES = 5.5; 
		
				
		System.out.println("Ingrese el valor de la hora de trabajo");
		horaTrabajo =Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese la cantidad de horas trabajadas ");
		cantidadHoras = Double.parseDouble(scanner.nextLine());
		
		double horasSemanales = ( cantidadHoras * HORAS_SEMANALES);
		double salarioSemanal = horasSemanales * horaTrabajo;
		
		System.out.println("El salario es " + salarioSemanal);
		
		scanner.close();
	}

}
