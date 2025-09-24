package clase01;

import java.util.Scanner;

public class practicathp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final int CANT_CENTROS = 10;

        int dosisGlobal = 0;
        int horasGlobal = 0;
        int totalEnfermerosGlobal = 0;

        String topEnfermero = "";
        int maxDosisEnfermero = -1;

        String topCentro = "";
        int maxDosisCentro = -1;

        String listaCentrosSin = "";
        int centrosSinEnfermeros = 0;

        String topCentroProd = "";
        double maxProd = -1.0; // dosis/hora

        String centro, nombre;
        int horas, dosis;

        for (int c = 1; c <= CANT_CENTROS; c++) {

            // Centro no vacío
            do {
                System.out.print("\nNombre del centro: ");
                centro = sc.nextLine().trim();
            } while (centro.isEmpty());

            int dosisCentro = 0;
            int horasCentro = 0;
            int enfermerosCentro = 0;

            // Primer nombre: permitir FIN o, si no es FIN, exigir no vacío
            while (true) {
                System.out.print("Nombre del enfermero (o FIN): ");
                nombre = sc.nextLine().trim();
                if (nombre.equalsIgnoreCase("FIN") || !nombre.isEmpty()) break;
                System.out.println("Nombre inválido. Ingresá un nombre o 'FIN'.");
            }

            while (!nombre.equalsIgnoreCase("FIN")) {
                // Horas > 0
                do {
                    System.out.print("Horas trabajadas (> 0): ");
                    horas = Integer.parseInt(sc.nextLine().trim());
                    if (horas <= 0) System.out.println("Valor inválido. Ingresá un entero > 0.");
                } while (horas <= 0);

                // Dosis > 0
                do {
                    System.out.print("Dosis aplicadas (> 0): ");
                    dosis = Integer.parseInt(sc.nextLine().trim());
                    if (dosis <= 0) System.out.println("Valor inválido. Ingresá un entero > 0.");
                } while (dosis <= 0);

                horasCentro += horas;
                dosisCentro += dosis;
                enfermerosCentro++;

                if (dosis > maxDosisEnfermero) {
                    maxDosisEnfermero = dosis;
                    topEnfermero = nombre;
                }

                
                while (true) {
                    System.out.print("Nombre del enfermero (o FIN): ");
                    nombre = sc.nextLine().trim();
                    if (nombre.equalsIgnoreCase("FIN") || !nombre.isEmpty()) break;
                    System.out.println("Nombre inválido. Ingresá un nombre o 'FIN'.");
                }
            }

            // Centros sin enfermeros
            if (enfermerosCentro == 0) {
                centrosSinEnfermeros++;
                if (!listaCentrosSin.isEmpty()) listaCentrosSin += ", ";
                listaCentrosSin += centro;
            }

            // Acumular globales
            dosisGlobal += dosisCentro;
            horasGlobal += horasCentro;
            totalEnfermerosGlobal += enfermerosCentro;

            // Centro con más dosis
            if (dosisCentro > maxDosisCentro) {
                maxDosisCentro = dosisCentro;
                topCentro = centro;
            }

            // Métricas por centro
            double promDosisEnfermero = (enfermerosCentro == 0) ? 0.0 : (double) dosisCentro / enfermerosCentro;
            double productividad = (horasCentro == 0) ? 0.0 : (double) dosisCentro / horasCentro; // dosis/hora

            if (productividad > maxProd) {
                maxProd = productividad;
                topCentroProd = centro;
            }

            System.out.printf(
                "Centro %s — Horas totales: %d, Promedio dosis/enfermero: %.2f, Productividad (dosis/hora): %.2f%n",
                centro, horasCentro, promDosisEnfermero, productividad
            );
        }

        // Promedio global de dosis por enfermero
        double promedioGlobalPorEnfermero =
            (totalEnfermerosGlobal == 0) ? 0.0 : (double) dosisGlobal / totalEnfermerosGlobal;

        // Salidas globales
        System.out.println("\nDosis totales (global): " + dosisGlobal);

        if (maxDosisEnfermero == -1)
            System.out.println("Enfermero con más dosis: (sin datos)");
        else
            System.out.printf("Enfermero con más dosis: %s (%d dosis)%n", topEnfermero, maxDosisEnfermero);

        if (maxDosisCentro == -1)
            System.out.println("Centro con más dosis: (sin datos)");
        else
            System.out.printf("Centro con más dosis: %s (%d)%n", topCentro, maxDosisCentro);

        if (centrosSinEnfermeros == 0)
            System.out.println("No hubo centros sin enfermeros.");
        else
            System.out.println("Centros sin enfermeros (" + centrosSinEnfermeros + "): " + listaCentrosSin);

        if (maxProd < 0)
            System.out.println("Centro más productivo: (sin datos)");
        else
            System.out.printf("Centro más productivo: %s (%.2f dosis/hora)%n", topCentroProd, maxProd);

        System.out.printf("Promedio global de dosis por enfermero: %.2f%n", promedioGlobalPorEnfermero);

        sc.close();
    }
}


