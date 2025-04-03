package dev.archety.crudsemplice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.archety.crudsemplice.models.Product;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	private List<Product> products = new ArrayList<Product>() {{
		add(new Product(1, "Pencil", "AB12345", 0.25f));
		add(new Product(2, "Rubber", "AB12346", 0.30f));
	}};
	
	@GetMapping()
	public List<Product> prodList(){
		return products;
	}
	
	@GetMapping("{varId}")
	public Product prodDetail(@PathVariable int varId) {
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getId() == varId) {
				return products.get(i);
			}
		}
		
		return null;
	}
	
	@PostMapping()
	public Product prodInsert(@RequestBody Product prod) {
		prod.setId( products.size() + 1 );
		products.add(prod);
		
		return prod;
	}

}
