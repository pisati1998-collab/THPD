package tp1;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String socio1 , socio2, socio3;
		double capital1 , capital2 , capital3;
		
		
		System.out.println("Ingrese el nombre socio 1");
		socio1 = scanner.nextLine();
		System.out.println("Ingrese el capital ");
		capital1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Ingrese el nombre socio 2");
		socio2 = scanner.nextLine();
		System.out.println("Ingrese el capital socio 2 ");
		capital2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Ingrese el nombre socio 3");
		socio3 = scanner.nextLine();
		System.out.println("Ingrese el capital socio 3");
		capital3 = Double.parseDouble(scanner.nextLine());
		
	double capitalTotal = capital1 + capital2 + capital3;
	
		
		System.out.println("Total de capital aportado " + capitalTotal);
		System.out.println("El socio " + socio1 + " aporto " + capital1 * 100 / capitalTotal + " %" );
		System.out.println("El socio " + socio2 + " aporto " + capital2 * 100 / capitalTotal + " %" );
		System.out.println("El socio " + socio3 + " aporto " + capital3 * 100 / capitalTotal + " %" );
		
		scanner.close();
		

	}

}
