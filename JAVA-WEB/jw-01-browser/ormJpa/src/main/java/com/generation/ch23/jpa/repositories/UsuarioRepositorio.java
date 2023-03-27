package com.generation.ch23.jpa.repositories;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.generation.ch23.jpa.models.UsuarioModel;

@Repository

//esta es una clase interface que va a declaarar todos los metodos que mi app necesite para realizar consultas, seran metodos abstractos, no implementados
public interface UsuarioRepositorio extends CrudRepository <UsuarioModel, Long> {
	public ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
