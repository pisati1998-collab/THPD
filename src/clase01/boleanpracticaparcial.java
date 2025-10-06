package clase01;

import java.util.Scanner;

public class boleanpracticaparcial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        final int TARIFA_AUTO   = 12000;
	        final int TARIFA_MOTO   = 8000;
	        final int TARIFA_CAMION = 20000;
	        final int MULTA_INFRA   = 15000;
	        final int TARIFA_MOTO125= 7000;
	        final int TARIFA_MOTO250 = 10000;
	        final int TARIFA_MOTOMAS250 = 13000;
	        int n ;
	        int ciclindrada = 0;
	      
              do {
	        System.out.print("Cantidad de vehículos: ");
	         n = Integer.parseInt(sc.nextLine().trim());
              }while( n < 1 || n > 50);

	        long total = 0;
	        int exentos = 0;
	        String placaMax = "";
	        int tarifaMax = -1;

	        for (int i = 1; i <= n; i++) {
	            String placa;
	            do {
	                System.out.print("\nPlaca: ");
	                placa = sc.nextLine().trim();
	                if (placa.isEmpty()) System.out.println("Entrada vacía. Intenta de nuevo.");
	            } while (placa.isEmpty());

	            String tipo;
	            boolean tipoValido;
	            do {
	                System.out.print("Tipo (AUTO/MOTO/CAMION): ");
	                tipo = sc.nextLine().trim().toUpperCase();
	                tipoValido = tipo.equals("AUTO") || tipo.equals("MOTO") || tipo.equals("CAMION");
	                if (!tipoValido) System.out.println("Tipo inválido. Usa AUTO/MOTO/CAMION.");
	            } while (!tipoValido);
	            
	            if(tipo.equals("MOTO")) {
	            	System.out.println("Ingrese la cilindrada de  la moto ");
	            	 ciclindrada = Integer.parseInt(sc.nextLine());
	            	
	            	
	            }

	            boolean electrico = false, telepeaje = false, horaPico = false, infractor = false;
	            boolean ok;

	            do {
	                System.out.print("¿Eléctrico? (S/N): ");
	                String s = sc.nextLine().trim().toUpperCase();
	                ok = s.equals("S") || s.equals("N");
	                if (ok) electrico = s.equals("S");
	                else System.out.println("Responde S o N.");
	            } while (!ok);

	            do {
	                System.out.print("¿Telepeaje? (S/N): ");
	                String s = sc.nextLine().trim().toUpperCase();
	                ok = s.equals("S") || s.equals("N");
	                if (ok) telepeaje = s.equals("S");
	                else System.out.println("Responde S o N.");
	            } while (!ok);

	            do {
	                System.out.print("¿Hora pico? (S/N): ");
	                String s = sc.nextLine().trim().toUpperCase();
	                ok = s.equals("S") || s.equals("N");
	                if (ok) horaPico = s.equals("S");
	                else System.out.println("Responde S o N.");
	            } while (!ok);

	            do {
	                System.out.print("¿Infracción activa? (S/N): ");
	                String s = sc.nextLine().trim().toUpperCase();
	                ok = s.equals("S") || s.equals("N");
	                if (ok) infractor = s.equals("S");
	                else System.out.println("Responde S o N.");
	            } while (!ok);

	            int base;
	            
				if (tipo.equals("AUTO")) base = TARIFA_AUTO;
	            else if (tipo.equals("CAMION")) base = TARIFA_CAMION;
	            else if (tipo.equals("MOTO") && ciclindrada  <= 125) base = TARIFA_MOTO125;
	            else if (tipo.equals("MOTO")&& ciclindrada <= 250) base = TARIFA_MOTO250;
	            else base = TARIFA_MOTOMAS250;

	            boolean exento = (electrico && !horaPico && !tipo.equals("CAMION") && !infractor);

	            int tarifa;
	            if (exento) {
	                tarifa = 0;
	                exentos++;
	            } else {
	                double subtotal = base;
	                if (horaPico && !electrico) {
	                    subtotal = subtotal * 1.35;
	                }
	                if (telepeaje) {
	                    subtotal = subtotal * 0.80;
	                }
	                tarifa = (int) Math.round(subtotal);
	                if (infractor) {
	                    tarifa += MULTA_INFRA;
	                }
	            }

	            System.out.printf("%s — Tarifa: $%d%n", placa, tarifa);

	            total += tarifa;
	            if (tarifa > tarifaMax) {
	                tarifaMax = tarifa;
	                placaMax = placa;
	            }
	        }

	        System.out.println("\nTotal recaudado: $" + total);
	        System.out.println("Exentos: " + exentos);
	        if (tarifaMax >= 0) {
	            System.out.printf("Vehículo con mayor tarifa: %s ($%d)%n", placaMax, tarifaMax);
	        } else {
	            System.out.println("Vehículo con mayor tarifa: (sin datos)");
	        }

	        sc.close();
	    }
	}
		

	


