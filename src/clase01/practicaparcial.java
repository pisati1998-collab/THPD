package clase01;

import java.util.Scanner;

public class practicaparcial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final int CANT_PLAZAS = 2;
        String grupoMaxAfiches = "";
        int maxAfiches = 0;
        int afichesGlobal = 0;

        int minutosPlaza = 0;
        int afichesPlaza = 0;
        int gruposPlaza = 0;

        for (int i = 1; i <= CANT_PLAZAS ; i++) {
        	
        	gruposPlaza =0 ;
        	afichesPlaza = 0;
        	minutosPlaza =0;
        	
        	
        	
            System.out.print("\nNombre de la plaza: ");
            String plaza = sc.nextLine().trim();

            System.out.print("Nombre del grupo (o FIN): ");
            String grupo = sc.nextLine().trim();

            while (!grupo.equalsIgnoreCase("FIN")) {
                System.out.print("Minutos estimados: ");
                int minutos = Integer.parseInt(sc.nextLine().trim());

                System.out.print("Afiches necesarios: ");
                int afiches = Integer.parseInt(sc.nextLine().trim());

                minutosPlaza += minutos;
                afichesPlaza += afiches;
                gruposPlaza++;
                


                if (afiches > maxAfiches) {
                    maxAfiches = afiches;
                    grupoMaxAfiches = grupo;
                }

                System.out.print("Nombre del grupo (o FIN): ");
                grupo = sc.nextLine().trim();
            }

            afichesGlobal += afichesPlaza;


            double promAfiches = (gruposPlaza == 0) ? 0 : (afichesPlaza / gruposPlaza);
            System.out.printf("Plaza %s — Minutos totales: %d, Promedio afiches/obra: %.2f%n",
                    plaza, minutosPlaza, promAfiches);
        }

        System.out.println("\nAfiches totales (global): " + afichesGlobal);
        if (grupoMaxAfiches.isEmpty()) {
            System.out.println("No se registraron grupos.");
        } else {
            System.out.printf("Grupo con más afiches: %s (%d)%n", grupoMaxAfiches, maxAfiches);
        }

        sc.close();
    }


	}


