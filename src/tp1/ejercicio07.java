package tp1;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		double ancho,largo,valorMetro;
		System.out.println("Ingrese el ancho del terreo");
		ancho = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese el largo del terreo");
		largo = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese el valor del  metros cuadrados");
		valorMetro = Double.parseDouble(scanner.nextLine());
		
		System.out.println("El valor total del terro " + ancho * largo* valorMetro);
		System.out.println("La cantidad metros cercados son " + (ancho + largo) * 6 );
		
		scanner.close();

	}

}
