package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta pago
		 * de mantenimiento un 1 % del saldo con la que la abrí inicialmente al año y
		 * tengo unos intereses del 3 % del saldo inicial? Hacer un programa que calcule
		 * esto y lo muestre por pantalla leyendo por teclado el saldo inicial con el
		 * que se quiere abrir la cuenta.
		 */
		
		double saldincial,resultado1,mantenimiento,interesfin;
		int interes1=1, interes3=3,den=100;
		
		
		System.out.println("Hola, este programa le ayudará al calcular su saldo en el banco a final de año");
		System.out.println("Para empezar, diga su saldo inicial a continuación: ");
			saldincial=Leer.datoDouble();
			resultado1=saldincial+(saldincial*interes1/(double)den);
			mantenimiento=resultado1-saldincial;
		System.out.printf("El precio del mantenimiento es de %.2f€, respecto al saldo inicial",mantenimiento);
			interesfin=saldincial+(saldincial*interes3/(double)den);
		System.out.printf("\nSu saldo inicial con los intereses al '3%%' es de %.2f€",interesfin);
		System.out.println("\nGracias por usar nuestro programa");
	}

}
