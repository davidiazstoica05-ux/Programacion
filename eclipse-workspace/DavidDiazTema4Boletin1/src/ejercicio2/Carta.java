package ejercicio2;

public class Carta extends Documento {

	public String fecha;

	public Carta(int nIF, String nombreEmpresa, double numEmpleados, String fecha) {
		super(nIF, nombreEmpresa);
		this.fecha = fecha;
	}

	@Override
	public void imprimirCabecera() {
		System.out.printf("Fecha: %s",fecha);
		super.imprimirCabecera();
		
	} 
	
	
	
	
	
	
}
