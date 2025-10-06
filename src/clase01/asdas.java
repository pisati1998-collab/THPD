package clase01;

public class asdas {

	public static void main(String[] args) {
		package thp.ciclismo;

		import java.util.Scanner;

		public class Ciclismo {
		    private final static Scanner input = new Scanner(System.in);

		    public static void main(String[] args) {

		        final String FIN = "FIN";
		        final char BAJO = 'B', MEDIO = 'M', ALTO = 'A';

		        String nombreRuta;
		        int cantidadCiclistas;

		        // Acumuladores globales de tiempos (para el promedio si lo querés mantener)
		        int tiempoCarreraTotal = 0;
		        int cantidadCiclistasTotal = 0;

		        // Dificultad (conteo de rutas)
		        int rutasBajas = 0;
		        int rutasMedias = 0;
		        int rutasAltas = 0;
		        int totalRutas = 0;

		        // Global: mayor agua entre todos los que terminaron (suponer único)
		        int aguaMaxGlobal = -1;
		        String nombreAguaMax = "";
		        String rutaAguaMax = "";

		        // Ingreso inicial de ruta
		        do {
		            System.out.println("Ingrese el nombre de la ruta (" + FIN + " para finalizar)");
		            nombreRuta = input.nextLine().trim().toUpperCase();
		        } while (nombreRuta.equals(""));

		        while (!nombreRuta.equals(FIN)) {

		            // Dificultad de la RUTA (una vez por ruta, validada)
		            char difRuta;
		            do {
		                System.out.println("Ingrese el grado de dificultad de la ruta '" + nombreRuta + "'  (B/M/A)");
		                String linea = input.nextLine().trim().toUpperCase();
		                difRuta = (linea.isEmpty() ? ' ' : linea.charAt(0));
		            } while (difRuta != BAJO && difRuta != MEDIO && difRuta != ALTO);

		            if (difRuta == BAJO) rutasBajas++;
		            else if (difRuta == MEDIO) rutasMedias++;
		            else rutasAltas++;
		            totalRutas++;

		            // Cantidad de ciclistas por ruta (>= 0)
		            do {
		                System.out.println("Ingrese la cantidad de ciclistas que participaron en esta ruta");
		                String linea = input.nextLine().trim();
		                if (linea.isEmpty()) cantidadCiclistas = -1;
		                else cantidadCiclistas = Integer.parseInt(linea);
		            } while (cantidadCiclistas < 0);

		            // --- Variables por ruta (se RESETEAN para cada ruta) ---
		            boolean hayAbandono = false;
		            int aguaConsumidaPorRuta = 0;

		            int tiempoMinimoRuta = Integer.MAX_VALUE; // min solo entre los que terminaron
		            String nombreMasRapidoRuta = "";           // nombre del más rápido de la ruta

		            // --- Por cada ciclista de la ruta ---
		            for (int i = 1; i <= cantidadCiclistas; i++) {

		                String nombreCiclista;
		                do {
		                    System.out.println("Ingrese el nombre del ciclista");
		                    nombreCiclista = input.nextLine().trim();
		                } while (nombreCiclista.equals(""));

		                // ¿Terminó la carrera?
		                char respuestaCarrera;
		                do {
		                    System.out.println("¿Terminó la carrera? (S/N)");
		                    String linea = input.nextLine().trim().toUpperCase();
		                    respuestaCarrera = (linea.isEmpty() ? ' ' : linea.charAt(0));
		                } while (respuestaCarrera != 'S' && respuestaCarrera != 'N');

		                boolean terminoCarrera = (respuestaCarrera == 'S');

		                if (terminoCarrera) {
		                    // Tiempo (> 0)
		                    int tiempoCarrera;
		                    do {
		                        System.out.println("Ingrese el tiempo que tardó en finalizar la carrera (en minutos)");
		                        String linea = input.nextLine().trim();
		                        if (linea.isEmpty()) tiempoCarrera = 0;
		                        else tiempoCarrera = Integer.parseInt(linea);
		                    } while (tiempoCarrera <= 0);

		                    // Agua (> 0)
		                    int aguaConsumida;
		                    do {
		                        System.out.println("Ingrese la cantidad de agua consumida durante la carrera (en litros enteros)");
		                        String linea = input.nextLine().trim();
		                        if (linea.isEmpty()) aguaConsumida = 0;
		                        else aguaConsumida = Integer.parseInt(linea);
		                    } while (aguaConsumida <= 0);

		                    // Acumulados por ruta y globales
		                    aguaConsumidaPorRuta += aguaConsumida;
		                    tiempoCarreraTotal += tiempoCarrera;
		                    cantidadCiclistasTotal++;

		                    // Mínimo por ruta (más rápido de la ruta)
		                    if (tiempoCarrera < tiempoMinimoRuta) {
		                        tiempoMinimoRuta = tiempoCarrera;
		                        nombreMasRapidoRuta = nombreCiclista;
		                    }

		                    // Máximo de agua global (entre todos los que terminaron)
		                    if (aguaConsumida > aguaMaxGlobal) {
		                        aguaMaxGlobal = aguaConsumida;
		                        nombreAguaMax = nombreCiclista;
		                        rutaAguaMax = nombreRuta;
		                    }

		                } else {
		                    hayAbandono = true;
		                }
		            } // fin for ciclistas

		            // --- Reporte por ruta ---
		            if (aguaConsumidaPorRuta > 0) {
		                System.out.println("El total de agua consumida para la ruta " + nombreRuta + " fue: " + aguaConsumidaPorRuta + " litros.");
		            } else {
		                System.out.println("Ningún ciclista de la ruta " + nombreRuta + " ha logrado finalizar la carrera.");
		            }

		            if (tiempoMinimoRuta != Integer.MAX_VALUE) {
		                System.out.println("Más rápido en la ruta " + nombreRuta + ": " + nombreMasRapidoRuta + " con " + tiempoMinimoRuta + " minutos.");
		            } else {
		                System.out.println("No hubo tiempos registrados en la ruta " + nombreRuta + " (nadie terminó).");
		            }

		            if (!hayAbandono && cantidadCiclistas > 0) {
		                System.out.println("Todos los ciclistas terminaron en la ruta " + nombreRuta + ".");
		            }

		            // --- Siguiente ruta ---
		            do {
		                System.out.println("\nIngrese el nombre de la ruta (" + FIN + " para finalizar)");
		                nombreRuta = input.nextLine().trim().toUpperCase();
		            } while (nombreRuta.equals(""));
		        }

		        // --- Reporte global ---
		        System.out.println("\n== Estadísticas globales ==");

		        if (aguaMaxGlobal >= 0) {
		            System.out.println("Ciclista que MÁS agua consumió (entre quienes terminaron): " +
		                    nombreAguaMax + " en la ruta " + rutaAguaMax + " con " + aguaMaxGlobal + " litros.");
		        } else {
		            System.out.println("No hubo ciclistas que terminaran la carrera en ninguna ruta (no hay consumo de agua).");
		        }

		        if (cantidadCiclistasTotal > 0) {
		            double promedioTiempo = (double) tiempoCarreraTotal / cantidadCiclistasTotal;
		            System.out.println("Promedio de tiempo de todos los ciclistas que terminaron (todas las rutas): " + promedioTiempo + " minutos.");
		        }

		        // Porcentajes de rutas por dificultad
		        if (totalRutas > 0) {
		            double pctB = (rutasBajas * 100.0) / totalRutas;
		            double pctM = (rutasMedias * 100.0) / totalRutas;
		            double pctA = (rutasAltas * 100.0) / totalRutas;

		            S


	}

}
