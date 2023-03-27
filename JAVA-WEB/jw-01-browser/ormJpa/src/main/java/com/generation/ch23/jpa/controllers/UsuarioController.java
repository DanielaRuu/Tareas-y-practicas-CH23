package com.generation.ch23.jpa.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ch23.jpa.models.UsuarioModel;
import com.generation.ch23.jpa.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")//este es el endpoint

public class UsuarioController {
	
	@Autowired
	UsuarioServices usuarioServices;
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable ("id") Long id) {
		boolean ok = usuarioServices.eliminarUsuario(id);
		if(ok) {
			return "Se eliminó el usuario";
		} else {
			return "No se eliminó el usuario";
		}
		
		// @PathVariable: aqui la anotacion permite eliminar un registro indicando el id directaamente sobre el path, es decir en la url de busqueda del navegador asi:http://localhost:8080/usuario/1 la accion de eliminacion la realizamos en postman, y al actualizar la BD en workbench muestra solo los registros que no se han eliminado
		
	}
	
	@GetMapping() //metodos de http llevan parentesis 
	public ArrayList<UsuarioModel> ListarUsuarios() {
		return usuarioServices.ListarUsuarios();
	}
	
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuarioModelo)  {
		return usuarioServices.guardarUsuario(usuarioModelo);
		//requestbody es un requerimiento para guardar
	}
	
	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerPorPrioridad(@RequestParam("prioridad")Integer prioridad){
		return usuarioServices.obtenerPorPrioridad(prioridad);
		// @request param configura la busqueda en la url de esta forma: http://localhost:8080/usuario/query?prioridad=10
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable ("id") Long id){
		return usuarioServices.obtenerPorId(id);
		//@PathVariable: permite hacer la consulta indicando el valor de la consulta directaamente sobre el path, es decir en la url de busqueda del navegador asi: http://localhost:8080/usuario/2
	}

}
