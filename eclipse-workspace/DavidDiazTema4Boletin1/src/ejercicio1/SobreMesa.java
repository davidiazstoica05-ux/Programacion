package ejercicio1;

public class SobreMesa extends Ordenador {
	
	private double precioMontaje;

	public SobreMesa(double discoDuro, double frecuenciaProcesador, double precioBase, String marca,
			double precioMontaje) {
		super(discoDuro, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString()+ "SobreMesa [precioMontaje=" + precioMontaje + "]";
	} 
	
	
	
	
}
