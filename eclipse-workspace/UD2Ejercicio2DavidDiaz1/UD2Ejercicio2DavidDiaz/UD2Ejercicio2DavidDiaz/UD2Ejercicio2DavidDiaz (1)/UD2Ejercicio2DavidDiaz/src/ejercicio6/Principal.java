package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, notaMedia;
		int numNotas = 3;

		System.out.println("Hola,este programa realizará su nota media");
		System.out.println("Introduzca la primera nota ");
		nota1 = Leer.datoDouble();
		System.out.println("Introduzca la segunda nota");
		nota2 = Leer.datoDouble();
		System.out.println("Introduzca la tercera nota");
		nota3 = Leer.datoDouble();

		notaMedia = (nota1 + nota2 + nota3) / numNotas;

		if (notaMedia >= 5) {
			System.out.printf("Su nota es %.2f \nAprobado.", notaMedia);
		} else
			System.out.printf("Su nota es %.2f \nNo aprobado.", notaMedia);
		System.out.println("Gracias por usar este programa");

	}

}
