package tp1;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un Numero Entero");
		int num = Integer.parseInt(input.nextLine());

		for(int i = 1; i <=10; i++ ) {
			System.out.println(num + "x" +  i +  "=" + (num*i));

		}



		input.close();
	}


}
