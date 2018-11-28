package com.uae.biblioteca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Editorial {
	
	@Id
	private long idEditorial;
	private String nombre;
	private String telefono;
	private String direccion;
	private String contacto;
	
	public Editorial() {
		super();
	}
	
	public Editorial(long idEditorial, String nombre, String telefono, String direccion, String contacto) {
		super();
		this.idEditorial = idEditorial;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.contacto = contacto;
	}


	public long getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(long idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
	

}
