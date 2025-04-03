package dev.archety.introdi.models;

public class Product {
	private int id;
	private String name;
	private String code;
	private float price;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String code, float price) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.price = price;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + "]";
	}	
}
