package ejemplosoperadores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 3, den = 4;
		double cociente;

		System.out.println("Hola, este programa divide numeros");
		cociente = num / den;
		System.out.println("Resultado: " + cociente);

		/*
		 * hacer formulas rapidas Math.PI = númeri PI Math.POW = Cálcula el radio = a
		 * 
		 */

		/*
		 * castear: cambiar de un tipo a otro Ejemplo: (En el ejercicio 9 casteamos para
		 * que no haya error debido a que son dos var int y el resultado double de esta
		 * forma convertimo uno de los dos int en doble para que no haya problema=
		 * resultado=(double)capacidad/habitantes;
		 */

		// ejercicio 4
		int a = 'a';
		// se usan comillas simples para char
		// no da fallo porque lo interpreta como un número, gracias al codigo ascii (la
		// a tiene el valor 97)
		System.out.println(a);

		/*
		 * dos variables de distintos tipos no pueden compararse, a excepcion de un char
		 * con las comillas que si puede. boolean adivina=(97=='a'==97)
		 */

	}

}
