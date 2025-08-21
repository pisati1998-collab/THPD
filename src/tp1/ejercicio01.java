package tp1;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String  nombre;
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		
		
		System.out.println("Bienvenido " + nombre);
		
		
		input.close();
		

	}

}
