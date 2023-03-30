package com.generation.ch23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity //esta anotacion le dice al framework que esta clase se va a convertir en una entidad
@Table(name = "producto") //
public class ProductoModel {
	@Id  //campo clave, se le tiene que indicar que es autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	//private Integer usuarioId;
	
	
	@ManyToOne //notacion que declara la relacion (muchos productos relacionandose con un usuario)
	private UsuarioModel usuario;
	
	@OneToOne (mappedBy = "producto")//anotacion que declara la relacion (un producto relacionandose con muchos detalles de orden)
	private DetalleOrdenModel detalle;
	
	
	
	public ProductoModel() {
	}

	
	public ProductoModel(Long id, String nombreProducto, UsuarioModel usuario) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		//this.usuarioId = usuarioId;
		this.usuario = usuario;
	
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombreProducto() {
		return nombreProducto;
	}



	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}



	/*public Integer getUsuarioId() {
		return usuarioId;
	}



	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}*/



	public UsuarioModel getUsuario() {
		return usuario;
	}



	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}



}
