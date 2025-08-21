package tp1;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double primerAngulo, segundoAngulo , tercerAngulo;
		System.out.println("Ingrese el primer angulo");
		primerAngulo = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese el segundo angulo");
		segundoAngulo = Double.parseDouble(scanner.nextLine());
		
		
		tercerAngulo = 180 - primerAngulo - segundoAngulo;
		
		System.out.println("El tercer angulo es " + tercerAngulo);
		
		
		scanner.close();

	}

}
