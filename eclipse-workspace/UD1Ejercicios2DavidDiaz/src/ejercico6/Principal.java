package ejercico6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldo, horastr,prechorabase,prechtotal;
		double horasxtra,prechoraextra,prctotalxtra;
		
		
			System.out.println("Hola, este programa le ayudará a calcular sus horas trabajadas");
			System.out.println("En primera instancia, diga sus horas trabajadas a continuación: ");
				horastr=Leer.datoDouble();
			System.out.println("En segundo lugar, diga el precio/h por el que usted es pagado");
			  	prechorabase=Leer.datoDouble();
			  	prechtotal=horastr*prechorabase;
			System.out.printf("Su total es de %.1f€",prechtotal);
			System.out.println("\nDíga las horas extras trabajadas");
				horasxtra=Leer.datoDouble();
			System.out.println("¿A cuanto son pagadas?");
				prechoraextra=Leer.datoDouble();
				prctotalxtra=horasxtra*prechoraextra;
			System.out.printf("Su total es de %.1f€",prctotalxtra);
				sueldo=prechtotal+prctotalxtra;
			System.out.printf("\nSumando las horas base y las horas extras esto le da un total de %.1f€",sueldo);
			System.out.printf("\nLe corresponden %.1f€ ",sueldo);
			System.out.println("\nGracias por usar nuestro programa");
	}

}
