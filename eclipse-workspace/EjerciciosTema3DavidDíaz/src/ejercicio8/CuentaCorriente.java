package ejercicio8;

public class CuentaCorriente {
	
	
	//atributos 
	
	private double saldo;
	private String nombreTitular;
	
	//Constructor
	public CuentaCorriente(String nombreTitular) {
		this.saldo=1000.0;
		this.nombreTitular=nombreTitular;
	}
	//Constructor Vacío, el que no tiene nada entre los paréntesis
	public CuentaCorriente() {
		
	}
	//Constructor Todos
	public CuentaCorriente(double saldo, String nombreTitular) {
		this.saldo=saldo;
		this.nombreTitular=nombreTitular;
	}
	
	//Ingresar
	public double ingresar (int ingreso) {
		//saldo=saldo+ingreso;
		saldo+=ingreso;
		
		//Si no devuelvo nada el saldo igualmente se actualiza
		//En caso de duda, hago las dos cosas
		return saldo;
	}
	//retirar
	public boolean retirar (int retirar) {
	if (retirar>saldo) {
		return false;
		
	} else {
		//saldo=saldo-retirar;
		saldo-=retirar;		
		return true;	
	}
}
		
	//mostrarMensaje
	public void mostrarMensaje (boolean b) {
		if (b) {
			System.out.println("Operación exitosa");
		} else {
			System.out.println("Saldo insuficiente");

		}
		
	
	
	}
	//Consultar
	public void consultar () {
		
		System.out.println("El saldo disponible es: "+saldo+"€");
	}
	
	//dolares 
	public double cambiar(double dolar) {
		
		return saldo*dolar;
		
		
	}
	
	
	

}
