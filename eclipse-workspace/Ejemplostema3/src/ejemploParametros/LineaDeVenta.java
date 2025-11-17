package ejemploParametros;

public class LineaDeVenta {

	private Producto p = new Producto (); 
	
	private int cantidad; 
	
	private double subTotal;
	
	

	public LineaDeVenta(Producto p, int cantidad, double subTotal) {
		super();
		this.p = p;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}
	
	public LineaDeVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

	public LineaDeVenta() {
		super();
	}


	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + ", subTotal=" + subTotal + "]";
	} 
	
	public double calcularPrecio(double porcentaje) {
		
		
		//De esta forma actualizo el subtotal.

		subTotal=p.calcularPvp(porcentaje); 
		
		return subTotal;
		
		//No hacer: resultado=cantidad*(p.getpreciobase()+precioPvp(por)/100;
		
	}
	
	
	
}
