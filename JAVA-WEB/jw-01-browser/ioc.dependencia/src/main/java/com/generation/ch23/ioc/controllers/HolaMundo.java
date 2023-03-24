package com.generation.ch23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //esta anotacion indica que la clase va a pertenecer al marco del MVC y va a ser una clase controlador
public class HolaMundo {
	@RequestMapping ("/") //esta anotacion indica que cuando se haga una solicitud mapea la ejecucion del metodo a la raiz del contenedor de mi app, es deccir la direccion que se le da al navegaador, el endpoint, el punto en que saldra o se ejecutara el metodo que viene justo abajo. 
	public String saludar() {
		// TODO Auto-generated method stub
		return "Hola mundo desde Spring Boot";

	}

}
