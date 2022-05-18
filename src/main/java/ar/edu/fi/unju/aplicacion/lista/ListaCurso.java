package ar.edu.fi.unju.aplicacion.lista;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.fi.unju.aplicacion.model.Curso;
import ar.edu.fi.unju.aplicacion.model.Docente;

public class ListaCurso {
	
	private ArrayList<Curso> cursos;
	
	public ListaCurso() {
		cursos = new ArrayList<Curso>();
		cursos.add(new Curso(1, "Ingles I", "Idiomas", LocalDate.of(2022, 6, 26), LocalDate.now(), 144, "Virtual", new Docente(100,"Alejandro","Ysya","ysya@mail.com","3884789562")));
		cursos.add(new Curso(2, "Frances I", "Idiomas", LocalDate.of(2022, 6, 26), LocalDate.now(), 144, "Presencial", new Docente(102,"Lionel","Messi","l10m@mail.com","3884987462")));
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
