package clase01;

import java.util.Scanner;

public class ejercicioenclase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cantusuario,puntuacion;
		String  usuario, productoElegido;
		final String BIGMAC = "BIGMAC" ;
		final String CUARTOLIBRA = "CUARTO DE LIBRE";
	    final String  MCNIFICA = "MCNIFICA";
		
		
		do {
			System.out.println("Cantidad tototal de usuario");
			cantusuario = Integer.parseInt(input.nextLine());
		}while(cantusuario < 1);
		
		
		for(int i = 1 ; i  <= cantusuario; i++) {
			System.out.println(" Nombre de Usuario ");
			  usuario= input.nextLine();
			  
			  
			
			System.out.println(" Producto Elegido ");
			productoElegido = input.nextLine();
			
			System.out.println("Ingrese una puntuacion");
			puntuacion = Integer.parseInt(input.next());
			
			  switch (productoElegido) {
			  
			  case BIGMAC:
				  
				  BIGMAC = productoElegido;
				  break;
				  
			  case CUARTOLIBRA :
				  
				  CUARTOLIBRA = productoElegido;
				  
				  break;
				  
			  case MCNIFICA:
				  
				  MCNIFICA = productoElegido;
				  
				  
				  
			  
			  
			  
			  }
			  
		}
			
		}
		

		
		

		
		
		

	}

}
