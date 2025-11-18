package ejercicio10;

public class Maquina {
	
	
	private double saldo; 
	private Billete b ; 
	private int passw;
	
	public Maquina(double saldo, Billete b, int passw) {
		super();
		this.saldo = saldo;
		this.b = b;
		this.passw = passw;
	}
	
	
	public Maquina() {
		super();

	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Billete getB() {
		return b;
	}
	public void setB(Billete b) {
		this.b = b;
	}
	public int  getPassw() {
		return passw;
	}
	public void setPassw(int passw) {
		this.passw = passw;
	}
	@Override
	public String toString() {
		return "Maquina [saldo=" + saldo + ", b=" + b + ", passw=" + passw + "]";
	}
	
	//Precio total del billete
	public double pagarPersona(int numPers) {		 
		 return numPers*b.getPrecio()*b.getSaltos();
	}
	
	//Cambio del billete 
	public double devolverDinero (double introducirDinero, double pagarPP) {
		
		return pagarPP-introducirDinero;
	}
	
}