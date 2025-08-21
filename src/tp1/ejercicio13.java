package tp1;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero");
		int num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("ingrese otro numero entero");
		int num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("ingrese un ultimo numero entero");
		int num3 = Integer.parseInt(input.nextLine());
		
		input.close();
		
		if(num1 > num2) {
			if(num1 > num3) { // se puede agregar un if adentro de otro if 
				
			System.out.println("El mayor es "  +num1);	
			}else {
				System.out.println("El mayor es " + num3);
			}
		}else if(num2 > num3) {
			
			System.out.println("el mayor es " + num2);
			if (num1 > num3) {
				System.out.println("El mayor es " + num3);
			
			}
			
			
		} 
			
	}




	}


