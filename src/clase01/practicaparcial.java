package clase01;

import java.util.Scanner;

public class practicaparcial {
<<<<<<< HEAD
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Cantidad de estudiantes: ");
	        int n = Integer.parseInt(sc.nextLine().trim());

	        String mejorEstudiante = "";
	        double mejorPromedio = 0.0;

	        int reprobados = 0;
	        int sumaPromediosCurso = 0;
	        double promedio = 0 ;

	        for (int i = 1; i <= n ; i++) {
	            System.out.println("\n--- Estudiante " + i + " ---");
	            System.out.print("Nombre: ");
	            String nombre = sc.nextLine().trim();

	            System.out.print("Cantidad de evaluaciones: ");
	            int k = Integer.parseInt(sc.nextLine().trim());

	            double sumaNotaPorPeso = 0.0;
	            int sumaPesos = 0;

	            for (int j = 0; j < k; j++) {
	                System.out.print("Nombre evaluación: ");
	                String eval = sc.nextLine().trim();

	                System.out.print("Nota (0.0 - 5.0): ");
	                double nota = Double.parseDouble(sc.nextLine().trim());

	                System.out.print("Peso (%): ");
	                int peso = Integer.parseInt(sc.nextLine().trim());

	                sumaPesos += peso;
	                
	                sumaNotaPorPeso += nota * peso;
	                
	              

	                	
	            }
	                if(sumaPesos > 0) {
	                	 promedio = sumaNotaPorPeso /sumaPesos;
	                	
	                }else {
	                	
	                	promedio = 0.0;
	                }
	            
	            
	            if (promedio > mejorPromedio) {
	                mejorPromedio = promedio;
	                mejorEstudiante = nombre;
	            }

	            if (promedio < 3.0) {
	                reprobados++;
	            }
	            

	            System.out.printf("%s — Promedio: %.2f%n", nombre, promedio);

	            sumaPromediosCurso += promedio;
	        }

	        double promedioCurso =  (sumaPromediosCurso / n);

	        if (mejorEstudiante.isEmpty()) {
	            System.out.println("\nNo hay mejor estudiante.");
	        } else {
	            System.out.printf("\nMejor estudiante: %s con %.2f%n", mejorEstudiante, mejorPromedio);
	        }

	        System.out.printf("Promedio del curso: %.2f%n", promedioCurso);
	        System.out.println("Reprobados: " + reprobados);

	        sc.close();
	    }
	}

	
		

	

=======

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
>>>>>>> branch 'master' of https://github.com/pisati1998-collab/THPD.git


