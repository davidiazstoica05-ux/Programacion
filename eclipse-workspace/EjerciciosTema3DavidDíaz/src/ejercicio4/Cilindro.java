package ejercicio4;

public class Cilindro {

	// Calcular volumen
	public double calcularVolumen(double altura, double r) {

		double v, dos = 2;

		v = Math.PI * Math.pow(r, dos) * altura;

		return v;

	}

}
