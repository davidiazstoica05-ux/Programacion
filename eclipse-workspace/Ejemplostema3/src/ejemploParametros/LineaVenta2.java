package ejemploParametros;

public class LineaVenta2 {

	
	//Producto no es atributo, en este ejemplo
	private int cantidad; 
	private double subtotal;
	public LineaVenta2(int cantidad, double subtotal) {
		super();
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}
	public LineaVenta2(int cantidad) {
		super();
		this.cantidad = cantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "LineaVenta2 [cantidad=" + cantidad + ", subtotal=" + subtotal + "]";
	}
	 
	
	//Calcular el subtotal
	
	public double calcularSubtotal (double por, Producto p) {
		
		subtotal= cantidad*p.calcularPvp(por);
		return subtotal;
	}
	
	
}
