package com.uae.biblioteca.modelo;

import org.springframework.data.repository.CrudRepository;

import com.uae.biblioteca.entidades.Libro;

public interface LibroRepository extends CrudRepository<Libro,Integer>{

}
