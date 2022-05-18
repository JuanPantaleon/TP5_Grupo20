package ar.edu.fi.unju.aplicacion.lista;

import java.time.LocalDate;
import java.util.ArrayList;
import ar.edu.fi.unju.aplicacion.model.Beca;
import ar.edu.fi.unju.aplicacion.model.Curso;

public class ListaBeca {
	
	private ArrayList<Beca> becas;
	
	public ListaBeca() {
		becas = new ArrayList<Beca>();
		becas.add(new Beca(1, new Curso(1, "Ingles I", null, null, null, 0, null, null), LocalDate.now(), LocalDate.of(2022, 12, 18), "Activo"));
	}

	public ArrayList<Beca> getBecas() {
		return becas;
	}

	public void setBecas(ArrayList<Beca> becas) {
		this.becas = becas;
	}
}
