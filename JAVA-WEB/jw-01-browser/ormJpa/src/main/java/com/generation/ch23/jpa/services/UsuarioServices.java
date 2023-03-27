package com.generation.ch23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generation.ch23.jpa.models.UsuarioModel;
import com.generation.ch23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServices {
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
		return usuarioRepositorio.findByPrioridad(prioridad);
	}
	
	public ArrayList <UsuarioModel> ListarUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public Optional<UsuarioModel> obtenerPorId(Long id){
		return usuarioRepositorio.findById(id);
	}

}
