package ejemplometodos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// para imprimir .

		// Opcion A
		// Guardo el resultado en variable y la muestro. Solo llamo una vez al metodo y
		// guardo en una var
		// int total;

		// Operaciones op= new Operaciones ();

		// total=op.sumaDosEnteros( 2, 7);

		// System.out.println("Resultado: "+total);

		// Opcion B
		// Uso la misma operacion para imprimir
		// Está esta bien para cuando no voy utilizarlo mas, esta llama al metodo cada
		// vez que lo hace
		// Operaciones op= new Operaciones ();

		// op.sumaDosEnteros( 2, 7);

		// System.out.println("Resultado "+op.sumaDosEnteros( 2, 7));

		// Para que lea
		Operaciones op = new Operaciones();
		int numero1, numero2, total;

		System.out.println("Diga el número1");
		numero1 = Leer.datoInt();
		System.out.println("Diga el número2");
		numero2 = Leer.datoInt();
		op.sumaDosEnteros(numero1, numero2);
		System.out.println("Resultado " + op.sumaDosEnteros(numero1, numero2));

		// multiplicar
	
		total= op.multiplicarDosEnteros(numero1, numero2);
		System.out.println("Resultado " + total);

		// dividir
		total = op.dividirDosEnteros(numero1, numero2);

		System.out.println("Resultado" + total);

	}

}
