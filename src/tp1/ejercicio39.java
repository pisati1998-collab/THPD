package tp1;

import java.util.Scanner;



public class ejercicio39 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);


		String ganadorNombre = "";
		int ganadorPuntos = 0 , tirosCentroTotales = 0, jugadores ;
		final int CANT_TIROS = 3;


		do{
			System.out.println("Ingrese la cantidad de jugadores( mayor o igual a 2 ): ");
			jugadores = Integer.parseInt(input.nextLine());
		}while (jugadores < 2);



		for(int i = 1; i <= jugadores; i++){

			String nombre = "";

			int total = 0;

			do {
				System.out.println("Nombre del jugador " + i + ": ");
				nombre = input.nextLine();

			}while(nombre.isEmpty());



			for(int t = 1; t <= CANT_TIROS; t++){

				double distancia ;

				do {
					System.out.println("\"  Distancia del tiro "  + t +  " no ingresar un valor menor a 0 ");
					distancia = Double.parseDouble(input.nextLine());
				}while(distancia < 0);

				if (distancia == 0) {
					tirosCentroTotales++;
				}


				int categoria;

				if(distancia == 0) {
					categoria = 0;

				}
				else if(distancia <= 10) {

					categoria = 1;
				}
				else if( distancia <= 50) {

					categoria = 2;
				}	
				else {

					categoria =3;
				}

				int puntos;

				switch(categoria) {

				case 0 : puntos = 500;
				break;

				case 1 : puntos = 250;
				break;

				case 2 : puntos = 100;
				break;

				default :puntos = 0;
				break;


				}
				total += puntos;


			}

			System.out.println("Puntaje de " + nombre + ":"  +total);

			if(total > ganadorPuntos) {

				ganadorPuntos = total;
				ganadorNombre = nombre;

			}


		}
		System.out.println("Ganador: " + ganadorNombre + " con " + ganadorPuntos + " puntos.");
		System.out.println("Cantidad total de tiros al centro (distancia 0): " + tirosCentroTotales);
		input.close();
	}
} 

