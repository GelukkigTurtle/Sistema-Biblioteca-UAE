package com.uae.biblioteca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	private long idCategoria;
	private String nombre;
	
	public Categoria() {
		super();
	}

	public Categoria(long idCategoria, String nombre) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
