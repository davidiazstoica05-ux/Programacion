package ejercicio11;

public class GestionDeNotas {
	
	private Alumno alumn;

	public GestionDeNotas(Alumno alumn) {
		super();
		this.alumn = alumn;
	}

	public GestionDeNotas() {
		super();
	}

	public Alumno getAlumn() {
		return alumn;
	}

	public void setAlumn(Alumno alumn) {
		this.alumn = alumn;
	}

	@Override
	public String toString() {
		return "GestionDeNotas [alumn=" + alumn + "]";
	} 
	
	

		
		
	}
	

	
	
	

