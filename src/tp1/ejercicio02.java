package tp1;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		System.out.println("Ingrese nota primer trimestre");
		nota1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese nota segundo trimestre");
		nota2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese nota tercer trimestre");
		nota3 = Double.parseDouble(scanner.nextLine());
		
		double promedio = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("El promedio es "+ promedio);
		scanner.close();
		

	}

}
