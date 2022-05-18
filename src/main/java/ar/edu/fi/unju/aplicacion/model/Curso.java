package ar.edu.fi.unju.aplicacion.model;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

public class Curso {
	@Positive(message="Debe ingresar un legajo codigo correcto") @NotNull
	private int codigo;
	@NotEmpty(message="El titulo no puede estar vacio")
	private String titulo;
	@NotEmpty(message="La categoria no puede estar vacia")
	private String categoria;
	@NotNull(message="La fecha no puede ser nula")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fechaInicio;
	@NotNull(message="La fecha no puede ser nula")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fechaFin;
	@Positive(message="Debe ingresar un numero correcto de horas") @NotNull
	private int cantidadHoras;
	@NotEmpty(message="La modalidad no puede estar vacia")
	private String modalidad;
	@NotNull
	private Docente docente;
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Curso(int codigo, String titulo, String categoria, LocalDate fechaInicio, LocalDate fechaFin, int cantidadHoras, String modalidad, Docente docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
	}
	
}
