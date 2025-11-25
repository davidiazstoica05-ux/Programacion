package ejemploParametros;


public class Venta2 {

	private double totalVenta;
	private String nombreVendedor;
	// No se inicializa el array;

	public Venta2(double totalVenta, String nombreVendedor) {
		super();
		this.totalVenta = totalVenta;
		this.nombreVendedor = nombreVendedor;		
	}
	
	public double calcularMedia (double listaImpuesto[]) {
		
		double suma=0;
		
		
		for (int i = 0; i < listaImpuesto.length; i++) {
			
			suma += listaImpuesto[i]; 
		}
		
		return suma/listaImpuesto.length;
		
	}	

}
