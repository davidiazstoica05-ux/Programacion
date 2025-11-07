package ejercicio3;

public class Operaciones {

	// Número parOimpar


	
	public int operar(int num1) {

		int cero = 0, num2 = 2, resul;
		
		
		resul = num1 % num2;

		if (resul == cero && num1 < cero) {

			System.out.println("Es par y negativo");

		} else if (resul == cero && num1 >= cero) {
			System.out.println("Es par y positivo");

		} else if (resul != cero && num1 < cero) {
			System.out.println("Es impar y negativo");

		} else if (resul != cero && num1 >= cero) {
			System.out.println("Es impar y positivo");
		}
		return resul;
	}

	
	//Codigo del negativo o positivo que luego he simplificado
	/*public int negativoPosi(int num1) {

		int cero = 0;

		if (num1 < cero) {
			System.out.println("El número es negativo");

		} else {
			System.out.println("El número es positivo");
		}

		return num1;
	}*/
}
