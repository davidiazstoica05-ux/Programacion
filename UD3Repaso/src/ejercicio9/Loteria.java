package ejercicio9;

public class Loteria {

	// Son atributos, porque el sorteo esta caracterizado
	// porque la loteria depende del número ganador.
	// Sin embargo el número de usuaario es un atributo del jugador (lo ponemos aqui
	// porque no tenemos varías clases)
	private int numUsuario;
	private int numGanador;

	//Para 
	public Loteria(int numUsuario, int numGanador) {

		this.numUsuario = numUsuario;
		this.numGanador = numGanador;

	}

	public Loteria(int numUsuario) {
		this.numUsuario = numUsuario;
	}

	public Loteria() {
		super();
	}

	// No es aleatorio generar getters and setters pero es recomendable
	// al igual que el toString
	public int getNumUsuario() {
		return numUsuario;
	}

	public void setNumUsuario(int numUsuario) {
		this.numUsuario = numUsuario;
	}

	public int getNumGanador() {
		return numGanador;
	}

	public void setNumGanador(int numGanador) {
		this.numGanador = numGanador;
	}

	@Override
	public String toString() {
		return "Loteria [numUsuario=" + numUsuario + ", numGanador=" + numGanador + "]";
	}
	
	//generarDecimoAletorio 
	
	
	// mostrar

	public void mostrar() {
		int cero = 0, uno = 1, nuevemil = 99999;

		if (!(numUsuario < cero) && numUsuario >= uno && numUsuario < nuevemil) {
			System.out.printf("El decimo solicitado es: %05d", numUsuario);

		} else {

		}

	}

}
