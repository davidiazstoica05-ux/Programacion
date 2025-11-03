package ejemploObjetos;

public class Circulo {

	// atributo
	private double radio; // Atributo está en azul

	// Constructor con parámetros

	public Circulo(double radio) { // radio es una variable, está en marrón

		this.radio = radio;

	}

	// Imprimir

	public void imprimirDatos() {
		System.out.println("Valores: " + radio);
	}

	// metodo para calcular el área
	// Si hace falta el radio y no es atributo
	// Se pasa como parámetro, si es atributo se usa directamente sin pasar en los
	// parentesis
	public double calcularArea() {

		double area = 0.0, dos = 2.0;
		area = Math.PI * Math.pow(radio, dos);
		return area;
	}

	// Version dos, mejor (Nos ahorramos la variable área )
	public double calcularAreaV2() {

		double dos = 2.0;
		return Math.PI * Math.pow(radio, dos);

	}

	// pasarametrocuadrados
	public double metrosCuadrados() {
		double area = 0.0, dos = 2.0;
		double den = 10000;
		area = Math.PI * Math.pow(radio, dos);

		return area / den;

	}

	// m2 V2
	public double metrosCuadros2() {
		double area = 0.0;
		double den = 10000;
		area=calcularArea();
		return area/den;

	}

}
