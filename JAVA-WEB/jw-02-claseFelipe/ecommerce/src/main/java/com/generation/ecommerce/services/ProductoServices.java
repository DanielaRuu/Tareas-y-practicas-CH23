package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoServices {
	//Declarar la instancia de la clase ProductoRepository
	//Creo el objeto de la clase productoRepository
	private final ProductoRepository productoRepository;
	
	//Cablear con el autowired
	@Autowired
	
	//Uso ese objeto como parametro de mi constructor
	public ProductoServices(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	
	//Create (metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos)
	//public void crearProducto() {
	//}
	
	
	//Read - leer una lista de productos
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}//toda la lista de productos
	
	
	//Read - leer un producto con un id especifico
	public Producto leerProducto(Long prodId) {
		return productoRepository.findById(prodId).orElseThrow(()-> new IllegalStateException("El producto" + "con el id" + prodId + "no existe. "));
	}//un solo producto
	
	//Update
	//public void actualizarProducto() {
	//}
	
	//Delete
	//public void borrarProducto() {
	//}

}
