package clase01;

import java.util.Scanner;

public class mcdonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cantusuarios , puntuacion ,puntBM = 0, puntC = 0, puntMC = 0, usersBM = 0, usersC = 0, usersMC = 0;
		String nombreusuario,productoelegido;
		final String BIG_MAC = "BIG MAC", CUARTO = "CUARTO DE LIBRA", MCNIFICA = "MCNIFICA";
		
		do {
		
		System.out.println("Cantidad de total de usuarios ");
		cantusuarios = Integer.parseInt(input.nextLine());
		}while(cantusuarios < 1);
		
		for(int i = 1; i <=  cantusuarios ; i++) {
		
		System.out.println("Ingrese su nombre ");
		nombreusuario = input.nextLine();
		
		
		do {
		System.out.println("Elegir una hamburguesa,BIG MAC , Cuarto de Libra,McNifica");
		productoelegido = input.nextLine().toUpperCase();
		
		}while(!productoelegido.equalsIgnoreCase(BIG_MAC) && !productoelegido.equalsIgnoreCase(CUARTO) && !productoelegido.equalsIgnoreCase(MCNIFICA));
		
		
		do {
			System.out.println("Ingrese una puntuacion");
			puntuacion =Integer.parseInt(input.nextLine());
				
		}while(puntuacion < 1 || puntuacion  > 100);
		
		
		/*
		if(productoelegido.equalsIgnoreCase(BIG_MAC)) {
			puntBM+=puntuacion;
			usersBM++;
		} else if (productoelegido.equalsIgnoreCase(CUARTO)) {
			puntC+=puntuacion;
			usersC++;
		} else {
			puntMC+=puntuacion;
			usersMC++;
		}
		*/
		
		switch(productoelegido) {
		case BIG_MAC:
			puntBM+=puntuacion;
			usersBM++;
			break;
		case CUARTO:
			puntC+=puntuacion;
			usersC++;
			break;
		case MCNIFICA:
			puntMC+=puntuacion;
			usersMC++;
			break;
		}
		
		
		
		
		
		
		}
		
		System.out.println("Promedio BM: " + ((double) puntBM / usersBM));
		System.out.println("Promedio CdL: " + ((double) puntC / usersC));
		System.out.println("Promedio MC: " + ((double) puntMC / usersMC));
		
		input.close();
	}
	

}
