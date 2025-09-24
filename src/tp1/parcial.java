package parcial;

public class parcial {

	
		import java.util.Scanner;

		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    final String FIN_DATOS = "FIN";
		    final int CANT_BARRIOS = 2;
		    String nombreBarrio = "";
		    int pinturaTotalBarrio = 0;
		    int cantMuralesDelBarrio = 0;
		    int hsTotales = 0;
		    String nombreArtista = "";
		    int hsEstimadas;
		    int pinturaEstimada;
		    int pinturaMaxima = 0;
		    String artistaMaximo = "";
		    int pinturaTotalEstimada = 0;
		    double promedio = 0;

		    int barriosSinAbstracto = 0;
		    int barriosSinObras = 0;

		    for (int nroBarrio = 1; nroBarrio <= CANT_BARRIOS; nroBarrio++) {
		        hsTotales = 0;
		        cantMuralesDelBarrio = 0;
		        pinturaTotalBarrio = 0;
		        boolean hayAbstracto = false;

		        do {
		            System.out.println("Ingrese nombre del barrio: ");
		            nombreBarrio = input.nextLine();
		        } while (nombreBarrio.isEmpty());

		        System.out.println("Ingrese el nombre del artista (o 'FIN' para terminar): ");
		        nombreArtista = input.nextLine();

		        while (!nombreArtista.equalsIgnoreCase(FIN_DATOS)) {
		            do {
		                System.out.println("Ingrese hs estimadas: ");
		                hsEstimadas = Integer.parseInt(input.nextLine());
		            } while (hsEstimadas <= 0);

		            do {
		                System.out.println("Ingrese pintura estimadas: ");
		                pinturaEstimada = Integer.parseInt(input.nextLine());
		            } while (pinturaEstimada <= 0);

		            char estilo;
		            do {
		                System.out.println("Ingrese estilo de arte ('G'=Graffiti, 'R'=Realismo, 'A'=Abstracto): ");
		                estilo = input.nextLine().toUpperCase().charAt(0);
		            } while (estilo != 'G' && estilo != 'R' && estilo != 'A');
		            

		            if (estilo == 'A') {
		                hayAbstracto = true;
		            }

		            hsTotales += hsEstimadas;
		            pinturaTotalBarrio += pinturaEstimada;
		            cantMuralesDelBarrio++;

		            if (pinturaEstimada > pinturaMaxima) {
		                pinturaMaxima = pinturaEstimada;
		                artistaMaximo = nombreArtista;
		            }

		            System.out.println("Ingrese el nombre del artista (o 'FIN' para terminar): ");
		            nombreArtista = input.nextLine();
		        }

		        pinturaTotalEstimada += pinturaTotalBarrio;
		        System.out.println("Estadísticas de: " + nombreBarrio);
		        if (cantMuralesDelBarrio != 0) {
		            promedio = (double) pinturaTotalBarrio / cantMuralesDelBarrio;
		            System.out.println("Horas: " + hsTotales);
		            System.out.println("Promedio de pintura: " + (promedio / 1000));
		        } else {
		            System.out.println("No se ingresaron artistas para este barrio");
		            barriosSinObras++;
		        }

		        if (!hayAbstracto) {
		            System.out.println(" En el barrio '" + nombreBarrio + "' no participó ningún artista de estilo Abstracto.");
		            barriosSinAbstracto++;
		        }
		    }

		    if (pinturaTotalEstimada != 0) {
		        System.out.println("Pintura necesaria estimada total en litros: " + ((double) pinturaTotalEstimada / 1000));
		        System.out.println("El artista que más pintura necesita es: " + artistaMaximo);
		    } else {
		        System.out.println("No se ingresó ningún artista de ningún barrio");
		    }

		    System.out.println("Cantidad de barrios sin artistas de estilo Abstracto: " + barriosSinAbstracto);
		    System.out.println("Cantidad de barrios sin obras pintadas: " + barriosSinObras);
		

	}


