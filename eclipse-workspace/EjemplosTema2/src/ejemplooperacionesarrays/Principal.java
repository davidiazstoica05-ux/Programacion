package ejemplooperacionesarrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 0, leido;
		int[] edades;
		int suma = 0;
		double media;

		// leer por teclado
		System.out.println("Cuantas edades vas a meter ");
		tam = Leer.datoInt();
		edades = new int[tam];

		for (int i = 0; i < edades.length; i++) {

			System.out.println("Diga la edad número " + (i + 1));
			edades[i] = Leer.datoInt();
		}
		// Mostrar por pantalla
		System.out.println("Los valores son");

		for (int i = 0; i < edades.length; i++) {
			System.out.println("Valor: " + edades[i]);

		}
		// para poner una condicion (En este caso para los 18 a 0)
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == 18) {
				edades[i] = 0;

			}

		}
		//mostrar
		for (int i = 0; i < edades.length; i++) {
			
			System.out.println("Los cambios son: "+edades[i]);
		}

		// mostrar el valor que el usuario quiera
		System.out.println("Que valor quiere sacar");
		leido = Leer.datoInt();
		
		//mostramos
		// el usuario siempre empieza a contar desde 1, nosotros desde 0
		System.out.println("El elemento es : " + edades[leido - 1]);
		
		
		// Sumar todos los elementos del array
		for (int i = 0; i < edades.length; i++) {
			suma += edades[i];// suma=suma+edades[i];

		}
		System.out.println("La suma vale= " + suma);
		media=(double)suma/edades.length;
		System.out.printf("\n La media vale: %.2f",media);
	}

}
