package com.generation.ch23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity //esta anotacion le dice al framework que esta clase se va a convertir en una entidad
@Table(name = "detalle_orden") //
public class DetalleOrdenModel {
	@Id  //campo clave, se le tiene que indicar que es autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreDetalleOrden;
	
	
	@OneToOne //notacion que declara la relacion (uno detalles relacionandose con una orden)
	private OrdenModel orden;
	
	@OneToOne //notacion que declara la relacion (uno detalles relacionandose con un producto)
	private ProductoModel producto;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreDetalleOrden() {
		return nombreDetalleOrden;
	}
	public void setNombreDetalleOrden(String nombreDetalleOrden) {
		this.nombreDetalleOrden = nombreDetalleOrden;
	}
	
	
	

}
