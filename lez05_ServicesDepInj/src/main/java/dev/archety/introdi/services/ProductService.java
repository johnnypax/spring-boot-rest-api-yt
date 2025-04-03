package dev.archety.introdi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.archety.introdi.models.Product;

@Service
public class ProductService {

	private List<Product> products = new ArrayList<Product>() {{
		add(new Product(1, "Pencil", "AB12345", 0.25f));
		add(new Product(2, "Rubber", "AB12346", 0.30f));
	}};
	
	//Restituisce tutti i prodotti (getAll)
	public List<Product> getAllProducts(){
		return products;
	}
	
	//Restituire un singolo prodotto (get...ById)
	public Product getProductById(int id) {
		return products
				.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
	}
	
	//Inserisci il prodotto (add...)
	public Product addProduct(Product pro) {
		pro.setId( products.size() + 1 );
		products.add(pro);
		return pro;
	}
	
}
