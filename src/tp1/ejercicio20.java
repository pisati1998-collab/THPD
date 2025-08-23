package tp1;

import java.util.Scanner;



public class ejercicio20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 , num2 , multiplicacion , suma , resta;
		
		char  operacion;
	
		
		System.out.println("Ingrese un numero Entero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el Segundo Numero");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la operacion");
		operacion = input.nextLine().charAt(0);
		
		multiplicacion = num1 * num2;
		
		resta = num1 - num2;
		suma = num1 + num2;
		
		if(operacion == '+') {
			System.out.println("El resultado es " + suma);
		}
		else if(operacion == '-') {
			System.out.println("El Resultado es " + resta);
		}
		else if(operacion == '*') {
			System.out.println("El Resultado es " + multiplicacion);
			
		}
		else if(operacion == '/' ) {
			
			if(num2 == 0) {
				System.out.println("Error");
			}
			else {
				double division = (double) num1 / num2;
			System.out.println("El resultado es " + division);
			}
			
		}
		else {
			System.out.println("Operacion no val");
		}
		
		input.close();
		
		
		
		
		
		

	}

}
