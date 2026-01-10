package ejercicio2;

public class TarjetaDeVisita extends Documento {

	private int numTelefono;
	private String email;
	private String nombre;
	private String apellido;

	public TarjetaDeVisita(int nIF, String nombreEmpresa, int numTelefono, String email, String nombre,
			String apellido) {
		super(nIF, nombreEmpresa);
		this.numTelefono = numTelefono;
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public void imprimirCabecera() {
		super.imprimirCabecera();
		System.out.printf("Nombre: %s Apellidos: %s\n", nombre, apellido);
		System.out.printf("NumTelef: %d email@: %s", numTelefono, email);

	}

}
