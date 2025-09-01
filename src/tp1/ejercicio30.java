package tp1;

import java.util.Scanner;

public class ejercicio30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		char operacion;
		int num1,num2;
		double resultado;

		do {
			System.out.println("Ingrese la operacion  (+, - ,*, / o F para salir ) : ");
			operacion = input.next().charAt(0);
			if(operacion != 'F') {
				System.out.println("Ingrese el primer numero");
				num1 = Integer.parseInt(input.nextLine());
				System.out.println("Ingrese el segundo numero");
				num2 = Integer.parseInt(input.nextLine());

				switch(operacion) {


				case '+' :

					resultado = num1 + num2;
					System.out.println( " Resultado: " + resultado);
					break;

				case '-' :
					resultado = num1 - num2;
					System.out.println( " resultado: " + resultado);
					break;
				case '/':
					if(num2 != 0) {
						resultado = (double) num1 / num2;
						System.out.println( " resultado: " + resultado);
					}else {
						System.out.println("No se puede ir por 0");
					}

					break;

				case '*':
					resultado = num1 * num2;
					System.out.println( " resultado: " + resultado);

					break;
				default:
					System.out.println("Operacion no valida");
				}

			}


		}while(operacion != 'F');

		System.out.println("Programa finalizado");

		input.close();




	}

}
