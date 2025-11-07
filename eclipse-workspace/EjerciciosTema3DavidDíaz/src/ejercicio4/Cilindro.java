package ejercicio4;

public class Cilindro {
	
	private double radio,altura;
	
	//constructor
	public Cilindro (double radio, double altura) {
		
		this.radio=radio;
		this.altura=altura;
		
	}
	
	//setRadio
	public void setRadio (double radio) {
		this.radio=radio;
		
	}
	
	//setAltura
	public void setAltura (double altura) {
		this.altura=altura;
		
	}
	// Calcular volumen
	public double calcularVolumen() {

		double v=0.0, dos = 2;

		v = Math.PI * Math.pow(radio, dos) * altura;

		return v;

	}

}
