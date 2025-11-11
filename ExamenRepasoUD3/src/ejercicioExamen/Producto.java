package ejercicioExamen;

public class Producto {

	private String nombreP;
	private double precioUd;
	private int stock;

	public Producto(String nombreP, double precioUd, int stock) {

		this.nombreP = nombreP;
		this.precioUd = precioUd;
		this.stock = stock;

	}

	public Producto(int stock, double precioUd) {

		this.stock = stock;
		this.precioUd = precioUd;
	}

	public Producto() {

	}

	//metodos
	//vender 
	public  boolean comprobar (int stockVentas) {
		
		if (stockVentas<=stock) {
				stock-=stockVentas;
				return true;
			
		} else {
			return false;
		}
	}
	
	public void mostrar (int stockVentas){
		
		if (comprobar(stockVentas)) {
			System.out.println("Venta realizada con exito");
		} else {
			System.out.println("Error, Stock insuficiente ");
		}
		
		
		
		
	}

}
