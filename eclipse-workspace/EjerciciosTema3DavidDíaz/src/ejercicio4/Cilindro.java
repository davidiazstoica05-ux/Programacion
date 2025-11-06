package ejercicio4;

public class Cilindro {
	
	private double radio,altura;
	
	public Cilindro (double radio, double altura) {
		
		this.radio=radio;
		this.altura=altura;
		
	}
	

	// Calcular volumen
	public double calcularVolumen() {

		double v=0.0, dos = 2;

		v = Math.PI * Math.pow(radio, dos) * altura;

		return v;

	}

}
