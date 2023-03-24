package com.generation.ch23.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.generation.ch23.app.model.Libro;

@Repository 
public class LibrosRepositorios {
public List<Libro> listarLibros(){
	List<Libro> lista = new ArrayList<Libro>();
	lista.add(new Libro("Spring Boot", "Luis", "2901374851"));
	lista.add(new Libro("Java", "Pedro", "2901374654"));
	lista.add(new Libro("C", "Richard", "2901374012"));
	return lista;
	
}
}
