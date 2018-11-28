package com.uae.biblioteca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTOR")
public class Autor {
	
	@Id
	@GeneratedValue
	private Integer idAutor;
	private String nombre_completo;
	private String nacionalidad;
	
	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Autor(Integer idAutor, String nombre_completo, String nacionalidad) {
		super();
		this.idAutor = idAutor;
		this.nombre_completo = nombre_completo;
		this.nacionalidad = nacionalidad;
	}
	public long getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	

}
