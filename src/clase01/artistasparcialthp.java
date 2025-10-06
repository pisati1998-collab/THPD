package clase01;

import java.util.Scanner;

public class artistasparcialthp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 final int CANT_BARRIOS = 2;
	        final String FIN = "FIN";
	        final char G = 'G', R = 'R', A = 'A';

	        int totalPinturaMlGlobal = 0;
	        String artistaMaximo = "";
	        int pinturaMaximaMl = 0;

	        int totalEcoGlobal = 0;
	        String barriosSinAbstractoListado = "";
	        int barriosSinAbstracto = 0;

	        for (int i = 1; i <= CANT_BARRIOS; i++) {
	            String barrio;
	            do {
	                System.out.print("Barrio: ");
	                barrio = sc.nextLine().trim();
	            } while (barrio.isEmpty());

	            int horasBarrio = 0;
	            int pinturaMlBarrio = 0;
	            int cantMuralesBarrio = 0;
	            boolean huboAbstracto = false;
	            int ecoBarrio = 0;

	            String nombre;
	            do {
	                System.out.print("Nombre del artista (FIN para terminar): ");
	                nombre = sc.nextLine().trim();

	                if (!nombre.equalsIgnoreCase(FIN)) {

	                    while (nombre.isEmpty()) {
	                        System.out.print("Reingresar nombre: ");
	                        nombre = sc.nextLine().trim();
	                    }

	                    char estilo;
	                    do {
	                        System.out.print("Estilo (G/R/A): ");
	                        String s = sc.nextLine().trim().toUpperCase();
	                        estilo = s.isEmpty() ? ' ' : s.charAt(0);
	                    } while (estilo != G && estilo != R && estilo != A);

	                    int horas;
	                    do {
	                        System.out.print("Horas estimadas (>0): ");
	                        String s = sc.nextLine().trim();
	                        horas = s.matches("\\d+") ? Integer.parseInt(s) : -1;
	                    } while (horas <= 0);

	                    int pinturaMl;
	                    do {
	                        System.out.print("Pintura estimada (ml) (>0): ");
	                        String s = sc.nextLine().trim();
	                        pinturaMl = s.matches("\\d+") ? Integer.parseInt(s) : -1;
	                    } while (pinturaMl <= 0);

	                    char eco;
	                    do {
	                        System.out.print("¿Material eco? (S/N): ");
	                        String s = sc.nextLine().trim().toUpperCase();
	                        eco = s.isEmpty() ? ' ' : s.charAt(0);
	                    } while (eco != 'S' && eco != 'N');

	                    if (eco == 'S') {
	                        ecoBarrio++;
	                        totalEcoGlobal++;
	                    }

	                    horasBarrio += horas;
	                    pinturaMlBarrio += pinturaMl;
	                    totalPinturaMlGlobal += pinturaMl;

	                    cantMuralesBarrio++;

	                    if (pinturaMl > pinturaMaximaMl) {
	                        pinturaMaximaMl = pinturaMl;
	                        artistaMaximo = nombre;
	                    }

	                    if (estilo == A) {
	                        huboAbstracto = true;
	                    }
	                }

	            } while (!nombre.equalsIgnoreCase(FIN));

	            double promedioLitrosBarrio = 0;
	            if (cantMuralesBarrio > 0) {
	                promedioLitrosBarrio = (pinturaMlBarrio / 1000) / (double) cantMuralesBarrio;
	            }

	            System.out.println("\n--- Estadísticas del barrio: " + barrio + " ---");
	            System.out.println("Horas totales: " + horasBarrio);
	            System.out.println("Pintura total (L): " + ((double)pinturaMlBarrio/1000));
	            System.out.println("Promedio pintura por mural (L): " + promedioLitrosBarrio);
	            System.out.println("Artistas con material eco: " + ecoBarrio);

	            if (!huboAbstracto) {
	                barriosSinAbstractoListado += (barrio + ", ");
	                barriosSinAbstracto++;
	            }
	        }

	        System.out.println("\n=== Estadísticas globales ===");
	        System.out.println("Total pintura global (L): " + ((double)totalPinturaMlGlobal / 1000));

	        if (artistaMaximo.isEmpty()) {
	            System.out.println("Artista con más pintura: (sin datos)");
	        } else {
	            System.out.println("Artista con más pintura: " + artistaMaximo + " (" + pinturaMaximaMl + " ml)");
	        }

	        if (barriosSinAbstractoListado.endsWith(", ")) {
	            barriosSinAbstractoListado = barriosSinAbstractoListado.substring(0, barriosSinAbstractoListado.length() - 2);
	        }
	        System.out.println("Barrios sin Abstracto: " + barriosSinAbstractoListado);
	        System.out.println("Cantidad de barrios sin Abstracto: " + barriosSinAbstracto);
	        System.out.println("Total artistas con material eco: " + totalEcoGlobal);
	    }
	}





	


