package clase01;

import java.util.Scanner;

public class kartss {

	public static void main(String[] args) {
		
		final int TOTAL_VUELTAS = 5;
		final char ROJO = 'R', VERDE = 'V', FIN = 'F';
		
		Scanner input = new Scanner(System.in);
		int pianito ;
		int vueltasR = 0,vueltasV = 0;
		int pianitoR = 0,pianitoV =0;
		int kart;
		
		
		do {
		System.out.println("Ingrese el kart que dio la vuelta (R o V && F para finalizar");
		kart = Integer.parseInt(input.nextLine());
		
		}while(kart != ROJO && kart != VERDE && kart != FIN);
		
		
		while(vueltasR < TOTAL_VUELTAS  && vueltasV  < TOTAL_VUELTAS && kart != FIN ) {
			 
			
			do {
			System.out.println("Cuantas veces piso el pianito ");
			pianito = Integer.parseInt(input.nextLine());
			
			
			}while(pianito < 0);
			
			
			
			
			
			
			
			
			
			
			
		}
		


	}

}
