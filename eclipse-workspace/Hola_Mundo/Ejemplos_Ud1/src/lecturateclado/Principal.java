package lecturateclado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad;
		double precio;
		
		
		//ctrl+shift+f= tabular codigo
		
		System.out.println("Diga su nombre");
			nombre=Leer.dato();
		
		System.out.println("Introduzca su edad");
			edad=Leer.datoInt();
		
		System.out.println("Su nombre es: "+nombre+"y su edad: "+edad);
		
		System.out.println("Diga el precio de las patatas");
		precio=Leer.datoDouble();
		System.out.printf("El precio es: %.2f €",precio);
	}

}
