package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; //esta cablea
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoServices;

@RestController //notacion que le indica que es un controller paraa soportar metodos http
@RequestMapping(path = "/miOtzo/productos") //notación para mapear la ruta de donde se ejecutan los metodos http, indica la ruta o URL de nuestro endpoint para saber donde se manejan esas solicitudes HTTP

public class ProductoController {
	
	//Inyaccion de dependencia
	//Instancia de la clase "ProductoService", o sea generar la dependencia entre controller y services.
	//Declara la instancia de la clase ProductoServices que se utiliza para acceder a los metodos definidos ahí. Se declara como final porque su valor no será cambiado despued de inicializar, para que esta instancia no cambie durante la ejecución del programa.
	
	private final ProductoServices productoServicio; // "no nos llames, nosotros te llamamos"
	
	
	@Autowired // Indica a Spring que inyete automaticamente una instancia del productoService en la clase ProductoController. Así nos aseguramos que la instancia está disponible y lista para usarse cuando se necesite en la clase.
	
	
	//Segunda pparte de inyección de dependencia
	//Constructor con ese objeto parametro
	public ProductoController (ProductoServices productoServicio) {
		this.productoServicio = productoServicio;
	}
	
	
	//HTTP GET para todos los productos
	@GetMapping
	public List <Producto>getProducto() {
		return productoServicio.leerProductos();
	}
	
//	@PostMapping
//	//HTTP POST
//	public postProducto() {
//		return productoServicio.crearProducto();
//	}
//	
//	@PutMapping
//	//HTTP PUT
//	public putProducto() {
//		return productoServicio.actualizarProducto();
//	}
	
//	@DeleteMapping
//	//HTTP DELETE
//	public deleteProducto() {
//		return productoServicio.borrarProducto();
//	}

}
