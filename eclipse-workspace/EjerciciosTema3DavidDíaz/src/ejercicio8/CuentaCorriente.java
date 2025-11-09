package ejercicio8;

import utilidades.Leer;

public class CuentaCorriente {
	
	
	//atributos 
	
	private double saldo;
	private String nombreTitular;
	
	//constructor
	public CuentaCorriente(String nombreTitular) {
		this.saldo=0.0;
		this.nombreTitular=nombreTitular;
	}
		
	//ingresar
	public double ingresar (int ingreso) {
		
		saldo+=ingreso;
		
		return saldo;
	}
	//retirar
	public boolean retirar (int retirar) {
	if (retirar>saldo) {
		return false;
		
	} else {
		saldo-=retirar;		
		return true;	
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
