package ejercicio10;

public class Billete {
	/*
	 * Este programa tendría otra serie de clases, pero por simplificar lo haremos
	 * solo con 3 clases. Crear un programa que simule una máquina vendedora de
	 * tickets de metro. Tendremos que crear la clase Billete (Clase POJO), la clase
	 * Maquina (donde estarán todos los métodos con funcionalidad) y la clase
	 * principal de prueba. Tendrá un menú donde se pueda: • Comprar uno o varios
	 * billetes. 
	 * • Calcular el cambio a devolver. 
	 * • Imprimir por pantalla el
	 * billete. Solo uno. Si se han comprado “x” debemos mostrar en el billete el
	 * mensaje “válido para x personas”. 
	 * • Opciones de operario: el operario que
	 * lleva el mantenimiento de la máquina, debe tener disponible un método que le
	 * ofrezca el saldo total de la recaudación de la máquina en ese día (no es
	 * necesario usar fechas) y otro método que pueda poner a cero el contador de
	 * saldo total. 
	 * • Dentro de la opción de operario, también debe contar con la
	 * posibilidad de cambiar el precio de los billetes ya que estos suelen subir
	 * todos los años.
	 * 
	 *  • Las operaciones para el operario se harán solo si se
	 * introduce la contraseña adecuada antes de cualquier otra cosa, por lo que se
	 * debe tener el método comprobar contraseña.
	 */

	private double precio;
	private int saltos;
	private String hora;

	public Billete(double precio, int saltos, String hora) {

		this.precio = precio;
		this.saltos = saltos;
		this.hora = hora;

	}

	public Billete() {

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
		return "Billete [precio=" + precio + ", saltos=" + saltos + ", hora=" + hora
				+ "]";
	}

	
	
	public void imptimirBillete() {
		
		System.out.println("\t*****Metro Sevilla*****");
		System.out.printf("\t\tFecha: %s",hora);
		System.out.printf("\nSaltos: %d",saltos);
		System.out.printf("\nPrecio: %.2f",precio);
		System.out.println("\n***************************");
	}
	
}