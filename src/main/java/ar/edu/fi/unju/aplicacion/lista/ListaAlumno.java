package ar.edu.fi.unju.aplicacion.lista;

import java.util.ArrayList;

import ar.edu.fi.unju.aplicacion.model.Alumno;


public class ListaAlumno {
	private ArrayList<Alumno> alumnos;
	
	public ListaAlumno() {
		alumnos = new ArrayList<Alumno>();
		alumnos.add(new Alumno(43634761, "Martin", "Palermo", "Mar9Paler@gmail.com", "3885727635"));
		alumnos.add(new Alumno(41904264, "Jazmin", "Gualdoni", "Jazchu@gmail.com", "3880987635"));
		alumnos.add(new Alumno(44545872, "Maximo", "Cocetti", "MaximoCocetti03@gmail.com", "3885836783"));
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
