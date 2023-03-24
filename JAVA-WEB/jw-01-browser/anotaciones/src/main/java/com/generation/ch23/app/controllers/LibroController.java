package com.generation.ch23.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ch23.app.model.Libro;
import com.generation.ch23.app.repositories.LibrosRepositorios;

@RestController
public class LibroController {
	@Autowired //esta anotacion hace la instancia sin tener que crear objeto y constructor. Solo es necesario indicarle el repositorio y el objeto que declararemos (libroRepo)
	LibrosRepositorios libroRepo;
	@RequestMapping("/libros")//lo que esta en el parentesis es el endpoint en donde le decimos donde depositar los datos del metodo que le ponemos justo abajo
	public List<Libro>listarTodo(){
		return libroRepo.listarLibros();
	
	}

}
