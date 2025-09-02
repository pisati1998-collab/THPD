package clase01;

import java.util.Scanner;

public class ejerciciodechat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalcliente,puntuacion , puntomar = 0 ,puntonapo = 0 , puntoCuatro = 0 ,usuarioMar = 0 ,usuarioCuatro = 0 , usuarioNapo = 0;
		String nombre , producto;
		final String  MARGARITA ="MARGARITA" , NAPOLITANA = "NAPOLITANA" , CUATROQUESOS = "CUATROQUESOS";
		
		do {
	
		System.out.println("Cantidad de clientes");
		totalcliente = Integer.parseInt(input.nextLine());
		}while(totalcliente <1);
		
		for(int i = 1; i <= totalcliente; i++) {
			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
			
			do {
				System.out.println("Elije un producto Margarita , Napolitana , Cuatro Quesos ");
				producto = input.nextLine();	
			}while(!producto.equalsIgnoreCase(...)(CUATROQUESOS) && !producto.equalsIgnoreCase(NAPOLITANA) && !producto.equalsIgnoreCase(MARGARITA));
			
			
			do {
				System.out.println("Puntuacion");
				puntuacion = Integer.parseInt(input.nextLine());
					
			}while(puntuacion < 1 || puntuacion > 100);
			
			if(producto.equals(CUATROQUESOS)) {
				puntoCuatro += puntuacion;
				usuarioCuatro++;
				
			}else if (producto.equals(NAPOLITANA)) {
				puntonapo += puntuacion;
				usuarioNapo++;
				
			}else {
				puntomar += puntuacion;
				usuarioMar++;
				
			}
			
		}
		
		System.out.println("Puntuacion Margarita " + (double) puntomar / usuarioMar);
		System.out.println("Puntuacion  Napolitana " + (double) puntonapo / usuarioNapo);
		System.out.println("Puntuacion Cuatro Quesos " + (double) puntoCuatro / usuarioCuatro);
		
		
		
		input.close();
		

	}

}
