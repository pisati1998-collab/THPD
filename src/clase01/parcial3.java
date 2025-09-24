package clase01;

import java.util.Scanner;

public class parcial3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final int CANT_TURNOS = 3;

        int totalGlobal = 0;
        int ventaMaxima = 0;
        String turnoVentaMaxima = "";
        String turno;
        String entrada ;

        
        int ventasTurno = 0;
        int monto ;

        for (int t = 1; t <= CANT_TURNOS ; t++) {
        	
        	 int totalTurno = 0;
        	
        	do {
            System.out.print("\nNombre del turno: ");
             turno = sc.nextLine().trim();
        	}while(turno.isEmpty());
              
        	do {
            System.out.print("Monto de venta (o FIN): ");
             entrada = sc.nextLine();
        	}while(entrada.isEmpty() );

            while (entrada.equalsIgnoreCase("FIN")) {
            	
            	do {
                System.out.println("Ingrese el monto ");
            	 monto = Integer.parseInt(sc.nextLine());
            	}while(monto > 0);
            	

                totalTurno += monto;
                ventasTurno ++;

                if (monto > ventaMaxima) {
                    ventaMaxima = monto;
                    turnoVentaMaxima = turno;
                }

                System.out.print("Monto de venta (o FIN): ");
                entrada = sc.nextLine().trim();
            }

            double promedio = (ventasTurno == 0) ? 0.0 : (totalTurno / ventasTurno);

            totalGlobal += totalTurno;

            System.out.printf("Turno %s — Total: %d, Promedio por venta: %.2f%n",
                    turno, totalTurno, promedio);
        }

        System.out.println("\nTotal global: " + totalGlobal);
        if (ventaMaxima > 0) {
            System.out.println("Venta máxima: (sin datos)");
        } else {
            System.out.printf("Venta máxima: %d (turno %s)%n", ventaMaxima, turnoVentaMaxima);
        }

        sc.close();
    }

		
		
	}


