package tp1;

public class ejercicio14 {

	public static void main(String[] args) {
		 int edad = 7;
		 double  altura = 1.45; // double altura
		 
		 final int EDAD_MIN = 7;
		 final double ALTURA_MIN = 1.50;
		 
		 /*if(edad >= EDAD_MIN && altura > ALTURA_MIN) {
			 System.out.println("Puede ingresar");
			 
		 }else {
			 System.out.println("mala suerte");
			 
		 }*/
		 
		 
		 boolean aptoEdad = edad >=EDAD_MIN;
		 boolean aptoAltura = altura > ALTURA_MIN;
		 
		 if(aptoEdad || aptoAltura) {
			 System.out.println("Puede ingresar");
		 }else {
			 System.out.println("Mala suerte");
		 }
		 
		 
		 

	}




	}


