package tp1;

import java.util.Scanner;

public class ejercicio19conlotepruebas {

	static class resultado {
		
		boolean esDeUnSoloDigito , esImpar , estaEnAmbosGrupos ,noEstaEnNingunGrupo;
		
	}
	
	static resultado evaluar(int num) {
		 resultado r = new resultado();
		
		  r.esDeUnSoloDigito = num > -10 && num < 10;
		  r.esImpar = num % 2 != 0;
		  r.estaEnAmbosGrupos = r.esDeUnSoloDigito && r.esImpar;
		  r.noEstaEnNingunGrupo = !r.esDeUnSoloDigito && !r.esImpar;
		  
		  return r;
	}
	
	static String vf(boolean b) {return b ? "Verdadero" : "Falso";} 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un Numero Entero");
		int num = Integer.parseInt(input.nextLine());
		
		resultado r = evaluar (num);
		
		System.out.println(" \nResultado para el Numero " + num);
		System.out.println(" Es de Un Solo Digito =  " + vf(r.esDeUnSoloDigito));
		System.out.println(" Es Impar  =  " + vf(r.esImpar));
		System.out.println(" Esta En Ambos Grupos  =  " + vf(r.estaEnAmbosGrupos));
		System.out.println(" No Esta En Ningun Grupo  =  " + vf(r.noEstaEnNingunGrupo));
		
		// Lote de prueba
        int[] lote = { -10, -9, -1, 0, 1, 2, 7, 10, 13 };
        System.out.println("\n--- Lote de prueba ---");
        System.out.printf("%6s | %17s | %6s | %16s | %19s%n",
                "n", "esDeUnSoloDigito", "esImpar", "estaEnAmbos", "noEstaEnNinguno");
        for (int x : lote) {
            resultado t = evaluar(x);
            System.out.printf("%6d | %17s | %6s | %16s | %19s%n",
                    x, vf(t.esDeUnSoloDigito), vf(t.esImpar), vf(t.estaEnAmbosGrupos), vf(t.noEstaEnNingunGrupo));
        }
		
		input.close();
		
		
		
		
		
		
		
		
		

	}

}

