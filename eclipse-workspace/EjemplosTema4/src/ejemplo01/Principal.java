package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=2;
		String asig [] = new String [tam];
		
		Persona p1 = new Persona("David", "Díaz", "31031X", 2, 20);
		System.out.println("Datos: "+p1);
		
		Alumno a1 = new Alumno("Ángel", "Díaz", "31031X", 1, 45, asig, "Aula08", 2); 
		System.out.println("Datos: "+a1);
		
	}	
	

}
