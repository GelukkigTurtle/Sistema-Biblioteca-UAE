package com.uae.biblioteca.controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uae.biblioteca.entidades.Autor;
import com.uae.biblioteca.modelo.AutorRepository;

@RestController
@RequestMapping(path="/autor")
public class AutorController {
	
	@Autowired
	private AutorRepository autorModel;
	
	//http://localhost:8080/autor/agregar?nombre=Freddy&nacionalidad=Salvadorenio
	@GetMapping(path="/agregar")
	public String agregar(
			@RequestParam(value="nombre") String nombreCompleto ,
			@RequestParam(value="nacionalidad") String nacionalidad) {
		String resultado = "";
		try {
			Autor autor = new Autor();
			autor.setNombre_completo(nombreCompleto);
			autor.setNacionalidad(nacionalidad);
			
			autorModel.save(autor);
			resultado = "Autor Guardado";
			
		} catch (Exception e) {
			e.printStackTrace();
			resultado = "Error";
		}
		
		return resultado;
	}
	
	 @GetMapping(path="/get")
	 public  List<Autor> getAll() {
		 List<Autor> allAutores = new ArrayList<Autor>();
		  try {
			 Iterator<Autor> iAutor = autorModel.findAll().iterator();
			 Autor autor = null;
			 while(iAutor.hasNext()) {
				 autor = iAutor.next();
				 allAutores.add(autor);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return allAutores;
	 }
	 
	 @GetMapping(path="/actualizar")
	 public String actualizar(
			    @RequestParam(value="id") int id,
			    @RequestParam(value="nombre") String nombreCompleto ,
				@RequestParam(value="nacionalidad") String nacionalidad) {
		 String resultado = "";
		 try {
			Optional<Autor> optAutor =  autorModel.findById(id); //obtenemos el autor  con el id
			if(optAutor.isPresent()) {
				Autor autor = optAutor.get(); 
				autor.setNombre_completo(nombreCompleto);
				autor.setNacionalidad(nacionalidad);
				
				autorModel.save(autor); // se guardan los cambios
				resultado = "Autor Actualizado";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			resultado = "Error";
		}
		 return resultado;
	 }
	 
	 @GetMapping(path="/eliminar")
	 public String eliminar( @RequestParam(value="id") int id) {
		 String resultado = "";
		 try {
				Optional<Autor> optAutor =  autorModel.findById(id); //obtenemos el autor  con el id
				if(optAutor.isPresent()) {
					Autor autor = optAutor.get(); 
					
					autorModel.delete(autor);
					resultado = "Autor Eliminado";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				resultado = "Error";
			}
		 
		 return resultado;
	 }
	 
	 
	

}
