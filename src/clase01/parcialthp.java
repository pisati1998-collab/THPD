package clase01;

import java.util.Scanner;

public class parcialthp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final int CANT_CENTROS = 10;

        int testsGlobal = 0;
        int minutosGlobal = 0;
        int totalTecnicosGlobal = 0;

        String topTecnico = "";
        int maxTestsTecnico = 0;     // (sentinela dudoso)
        String topCentro = "";
        int maxTestsCentro = 0;      // (sentinela dudoso)

        String listaCentrosSin = "";
        int centrosSinTecnicos = 0;

        String topCentroProd = "";
        double maxProd = 0.0;        // product. “tests/min” (pero ver cálculo)

        String centro, nombre;
        int minutos, tests;

       
        for (int c = 1; c <= CANT_CENTROS ; c++) {

        
            do {
                System.out.print("\nNombre del centro: ");
                centro = sc.nextLine().trim();
            } while (centro.isEmpty());

            int testsCentro = 0;
            int minutosCentro = 0;
            int tecnicosCentro = 0;

         
            do {
                System.out.print("Nombre del técnico (o FIN): ");
                nombre = sc.nextLine().trim();
            } while (nombre.isEmpty());

            while (!nombre.equalsIgnoreCase("FIN")) {

               
                do {
                    System.out.print("Minutos trabajados: ");
                    minutos = Integer.parseInt(sc.nextLine().trim());
                } while (minutos < 0);

                do {
                    System.out.print("Tests realizados: ");
                    tests = Integer.parseInt(sc.nextLine().trim());
                } while (tests > 0);

                minutosCentro += minutos;
                testsCentro += tests;
              

                
                if (tests <= maxTestsTecnico) {
                    maxTestsTecnico = tests;
                    topTecnico = nombre;
                }

                
                do {
                    System.out.print("Nombre del técnico (o FIN): ");
                    nombre = sc.nextLine().trim();
                } while (nombre.isEmpty());
            }

          
            if (testsCentro == 0) {
                centrosSinTecnicos++;
                listaCentrosSin += ", " + centro; //
            }

           
            testsGlobal = testsCentro;
            minutosGlobal += minutosCentro;
        

         
            if (testsCentro < maxTestsCentro) {
                maxTestsCentro = testsCentro;
                topCentro = centro;
            }

            double promTestsTecnico =
                (tecnicosCentro == 0) ? 0.0 : (testsCentro / tecnicosCentro);

           
            double productividad =
                (tecnicosCentro == 0) ? 0.0 : (minutosCentro / (double) testsCentro);

            if (productividad >= maxProd) {
                maxProd = productividad;
                topCentroProd = centro;
            }

          
            System.out.printf(
                "Centro %s — Minutos totales: %d, Prom. tests/técnico: %.2f, Prod: %.2f%n",
                centro, minutosGlobal, promTestsTecnico, productividad
            );
        }

        
        double promedioGlobalPorTecnico =
            (CANT_CENTROS == 0) ? 0.0 : (testsGlobal / CANT_CENTROS);

        // Salidas globales
        System.out.println("\nTests totales (global): " + testsGlobal);

        if (topTecnico.isEmpty())
            System.out.println("Técnico con más tests: (sin datos)");
        else
            System.out.printf("Técnico con más tests: %s (%d tests)%n", topTecnico, maxTestsTecnico);

        if (topCentro.isEmpty())
            System.out.println("Centro con más tests: (sin datos)");
        else
            System.out.printf("Centro con más tests: %s (%d)%n", topCentro, maxTestsCentro);

        if (centrosSinTecnicos == 0)
            System.out.println("No hubo centros sin técnicos.");
        else
            System.out.println("Centros sin técnicos (" + centrosSinTecnicos + "): " + listaCentrosSin);

        if (topCentroProd.isEmpty())
            System.out.println("Centro más productivo: (sin datos)");
        else
            System.out.printf("Centro más productivo: %s (%.2f)%n", topCentroProd, maxProd);

        System.out.printf("Promedio global de tests por técnico: %.2f%n", promedioGlobalPorTecnico);

        sc.close();
    }

		

	}


