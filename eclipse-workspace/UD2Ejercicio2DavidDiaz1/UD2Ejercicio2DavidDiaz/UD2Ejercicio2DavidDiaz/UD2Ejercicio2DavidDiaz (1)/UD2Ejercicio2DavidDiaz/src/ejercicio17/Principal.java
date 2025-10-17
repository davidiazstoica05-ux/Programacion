package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double nota,suma=0,media;
        int suspensos=0;
        int numAsignaturas = 6;
        
        System.out.println("Bienvenido, este prorama le ayudara a saber el número de suspensos y la media total");
        System.out.println("Introduce las notas de las " + numAsignaturas + " asignaturas:");

        for (int i = 1; i <= numAsignaturas; i++) {
            System.out.print("Nota " + i + ": ");
            nota = Leer.datoDouble(); 
            suma += nota;

            if (nota < 5) {
                suspensos++;
            }
        }

         media = suma / numAsignaturas;

        System.out.println("\nLa nota media es: " + media);
        System.out.println("Número de suspensos: " + suspensos);
    }
}