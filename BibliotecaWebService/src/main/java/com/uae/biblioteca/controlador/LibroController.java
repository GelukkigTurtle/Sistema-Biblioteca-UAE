package com.uae.biblioteca.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uae.biblioteca.entidades.Autor;
import com.uae.biblioteca.entidades.Libro;
import com.uae.biblioteca.modelo.AutorRepository;
import com.uae.biblioteca.modelo.LibroRepository;

@RestController
@RequestMapping(path="/libro")
public class LibroController {
	
	@Autowired
	private LibroRepository libroModel;
	
	@Autowired
	private AutorRepository autorModel;
	
	
	@GetMapping(path="/agregar")
	public String agregar(
			@RequestParam(value="titulo" , defaultValue= "") String titulo ,
			@RequestParam(value="edicion" , defaultValue= "1") int edicion,
			@RequestParam(value="fecha" , defaultValue= "0") int fechaPublicacion,
			@RequestParam(value="isbn" , defaultValue= "") String isbn,
			@RequestParam(value="paginas" , defaultValue= "1") int numeroPaginas,
			@RequestParam(value="codigo" , defaultValue= "") String codigo,
			@RequestParam(value="condicion" , defaultValue= "") String condicionFisica,
			@RequestParam(value="estado" , defaultValue= "0") int estado,
			@RequestParam(value="comentario" , defaultValue= "") String comentario,
			@RequestParam(value="idautor" , defaultValue= "0") int idAutor,
			@RequestParam(value="idcategoria" , defaultValue= "0") int idCategoria,
			@RequestParam(value="ideditorial" , defaultValue= "0") int idEditorial
			
			) {
		String resultado = "";
		try {
			Optional<Autor> autor = autorModel.findById(idAutor);
			//Optional<Categoria> categoria = categoriaModel.findById(idCategoria);
			
			Libro libro = new Libro(0, titulo, edicion, fechaPublicacion, 
					isbn, numeroPaginas, codigo, condicionFisica, estado, comentario, 
					autor.get(), null, null);
			
			libroModel.save(libro);
			
			
			resultado = "Libro Guardado";
			
		} catch (Exception e) {
			e.printStackTrace();
			resultado = "Error";
		}
		
		return resultado;
	}

}
