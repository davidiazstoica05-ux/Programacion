package ejercicio2;

public class Documento {

	private int NIF;
	private String nombreEmpresa;

	public Documento(int nIF, String nombreEmpresa) {
		super();
		NIF = nIF;
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void imprimirCabecera() {
		
		System.out.printf("NIF:%d \t\t\t  %s");
		
		
	}

}
