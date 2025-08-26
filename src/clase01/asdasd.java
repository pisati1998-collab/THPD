package clase01;

public class asdasd {

	public static void main(String[] args) {
		public class Escalera {
		    public static void main(String[] args) {
		        int altura = 5; // Número de filas de la escalera

		        // Bucle externo para las filas
		        for (int i = 1; i <= altura; i++) {
		            // Bucle interno para los espacios antes de los asteriscos
		            for (int j = 1; j <= altura - i; j++) {
		                System.out.print(" "); // Imprime un espacio
		            }
		            // Bucle interno para los asteriscos en cada fila
		            for (int k = 1; k <= i; k++) {
		                System.out.print("*"); // Imprime un asterisco
		            }
		            System.out.println(); // Salto de línea para pasar a la siguiente fila
		        }
		    }
		}

	}

}
