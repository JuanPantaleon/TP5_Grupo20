package ar.edu.fi.unju.aplicacion.model;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Beca {
	@Min(value=1,message="El codigo debe ser mayor o igual a 1") @NotNull
	private int codigo;
	@NotNull
	private Curso curso;
	@NotNull(message="La fecha no puede ser nula")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fechaInicio;
	@NotNull(message="La fecha no puede ser nula")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fechaCierre;
	@NotEmpty(message="El estado no puede estar vacio")
	private String estado;
	
	public Beca() {
		// TODO Auto-generated constructor stub
	}
	
	public Beca(int codigo, Curso curso, LocalDate fechaInicio, LocalDate fechaCierre, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
