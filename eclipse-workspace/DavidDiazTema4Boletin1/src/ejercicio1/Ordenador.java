package ejercicio1;

public class Ordenador {

	private double DiscoDuro;
	private double frecuenciaProcesador;
	private double precioBase;
	private String marca;

	public Ordenador(double discoDuro, double frecuenciaProcesador, double precioBase, String marca) {
		super();
		DiscoDuro = discoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [DiscoDuro=" + DiscoDuro + ", frecuenciaProcesador=" + frecuenciaProcesador + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}

	public double calcularPVP(double porcentaje) {

		int den = 100;
		double ganancia;

		ganancia = porcentaje / den;

		return ganancia + precioBase;

	}

}
