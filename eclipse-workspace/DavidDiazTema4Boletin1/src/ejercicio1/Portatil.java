package ejercicio1;

public class Portatil extends Ordenador {

	private boolean seguroPantalla;
	private double precioSeguro;

	public Portatil(double discoDuro, double frecuenciaProcesador, double precioBase, String marca,
			boolean seguroPantalla, double precioSeguro) {
		super(discoDuro, frecuenciaProcesador, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [seguroPantalla=" + seguroPantalla + ", precioSeguro=" + precioSeguro + "]";
	}

	@Override
	public double calcularPVP(double porcentaje) {

		if (seguroPantalla) {
			return super.calcularPVP(porcentaje) + precioSeguro;
		} else {
			return super.calcularPVP(porcentaje);

		}

	}

}
