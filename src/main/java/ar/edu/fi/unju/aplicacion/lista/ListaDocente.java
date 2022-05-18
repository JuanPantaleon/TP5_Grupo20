package ar.edu.fi.unju.aplicacion.lista;

import java.util.ArrayList;

import ar.edu.fi.unju.aplicacion.model.Docente;

public class ListaDocente {
	
	private ArrayList<Docente> docentes;
	
	public ListaDocente() {
		docentes = new ArrayList<Docente>();
		docentes.add(new Docente(100,"Alejandro","Ysya","ysya@mail.com","3884789562"));
		docentes.add(new Docente(102,"Lionel","Messi","l10m@mail.com","3884987462"));
		docentes.add(new Docente(103,"Carlos","Tevez","apache@mail.com","3881539562"));
	}

	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}
	
}
