package clase01;

public class tengomal {

	public static void main(String[] args) {
		package thp.ciclismo;

		import java.util.Scanner;

		public class Ciclismo {
		    private final static Scanner input = new Scanner(System.in);

		    public static void main(String[] args) {

		        final String FIN = "FIN";
		        final char BAJO = 'B', MEDIO = 'M', ALTO = 'A';

		        String nombreRuta;

		        // Globales (entre quienes terminaron)
		        int tiempoCarreraTotal = 0;
		        int cantidadCiclistasTotal = 0;

		        // Dificultad (conteo de rutas)
		        int rutasBajas = 0, rutasMedias = 0, rutasAltas = 0, totalRutas = 0;

		        // Global: mayor agua consumida (suponer único)
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
		                difRuta = linea.isEmpty() ? '\0' : linea.charAt(0);
		            } while (difRuta != BAJO && difRuta != MEDIO && difRuta != ALTO);

		            if (difRuta == BAJO) rutasBajas++;
		            else if (difRuta == MEDIO) rutasMedias++;
		            else rutasAltas++;
		            totalRutas++;

		            // Cantidad de ciclistas por ruta (>= 0)
		            int cantidadCiclistas;
		            do {
		                System.out.println("Ingrese la cantidad de ciclistas que participaron en esta ruta");
		                String linea = input.nextLine().trim();
		                cantidadCiclistas = linea.isEmpty() ? -1 : Integer.parseInt(linea);
		            } while (cantidadCiclistas < 0);

		            // --- Variables por ruta ---
		            boolean hayAbandono = false;
		            int aguaConsumidaPorRuta = 0;

		            int tiempoMinimoRuta = Integer.MAX_VALUE; // min solo entre los que terminaron
		            String nombreMasRapidoRuta = "";           // nombre del más rápido de la ruta

		            // --- Por cada ciclista de la ruta ---
		            for (int i = 1; i <= cantidadCiclistas; i++) {

		                // Nombre del ciclista
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
		                    respuestaCarrera = linea.isEmpty() ? '\0' : linea.charAt(0);
		                } while (respuestaCarrera != 'S' && respuestaCarrera != 'N');

		                boolean terminoCarrera = (respuestaCarrera == 'S');

		                if (terminoCarrera) {
		                    // Tiempo (> 0)
		                    int tiempoCarrera;
		                    do {
		                        System.out.println("Ingrese el tiempo que tardó en finalizar la carrera (en minutos)");
		                        String linea = input.nextLine().trim();
		                        tiempoCarrera = linea.isEmpty() ? 0 : Integer.parseInt(linea);
		                    } while (tiempoCarrera <= 0);

		                    // Agua (> 0)
		                    int aguaConsumida;
		                    do {
		                        System.out.println("Ingrese la cantidad de agua consumida durante la carrera (en litros enteros)");
		                        String linea = input.nextLine().trim();
		                        aguaConsumida = linea.isEmpty() ? 0 : Integer.parseInt(linea);
		                    } while (aguaConsumida <= 0);

		                    // Acumulados por ruta y globales
		                    aguaConsumidaPorRuta += aguaConsumida;
		                    tiempoCarreraTotal += tiempoCarrera;
		                    cantidadCiclistasTotal++;



	}

}
