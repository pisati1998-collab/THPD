package tp1;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroEntero;
		System.out.println("Ingrese un Numero Entero");
		numeroEntero = Integer.parseInt(input.nextLine());
		
		if(numeroEntero == 1) {
			System.out.println("El Numero Ingresa es" + numeroEntero +"Corresponde al Dia Domingo");
		}
		else if(numeroEntero == 2) {
			System.out.println("El Numero Ingresa es " + numeroEntero +" Corresponde al Dia Lunes");
		}
		else if(numeroEntero == 3) {
			System.out.println("El Numero Ingresa es " + numeroEntero +" Corresponde al Dia Martes");
			
		}
		else if(numeroEntero == 4) {
			System.out.println("El Numero Ingresa es " + numeroEntero +" Corresponde al Dia Miercoles");
		}
		else if(numeroEntero == 5) {
			System.out.println("El Numero Ingresa es " + numeroEntero +" Corresponde al Dia Jueves");
		}
		else if(numeroEntero == 6) {
			System.out.println("El Numero Ingresa es " + numeroEntero +" Corresponde al Dia Viernes");
		}
		else if(numeroEntero == 7) {
			System.out.println("El Numero Ingresa es " + numeroEntero +" Corresponde al Dia Sabado");
		}
		else {
			System.out.println("Error");
		}
		
		input.close();
			
			
		
		
		

	}

}
