package ejercicio5;

public class Copiado {

	private String frase; 
	private int veces;
	
	
	public Copiado (String frases, int veces) {
		
		this.frase=frases;
		this.veces=veces;
		
	}
	
	public void copiar() {

		for (int i = 0; i < veces; i++) {

			System.out.println("" + frase);

		}

	}

}
