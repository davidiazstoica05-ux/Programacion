package ejercicio10;

public class Billete {

	private double precio;
	private int numPersona;
	private int saltos;
	private String hora;

	public Billete(double precio,  int saltos, String hora) {

		this.precio = precio;
		this.saltos = saltos;
		this.hora = hora;

	}

	public Billete(double precio, int numPersona) {

		this.precio = precio;
		this.numPersona = numPersona;

	}

	public Billete() {

	}
	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setNumPersona(int numPersona) {
		this.numPersona = numPersona;
	}


	public void setSaltos(int saltos) {
		this.saltos = saltos;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Billete [precio=" + precio + ", numPersona=" + numPersona + ", saltos=" + saltos + ", hora=" + hora
				+ "]";
	}

	public double comprar() {
		
		double totalPago;
		
		return totalPago=precio*numPersona;
	}

	public int saltar(double totalPago) {
		
		
		
		
	}

}
