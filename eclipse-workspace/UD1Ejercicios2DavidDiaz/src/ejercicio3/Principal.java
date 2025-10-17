package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 1852;
		double millamar, resultadom;
		System.out.println("Bienvenidos al programa que le ayudará a convertir una milla marina a metros");
		System.out.println("Introduzca a continuación cuantas millas marinas quiere convertir a metro:");
		millamar = Leer.datoDouble();
		resultadom = millamar * m;
		System.out.printf("%.2f equivalen a %.2fm ", millamar, resultadom);
		System.out.printf("\nGracias por usar nuestro programa");
	}

}
