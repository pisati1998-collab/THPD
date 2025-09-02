package tp1;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		int cant , num, numMay = 0;
		int pos = 1;


		System.out.println("Ingrese la cantidad de numero");
		cant = Integer.parseInt(input.nextLine());


		for(int i =1; i <= cant ; i++) {

			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());

			if(i == 1) {

				numMay = num;
				pos  = i;

			}else if (num > numMay) {

				numMay = num;
				pos = i;
			}



		}
		System.out.println("la posicion " +pos);
		System.out.println("El numero mayor es " +numMay);
		
		

   input.close();
	}
    
		
		
		
		
		

	}

}
