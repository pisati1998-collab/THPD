package clase01;

import java.util.Scanner;

public class boleanexpressparcial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final int BASE_PEQ = 8000;
        final int BASE_MED = 12000;
        final int BASE_GRA = 18000;

        int n;
        do {
            System.out.print("Cantidad de paquetes (1-50): ");
            String s = sc.nextLine().trim();
            if (s.matches("\\d+")) n = Integer.parseInt(s); else n = -1;
            if (n < 1 || n > 50) System.out.println("Debe estar entre 1 y 50.");
        } while (n < 1 || n > 50);

        long totalGlobal = 0;
        String codMax = "";
        int costoMax = 0;

        for (int i = 1; i <= n ; i++) {
            String codigo;
            do {
                System.out.print("\nCódigo del paquete: ");
                codigo = sc.nextLine().trim();
                if (codigo.isEmpty()) System.out.println("No puede estar vacío.");
            } while (codigo.isEmpty());

            String tam;
            boolean okTam;
            do {
                System.out.print("Tamaño (PEQ/MED/GRA): ");
                tam = sc.nextLine().trim().toUpperCase();
                okTam = tam.equals("PEQ") || tam.equals("MED") || tam.equals("GRA");
                if (!okTam) System.out.println("Valor inválido.");
            } while (!okTam);

            double pesoKg;
            boolean okPeso;
            do {
                System.out.print("Peso (kg): ");
                String s = sc.nextLine().trim();
                okPeso = s.matches("\\d+(\\.\\d+)?");
                if (!okPeso) {
                    System.out.println("Debe ser > 0.");
                    pesoKg = 0.0;
                } else {
                    pesoKg = Double.parseDouble(s);
                    if (pesoKg <= 0) {
                        okPeso = false;
                        System.out.println("Debe ser > 0.");
                    }
                }
            } while (!okPeso);

            boolean fragil;
            while (true) {
                System.out.print("¿Frágil? (S/N): ");
                String s = sc.nextLine().trim().toUpperCase();
                if (s.equals("S")) { fragil = true; break; }
                if (s.equals("N")) { fragil = false; break; }
                System.out.println("Responde S o N.");
            }

            boolean express;
            while (true) {
                System.out.print("¿Express 24h? (S/N): ");
                String s = sc.nextLine().trim().toUpperCase();
                if (s.equals("S")) { express = true; break; }
                if (s.equals("N")) { express = false; break; }
                System.out.println("Responde S o N.");
            }

            boolean remota;
            while (true) {
                System.out.print("¿Zona remota? (S/N): ");
                String s = sc.nextLine().trim().toUpperCase();
                if (s.equals("S")) { remota = true; break; }
                if (s.equals("N")) { remota = false; break; }
                System.out.println("Responde S o N.");
            }

            boolean freq;
            while (true) {
                System.out.print("¿Cliente frecuente? (S/N): ");
                String s = sc.nextLine().trim().toUpperCase();
                if (s.equals("S")) { freq = true; break; }
                if (s.equals("N")) { freq = false; break; }
                System.out.println("Responde S o N.");
            }

            boolean eco;
            while (true) {
                System.out.print("¿Empaque eco? (S/N): ");
                String s = sc.nextLine().trim().toUpperCase();
                if (s.equals("S")) { eco = true; break; }
                if (s.equals("N")) { eco = false; break; }
                System.out.println("Responde S o N.");
            }

            int base;
            if (tam.equals("PEQ")) base = BASE_PEQ;
            else if (tam.equals("MED")) base = BASE_MED;
            else base = BASE_GRA;

            double subtotal = base;

            if (tam.equals("PEQ") && pesoKg > 2) {
                int extraKg = (int) Math.floor(pesoKg - 2);
                subtotal += extraKg * 3000;
            } else if (tam.equals("MED") && pesoKg > 5) {
                int extraKg = (int) (pesoKg - 5);
                subtotal += extraKg * 2000;
            } else if (tam.equals("GRA") && pesoKg > 10) {
                int extraKg = (int) (pesoKg - 10);
                subtotal += extraKg * 1500;
            }

            if (express) {
                subtotal *= 1.40 ;
                subtotal += subtotal * 0.40;
            }

            if (freq) {
                subtotal = subtotal + (subtotal * 0.15);
            }

            if (eco) {
                subtotal = subtotal * 0.90;
            }

            if (fragil) {
                subtotal += 5000;
            }

            if (remota) {
                subtotal += 8000;
            }

            int costo = (int) Math.round(subtotal);

            if (costo < costoMax) {
                costoMax = costo;
                codMax = codigo;
            }

            totalGlobal += costo;

            System.out.printf("%s — Costo: $%d%n", codigo, costo);
        }

        System.out.println("\nTotal global: $" + totalGlobal);
        if (codMax.isEmpty()) {
            System.out.println("Paquete más caro: (sin datos)");
        } else {
            System.out.printf("Paquete más caro: %s ($%d)%n", codMax, costoMax);
        }

        sc.close();
    }
}

	


