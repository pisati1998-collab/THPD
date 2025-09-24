package clase01;

import java.util.Scanner;

public class practicaartistas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int CANT_BARRIO = 2;
		final double CONVERSOR_ML_LT = 0.001;
		String nombreBarrio,nombreArtista,artistaMax = " ";
		int horas , pintura  ,pinturaMax = 0;
		final String  FIN =  "FIN";
		double promedioPintura;
		int totalPinturaGlobal = 0;





		for(int i = 1; i <= CANT_BARRIO ; i++) {
			
			 int totalHoras = 0 , totalPintura =0 , cantObras = 0 ; 
			
					



			do {
				System.out.println("Ingrese nombre del barrio");
				nombreBarrio =input.nextLine();
			}while(nombreBarrio.isBlank());

			do {
				System.out.println("Ingrese Nombre de Artista o FIN para salir ");
				nombreArtista = input.nextLine();

			}while(nombreArtista.isBlank());



			while(!nombreArtista.equalsIgnoreCase(FIN)){
				
				


				do {
					System.out.println("Ingrese Cantidad de Horas ");
					horas = Integer.parseInt(input.nextLine());

				}while(horas <= 0);
				
				
				

				do {
					System.out.println("Ingrese Cantidad de Pintura ");
					pintura = Integer.parseInt(input.nextLine());

				}while(pintura < 0);
				
				
				cantObras++;
				totalHoras += horas ;
				totalPintura += pintura;
				 totalPinturaGlobal += totalPintura;

				
				


				do {
					System.out.println("Ingrese Nombre de Artista o FIN para salir ");
					nombreArtista = input.nextLine();

				}while(nombreArtista.isBlank());
				
				
				if(pintura > pinturaMax) {
					
					pinturaMax = pintura;
					artistaMax = nombreArtista;
					
					
				}




			}

			promedioPintura  = (totalPintura  * CONVERSOR_ML_LT ) / cantObras;
			
			
			System.out.println("Cantidad de horas necesarias en  " +nombreBarrio+ " Es "  +totalHoras+ " hs");
			System.out.println("Cantidad de pintura necesaria en " +nombreBarrio + " Es " + promedioPintura + "Lts");
			System.out.println("Total pintura necesitada: " + (totalPintura* CONVERSOR_ML_LT+ " Lts"));



		}
          System.out.println("total de pintura necesaria para los 10 barrios " + totalPinturaGlobal);
		input.close();
	}

}
