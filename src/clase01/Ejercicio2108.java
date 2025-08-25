package clase01;

import java.util.Scanner;

public class Ejercicio2108 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int PORCENTAJE1 = 60;
		final int PORCENTAJE2 = 50;
		final int PORCENTAJE3 = 40;
		
		
		
		
		double nota1 , nota2, nota3, porcentaje;
		System.out.println("Ingrese la nota 1");
		nota1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese la nota 2");
		nota2 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese la nota 3");
		nota3 = Double.parseDouble(input.nextLine());
		boolean sacoUnDiez , primeraDivision, segundaDivision, terceraDivision;
		porcentaje = 10*(nota1 + nota2+ nota3)/3;
		sacoUnDiez = nota1 == 10 || nota2 == 10 || nota3 == 10;
		primeraDivision = porcentaje >= PORCENTAJE1 && sacoUnDiez;
		segundaDivision = (porcentaje >=PORCENTAJE2 );
		terceraDivision = porcentaje >= PORCENTAJE3 && porcentaje <=49;
		
		
		if(primeraDivision) {
			System.out.println("Clasifico a la Primera Division");
		}else if(segundaDivision) {
			System.out.println("Clasifico a la Segunda Division");
		}else if(terceraDivision) {
			System.out.println("Clasifico a la tercera division");
			
		}else {
			System.out.println("Desaprovado");
		}
		
		
		System.out.println(porcentaje); 
		//System.out.println(sacoUnDiez); comprobado
		
		input.close();
 
				
		

	}

}
