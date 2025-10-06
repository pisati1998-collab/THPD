package clase01;

import java.util.Scanner;

public class bandasparcial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int CANT_ESCENARIOS = 2;
		final char ROCK= 'R', POP= 'P', JAZZ= 'J';
		int totalWattsFestival = 0;
		String bandaMaxWatts = "";
		int maxWatts = 0;
		String nombreEscenario, nombreBanda;
		int escenariosSinJazz = 0, minutos, watts;
		char estilo, hayDebut = 'S'; 
		char debut;
		final char SI_DEBUT = 'S', NO_DEBUT = 'N';
		int cantBandasDebut = 0, totalDebut = 0;

		for (int i = 0; i < CANT_ESCENARIOS; i++) {
			do {
				System.out.print("Ingrese nombre del escenario " + i + ": ");
				nombreEscenario = input.nextLine();
			}while (nombreEscenario.isEmpty());

			cantBandasDebut = 0;
			escenariosSinJazz = 0;
			int totalMinutosEscenario = 0;
			int totalWattsEscenario = 0;
			int cantBandasEscenario = 0;
			boolean hayJazz = false;

			do {
				System.out.println("Ingrese bandas para el escenario " + nombreEscenario + " (FIN para terminar):");
				nombreBanda = input.nextLine();
			}while (nombreBanda.isEmpty());
			while (!nombreBanda.equals("FIN")) {

				do {
					System.out.println("Es una banda debut? (S/N) ");
					debut = input.nextLine().toUpperCase().charAt(0);
				}while(debut != 'S' && debut != 'N'); 
				if (debut == SI_DEBUT) {
					cantBandasDebut++;
					totalDebut++;
				}
				do {
					System.out.print("Duración en minutos: ");
					minutos = Integer.parseInt(input.nextLine());
				}while (minutos <= 0);

				do {
					System.out.print("Watts necesarios: ");
					watts = Integer.parseInt(input.nextLine());
				} while (watts <= 0);

				do {
					System.out.print("Estilo (R/P/J): ");
					estilo = input.nextLine().toUpperCase().charAt(0);
				}while (estilo != 'R' && estilo != 'P' && estilo != 'J');

				if (estilo == 'J') {
					hayJazz = true;
				}

				totalMinutosEscenario += minutos;
				totalWattsEscenario += watts;    
				cantBandasEscenario++;

				if (watts > maxWatts) { 
					maxWatts = watts;
					bandaMaxWatts = nombreBanda;
				}

				totalWattsFestival += watts;


				do {
					System.out.println("Ingrese bandas para el escenario " + nombreEscenario + " (FIN para terminar):");
					nombreBanda = input.nextLine();
				}while (nombreBanda.isEmpty());
			}
			System.out.println("La cantidad de debuts que hubo en el festival " + nombreEscenario + " fue de " + cantBandasDebut );
			System.out.println("Escenario " + nombreEscenario + ":");
			System.out.println("  Total minutos de show: " + totalMinutosEscenario);

			if (cantBandasEscenario > 0) {
				double promedioWatts = totalWattsEscenario / (double)cantBandasEscenario;
				System.out.println("  Promedio de watts: " + promedioWatts);
			} else {
				System.out.println("  No hubo bandas en este escenario.");
			}

			if (!hayJazz) {
				escenariosSinJazz++;
				System.out.println("  --> No hubo Jazz en este escenario");
			}
		}
		System.out.println("La cantidad total de debuts que hubo fue de " + totalDebut);
		System.out.println("\nTotal watts del festival: " + totalWattsFestival);
		System.out.println("Banda que más watts necesitó: " + bandaMaxWatts + " (" + maxWatts + ")");
		System.out.println("Cantidad de escenarios sin Jazz: " + escenariosSinJazz);

		input.close();
	}
}