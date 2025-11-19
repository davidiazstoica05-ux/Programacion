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
	
	//Para que sea por salto 
		//public double saltarBillete (){
		
		//double total;
		//total=precioSalto+(numSalto*plus)
	//}
	
	//Precio total del billete
	public double pagarBillete(int numPers) {		 
		 return numPers*b.getPrecio()+b.getSaltos();
	}
	
	//Cambio del billete 
	public double devolverDinero (double introducirDinero, double pagarPP) {
		
		return pagarPP-introducirDinero;
	}
	
	//ImprimirBillete 
	
	public void imprimirBillete (double cambio , double pagarBillete, int numPers, double entregado) {
		
		
		    System.out.println("*********************************");
		    System.out.println("* METRO DE SEVILLA        *");
		    System.out.println("* BILLETE DE VIAJE        *");
		    System.out.println("*********************************");
		    
		    // Mostramos la hora (asumiendo que tienes el atributo 'horaCompra')
		    System.out.println("* Hora de Compra:      " + b.getFecha()+ " *");
		    System.out.println("* *");
		    
		    System.out.println("* DETALLES DEL VIAJE:           *");
		    // Mostramos los saltos
		    System.out.println("* - Zonas / Saltos:    " + b.getSaltos() + "        *");
		    
		    // Mostramos el número de personas
		    System.out.println("* - Pasajeros:         " + numPers + "        *");
		    System.out.println("* *");
		    
		    // Mostramos el precio total con 2 decimales
		    System.out.printf("* PRECIO TOTAL:         %.2f€    *\n",b.getPrecio() );
		    System.out.printf("* Entregado:           %6.2f€  *\n", entregado);
	        System.out.printf("* Cambio:              %6.2f€  *\n", cambio);
		    
		    System.out.println("*********************************");
		    System.out.println("* ¡Gracias por viajar       *");
		    System.out.println("* con Metro Sevilla!       *");
		    System.out.println("*********************************");
		}

	//sumarSaldo 
	
	public double sumarSaldo( double pagarBillete ) {
		
		return saldo=saldo+pagarBillete;
		
	}
	
	//Comprobar 
	
	public boolean comprobarContraseña(int passwI) {
		
		if (passw==passwI) {
			
			
			return true;
			
		} else {

			return false;
		}
		
		
		
	}
	
	
	}
	
