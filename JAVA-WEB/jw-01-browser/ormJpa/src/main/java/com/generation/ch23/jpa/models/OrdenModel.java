package com.generation.ch23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity //esta anotacion le dice al framework que esta clase se va a convertir en una entidad
@Table(name = "orden") //
public class OrdenModel {
	@Id  //campo clave, se le tiene que indicar que es autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreOrden;
	//private Long usuarioId;
	
	
	@ManyToOne //notacion que declara la relacion (muchas ordenes relacionandose con un usuario)
	private UsuarioModel usuario;
	
	@OneToOne(mappedBy = "orden")//relacion uno a uno
	private DetalleOrdenModel detalle;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreOrden() {
		return nombreOrden;
	}
	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}
	/*public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}*/
	

	
}