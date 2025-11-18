package ejercicio11;

import java.util.Arrays;

public class Alumno {
	
	private String nombre; 
	private String curso; 
	private double notas[] ;
	private int suspensos;
	private double notaMedia;
	
	public Alumno(String nombre, String curso, int numAsignaturas) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = new double[numAsignaturas];
		this.suspensos = 0;
		this.notaMedia = 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getSuspensos() {
		return suspensos;
	}

	public void setSuspensos(int suspensos) {
		this.suspensos = suspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + ", suspensos="
				+ suspensos + ", notaMedia=" + notaMedia + "]";
	}
	
	
	
	
	
	
}
