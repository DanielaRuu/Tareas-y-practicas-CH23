package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indico que mi clase Producto se convierte en una entidad JPA (PERSISTENCIA DE DATOS)
@Table(name = "Producto")//especificar de forma correcta el nombre de la tabla

public class Producto {
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
	//atributos
	private Long id;
	private String nombre;
	private String descripcion;
	private String url_Imagen;
	private double precio;
	
	//constructor vacio para el Jackson (serializar y deserializar un objeto JAVA a JSON)
	public Producto() {
		
	}
	

	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripcion, String url_Imagen, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url_Imagen = url_Imagen;
		this.precio = precio;
		
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getUrl_Imagen() {
		return url_Imagen;
	}


	public void setUrl_Imagen(String url_Imagen) {
		this.url_Imagen = url_Imagen;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	//toString metodo que se puede sobreescribir
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", url_Imagen="
				+ url_Imagen + ", precio=" + precio + "]";
	}
	
	

	

}



/*

Colecciones o Collections

    - Array
    
Estructura de datos lineal, siempre contiene datos del mismo tipo. Los datos estan almacenados de forma contigua en la memoria. Se accede a los elementos a traves de un indice.

    - Tamanio fijo
    - Acceso rapido
    - Coste elevado para insertar o eliminar elementos. 
    
    

    - Set (conjuntos)
Estructuras de datos que almacena elementos unicos y sin orden.

    - No hay elementos elementos duplicados. Si trato de agregar un elemento repetido, el conjunto lo ignora.
    - No hay orden especifico (puede ser bueno o malo para acceder a la informacion)
    - Busqueda rapida: hay funciones especificas de este conjunto para buscar informacion

    
    
    
    - Map (mapas)
Estructura de datos que almacena informacion en pares de clave-valor. 
    
    - Almancena informacion en pares (clave unica)
    - No hay orden especifico 
    - Busqueda rapida: si conozco la llave, conozco el dato que puedo tomar
    
    
    
    
    - ArrayList
    - HashSet
    - HashMap


*/