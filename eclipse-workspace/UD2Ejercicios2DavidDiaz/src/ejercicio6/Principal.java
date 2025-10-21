package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Muestra los valores de un array con números double, por ejemplo, precios o
		 * pagos de algo, imprimiendo también la cabecera de dichos valores. Las
		 * cabeceras deben estar en otro array de String, por ejemplo: Enero 1200.55
		 * febrero 2500.45 marzo 800.50
		 */

		double aleatorios, desde = 0, hasta = 5;
		String[] meses = { "Enero", "Febrero", "Marzo", "Mayo" };
		int tam = 4;
		double[] numerosA;
		numerosA = new double[tam];

		System.out.println("Bienvenido, este programa enseña lista de meses y de números");
		// Con este for imprimo los meses que hay en el array ya inicializado
		for (int i = 0; i < meses.length; i++) {
			System.out.printf("%s, ", meses[i]);

		}
		System.out.println("");
		// Con este for genero los números aleatorios
		for (int i = 0; i < numerosA.length; i++) {
			// formúla desde-hasta en double
			aleatorios = Math.random() * (desde - hasta) + hasta;
			numerosA[i] = aleatorios;
			System.out.printf("%.3f, ", numerosA[i]);
			
		} System.out.println("Gracias por usar nuestro programa");

	}

}
