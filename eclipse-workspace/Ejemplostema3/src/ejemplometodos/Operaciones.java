package ejemplometodos;

public class Operaciones {

	// metodo
	public int sumaDosEnteros(int num1, int num2) {

		int resul;
		resul = num1 + num2;
		return resul;
	}

	public int restarDosEnteros(int num1, int num2) {

		int resul;

		resul = num1 - num2;

		return resul;
	}
	// multiplicar

	public int multiplicarDosEnteros(int num1, int num2) {

		int resul;

		resul = num1 * num2;

		return resul;
	}

	// dividir 1
	public int dividirDosEnteros(int num1, int num2) {

		int resul, cero = 0;
		if (num1 !=cero) {
			
			resul=num1/num2;

		}else {
			resul=0;
		}
		return resul;
	}
	
	//dividir3
	public int dividirDosEnteros1(int num1, int num2) {

		int resul, cero = 0;
		if (num2!=0) {
			return num1/num2;
		} else {
			return 0;
		}

	}
}
