package clase01;

import java.util.Scanner;

public class vacunacionparcial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int CANT_CENTROS = 10;

		int dosisGlobal = 0;
		int horasGlobal = 0;
		int totalEnfermerosGlobal = 0;
		int horas, dosis;
		int totalEnfermeros = 0;
		String topEnfermero = "", centro, nombre;
		int maxDosisEnfermero = 0;
		 int cantEnfermeros = 0;


		String topCentro = "";
		int maxDosisCentro = 0;

		String listaCentrosSin = "";
		int centrosSinEnfermeros = 0;

		String topCentroProd = "";
		double maxProd = 0.0;

		for (int i = 0; i < CANT_CENTROS; i++) {
			int dosisCentro = 0;
			int horasCentro = 0;
			int enfermerosCentro = 0;
			  cantEnfermeros = 0;
			do {
				System.out.print("Nombre del centro: ");
				centro = input.nextLine().trim();
			}while (centro.equalsIgnoreCase(""));
			do { 
				System.out.print("Nombre del enfermero (o FIN): ");
				nombre = input.nextLine().trim();
				
			} while (nombre.equalsIgnoreCase(""));
			while (!nombre.equalsIgnoreCase("FIN")) {
				do {
					System.out.print("Horas trabajadas: ");
					horas = Integer.parseInt(input.nextLine().trim());
				}	while (horas <= 0); 
				do {
					System.out.print("Dosis aplicadas: ");
					dosis = Integer.parseInt(input.nextLine().trim());
				} while (dosis <= 0);
				horasCentro += horas;
				dosisCentro += dosis;
				cantEnfermeros++;


				if (dosis > maxDosisEnfermero) {
					maxDosisEnfermero = dosis;
					topEnfermero = nombre;
				}

				System.out.print("Nombre del enfermero (o FIN): ");
				nombre = input.nextLine().trim();
			}

			if (cantEnfermeros == 0) {
				centrosSinEnfermeros++;
				//if (!listaCentrosSin.isEmpty());
				centro = centro + ", ";
				listaCentrosSin += centro;
			}

			dosisGlobal = dosisCentro;
			horasGlobal += horasCentro;

			if (dosisCentro > maxDosisCentro) {
				maxDosisCentro = dosisCentro;
				topCentro = centro;
			}

			double promDosisEnfermero = (enfermerosCentro == 0) ? 0.0 : (dosisCentro / cantEnfermeros);
			double productividad = (enfermerosCentro == 0) ? 0.0 : (horasCentro / (double) dosisCentro);

			if (productividad >= maxProd) {
				maxProd = productividad;
				topCentroProd = centro;
			}

			System.out.printf("Centro %s — Horas totales: %d, Promedio dosis/enfermero: %.2f, Productividad: %.2f%n",
					centro, horasGlobal, promDosisEnfermero, productividad);
		}

		
		double promedioGlobalPorEnfermero = (CANT_CENTROS == 0) ? 0.0 : ((double) dosisGlobal /cantEnfermeros );

		System.out.println("\nDosis totales (global): " + dosisGlobal);
		if (topEnfermero.isEmpty()) {
			System.out.println("Top enfermero: (sin datos)");
		} else {
			System.out.printf("Top enfermero: %s (%d dosis)%n", topEnfermero, maxDosisEnfermero);
		}

		if (topCentro.isEmpty()) {
			System.out.println("Centro con más dosis: (sin datos)");
		} else {
			System.out.printf("Centro con más dosis: %s (%d)%n", topCentro, maxDosisCentro);
		}

		if (centrosSinEnfermeros == 0) {
			System.out.println("No hubo centros sin enfermeros.");
		} else {
			System.out.println("Centros sin enfermeros (" + centrosSinEnfermeros + "): " + listaCentrosSin);
		}

		if (topCentroProd.isEmpty()) {
			System.out.println("Centro más productivo: (sin datos)");
		} else {
			System.out.printf("Centro más productivo: %s (%.2f)%n", topCentroProd, maxProd);
		}

		System.out.printf("Promedio global de dosis por enfermero: %.2f%n", promedioGlobalPorEnfermero);

		input.close();

	}

}
