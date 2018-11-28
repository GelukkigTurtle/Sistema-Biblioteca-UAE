package com.uae.biblioteca.entidades;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prestamo {
	
	@Id
	private long idPrestamo;
	private Date fecha_entrega;
	private Date fecha_devolucion;
	private BigDecimal monto_mora;
	private String carnet_estudiante;
	private String nombre_encargado;
	private Date fecha_creacion;
	
	@ManyToOne
	private Libro idLibro;
	@ManyToOne
	private Autor idAutor;
	@ManyToOne
	private Editorial idEditorial;
	
	public Prestamo() {
		super();
	}

	public long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setFecha_devolucion(Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}

	public BigDecimal getMonto_mora() {
		return monto_mora;
	}

	public void setMonto_mora(BigDecimal monto_mora) {
		this.monto_mora = monto_mora;
	}

	public String getCarnet_estudiante() {
		return carnet_estudiante;
	}

	public void setCarnet_estudiante(String carnet_estudiante) {
		this.carnet_estudiante = carnet_estudiante;
	}

	public String getNombre_encargado() {
		return nombre_encargado;
	}

	public void setNombre_encargado(String nombre_encargado) {
		this.nombre_encargado = nombre_encargado;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Libro getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Libro idLibro) {
		this.idLibro = idLibro;
	}

	public Autor getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Autor idAutor) {
		this.idAutor = idAutor;
	}

	public Editorial getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(Editorial idEditorial) {
		this.idEditorial = idEditorial;
	}
	
	
	
	
	

}
