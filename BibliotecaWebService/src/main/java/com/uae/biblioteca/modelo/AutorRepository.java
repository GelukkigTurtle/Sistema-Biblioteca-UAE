package com.uae.biblioteca.modelo;

import org.springframework.data.repository.CrudRepository;

import com.uae.biblioteca.entidades.Autor;

public interface AutorRepository extends  CrudRepository<Autor,Integer> {

}
