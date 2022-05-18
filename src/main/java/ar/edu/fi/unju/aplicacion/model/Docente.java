package ar.edu.fi.unju.aplicacion.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class Docente {
	@Positive(message="Debe ingresar un legajo correcto") @NotNull
	private int legajo;
	@NotEmpty(message="El nombre del alumno no puede estar vacio")
	private String nombre;
	@NotEmpty(message="El apellido del alumno no puede estar vacio")
	private String apellido;
	@NotEmpty @Email
	private String email;
	@NotEmpty(message="El telefono del alumno no puede estar vacio")
	@Positive(message="Debe ingresar un numero de telefono")
	private String telefono;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Docente(int legajo, String nombre, String apellido, String email, String telefono) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}
	
}
