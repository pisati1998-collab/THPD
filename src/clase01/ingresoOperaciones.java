package clase01;

import java.util.Scanner;

public class ingresoOperaciones {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1 ;
		System.out.println("ingreso un numero");
		num1 = Integer.parseInt(input.nextLine());
		// double.parseDouble(input.nextLine());
		System.out.println("numero ingresado es " + num1);
		
		double num2 ;
		System.out.println("ingrese un numero con coma");
		num2 = Double.parseDouble(input.nextLine());
		System.out.println("el otro numero ingresado es"+ num2);
		
		double multiplicacion = (num1*num2);
		double division = num1 /num2;
		
		
		System.out.println(num1 + " = " +  (num1+num2));
		System.out.println(num1 + " = " +  (num2 - num2 ));
		System.out.println(num1 + " = " +  (multiplicacion ));
		System.out.println(num1 + " = " +  (division  ));
		
		input.close();
		

	}

}
