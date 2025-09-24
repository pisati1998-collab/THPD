package clase01;

import java.util.Scanner;

public class ejerciciopreparcial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int CANT_BARRIO = 10;
		String nombreBarrio , nombreArtista;
		int horasObras = 0 , cantPintura = 0 , totalHorasTrabajas = 0 , totalPintura = 0 , cantObras = 0 ,totalPinturaArtista = 0 ,pinturaDelBarrio = 0 , maxPintura =0;
		final String FIN = "Fin";
		double  promedio  = 0 ;
		String artistaMaxPintura = "";




		for(int i = 1 ;  i <= CANT_BARRIO ;i++) {

			do {

				System.out.println("Ingrese el nombre del barrio");
				nombreBarrio = input.nextLine();

			}while(nombreBarrio.isBlank());

			do {

				System.out.println("Ingrese nombre del artista o fin para finalizar" );
				nombreArtista = input.nextLine();

			}while(nombreArtista.isBlank());
			
			
			cantObras = 0;
			pinturaDelBarrio = 0;
			totalHorasTrabajas = 0;
			cantObras++;
			

		

			while(!nombreArtista.equalsIgnoreCase(FIN)) {
				
				
				do {
					System.out.println("Ingrese horas necesaria para finalizar la obra ");
					horasObras = Integer.parseInt(input.nextLine());
					
					


				}while(horasObras <= 0);


				
				do {

					System.out.println("Ingrese la cantidad de pintura en milititros ");
					cantPintura = Integer.parseInt(input.nextLine());

				}while(cantPintura < 0);
				
				
				
				totalHorasTrabajas += horasObras;
				totalPintura += cantPintura;
				totalPinturaArtista += cantPintura;
				pinturaDelBarrio += cantPintura;
				
				
				
				
				
				
				do {

					System.out.println("Ingrese nombre del artista o fin para finalizar" );
					nombreArtista = input.nextLine();

				}while(nombreArtista.isBlank()); 
				
				if (cantPintura > maxPintura) {
				    maxPintura = cantPintura;
				    artistaMaxPintura = nombreArtista;
				}




				
			}
			
			 
			System.out.println("Las horas trabajadas  para " +nombreBarrio+  " Es de " +totalHorasTrabajas);
			System.out.println("La Cantidad de pintura " + ((totalPintura / 1000) / cantObras));
			System.out.println("El artista que más pintura utilizó fue: " + artistaMaxPintura + " con " + maxPintura + " ml");

			

			



		}

		




	}

}
