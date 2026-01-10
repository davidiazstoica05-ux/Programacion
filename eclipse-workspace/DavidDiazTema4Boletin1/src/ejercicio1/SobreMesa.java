package ejercicio1;

public class SobreMesa extends Ordenador {
	
	private boolean montaje;
	private double precioMontaje;

	
	public SobreMesa(double discoDuro, double frecuenciaProcesador, double precioBase, String marca, boolean montaje,
			double precioMontaje) {
		super(discoDuro, frecuenciaProcesador, precioBase, marca);
		this.montaje = montaje;
		this.precioMontaje = precioMontaje;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+"SobreMesa [montaje=" + montaje + ", precioMontaje=" + precioMontaje + "]";
	}



	@Override
	public double calcularPVP(double porcentaje) {
		if (montaje) {
			return super.calcularPVP(porcentaje) + precioMontaje;
		} else {
			return super.calcularPVP(porcentaje);
		}
		
	} 
	
	
	
	
}
