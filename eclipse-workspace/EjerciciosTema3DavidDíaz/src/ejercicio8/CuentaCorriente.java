package ejercicio8;

public class CuentaCorriente {
	
	
	//atributos 
	
	private double saldo;
	private String nombreTitular;
	
	//constructor
	public CuentaCorriente(double saldo, String nombreTitular) {
		this.saldo=saldo;
		this.nombreTitular=nombreTitular;
	}
		
	//ingresar
	public double ingresar (int ingreso) {
		
		saldo+=ingreso;
		
		return saldo;
	}
	//retirar
	public double retirar (int retirar) {
		saldo-=retirar;		
		return saldo;	
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
