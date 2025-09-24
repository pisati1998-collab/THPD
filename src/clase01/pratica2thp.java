package clase01;

import java.util.Scanner;

public class pratica2thp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final int CANT_ZONAS = 10;

        int arbolesGlobal = 0;
        int horasGlobal = 0;
        int arboles ;
        int horas ;

        String topVoluntario = "";
        int maxArbolesVoluntario = 0;

        String topZona = "";
        int maxArbolesZona = 0;

        String zonasSin = "";
        int cantZonasSin = 0;

       
       
      

        for (int z = 1; z <= CANT_ZONAS ; z++) {
        	
        	
        	
        	
            System.out.print("\nNombre de la zona: ");
            String zona = sc.nextLine().trim();
            
            int arbolesZona =0 ;
            int horasZona = 0;
            int voluntariosZona =  0;

            System.out.print("Nombre del voluntario (o FIN): ");
            String nombre = sc.nextLine().trim();

            topVoluntario = "";
            maxArbolesVoluntario = 0;

            while (!nombre.equalsIgnoreCase("FIN")) {
            	
            	do {
                System.out.print("Árboles plantados: ");
                arboles = Integer.parseInt(sc.nextLine().trim());
            	}while(arboles > 0);
                 
            	do {
                System.out.print("Horas trabajadas: ");
                 horas = Integer.parseInt(sc.nextLine().trim());
            	}while(horas > 0);

                arbolesZona += arboles;
                horasZona += horas;
                voluntariosZona ++;
                

                if (arboles > maxArbolesVoluntario) {
                    maxArbolesVoluntario = arboles;
                    topVoluntario = nombre;
                }

                System.out.print("Nombre del voluntario (o FIN): ");
                nombre = sc.nextLine().trim();
            }

            if (voluntariosZona == 0) {
                cantZonasSin++;
                if (zonasSin.isEmpty()) zonasSin += ", ";
                zonasSin += zona;
            }

            arbolesGlobal += arbolesZona;
            horasGlobal += horasZona;

            if (arbolesZona > maxArbolesZona) {
                maxArbolesZona = arbolesZona;
                topZona = zona;
            }

            double promedio = (voluntariosZona == 0) ? 0.0 : (arbolesZona / voluntariosZona);
            double productividad = (horasZona == 0) ? 0.0 : (arbolesZona / (double) horasZona);

            System.out.printf("Zona %s — Árboles totales: %d, Promedio árboles/voluntario: %.2f, Productividad: %.2f%n",
                    zona, arbolesZona, promedio, productividad);
        }

        System.out.println("\nÁrboles totales (global): " + arbolesGlobal);

        if (topVoluntario.isEmpty()) {
            System.out.println("Top voluntario: (sin datos)");
        } else {
            System.out.printf("Top voluntario: %s (%d árboles)%n", topVoluntario, maxArbolesVoluntario);
        }

        if (topZona.isEmpty()) {
            System.out.println("Top zona: (sin datos)");
        } else {
            System.out.printf("Top zona: %s (%d árboles)%n", topZona, maxArbolesZona);
        }

        if (cantZonasSin == 0) {
            System.out.println("No hubo zonas sin voluntarios.");
        } else {
            System.out.println("Zonas sin voluntarios (" + cantZonasSin + "): " + zonasSin);
        }

        sc.close();
    }

		

	}


