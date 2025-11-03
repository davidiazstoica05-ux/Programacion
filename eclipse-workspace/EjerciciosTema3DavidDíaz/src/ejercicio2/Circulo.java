package ejercicio2;

public class Circulo {

	// atributo
	private double radio;

	// Constructor

	public Circulo(double radio) {
		this.radio = radio;

	}

	// imprimir

	public void imprimirDatos() {
		System.out.println("Valores: " + radio);

	}

	public double calcularArea() {
		
		double area=0.0,dos=2.0;
		double den=10000;
		
		area=Math.PI*Math.pow(radio, dos);
		
		return area/den;
		
	}

	// pasarmetroscuadrados
	public double metrosCuadrados() {
			
			double area =0.0; 
			double den=10000;
			
			area = calcularArea();
			
			return area/den; 
			
		}

}
