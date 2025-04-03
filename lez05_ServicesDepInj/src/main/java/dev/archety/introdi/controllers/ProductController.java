package dev.archety.introdi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.archety.introdi.models.Product;
import dev.archety.introdi.services.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	@Autowired
	private ProductService service;

	@GetMapping()
	public List<Product> prodList(){
		return service.getAllProducts();
	}
	
	@GetMapping("{varId}")
	public Product prodDetail(@PathVariable int varId) {
		return service.getProductById(varId);
	}
	
	@PostMapping()
	public Product prodInsert(@RequestBody Product pro) {
		return service.addProduct(pro);
	}
	
	//Primo esempio di Dependency Injection
//	private final ProductService service;
//	
//	public ProductController(ProductService prodService) {
//		this.service = prodService;
//	}
	
}
