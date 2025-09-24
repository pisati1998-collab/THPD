package clase01;

import java.util.Scanner;

public class ejercicioartistasprofe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int CANT_BARRIOS = 3;
		final double MIL_A_LITROS = 0.001;
		final String FIN = "FIN";
		String artista, barrio, maxArtista = "";
		int horasObra, cantPintura, pinturaTotal = 0, maxPintura = 0;


		for(int i = 0; i < CANT_BARRIOS; i++) {

			int cantHoras = 0, cantObras = 0, pinturaBarrio = 0;

			do {
				System.out.println("Ingrese el nombre del barrio");
				barrio = input.nextLine();
			}while(barrio.isBlank());

			do {
				System.out.println("Ingrese el nombre del artista, o FIN para terminar la carga");
				artista = input.nextLine();
			}while(artista.isBlank());


			while(!artista.equalsIgnoreCase(FIN)) {
				do {
					System.out.println("Ingrese horas necesarias para finalizar la obra");
					horasObra = Integer.parseInt(input.nextLine());
				}while(horasObra <= 0);

				do {
					System.out.println("Ingrese cant de pintura en mililitros");
					cantPintura = Integer.parseInt(input.nextLine());
				}while(cantPintura < 1);

				cantObras++;
				cantHoras += horasObra;
				pinturaBarrio += cantPintura;

				if(cantPintura > maxPintura) {
					maxPintura = cantPintura;
					maxArtista = artista;
				}

				do {
					System.out.println("Ingrese el nombre del artista, o FIN para terminar la carga");
					artista = input.nextLine();
				}while(artista.isBlank());
			}

			pinturaTotal += pinturaBarrio;

			double promPinturaBarrio = (pinturaBarrio * MIL_A_LITROS)/ cantObras;

			System.out.println("Cantidad de horas de trabajo necesarias en " + barrio +": " + cantHoras + "hs.");
			System.out.println("Promedio de pintura por obra en " + barrio +": " + promPinturaBarrio + "l.");

		}

		System.out.println("Total pintura necesitada: " + (pinturaTotal * MIL_A_LITROS));
		System.out.println("El artista que más pintura gastó fue " + maxArtista + " con " + (maxPintura * MIL_A_LITROS) + "l.");

		input.close();
	}

}




