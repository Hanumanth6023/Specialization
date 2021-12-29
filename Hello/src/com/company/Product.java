
package com.company;

   public class Product 
    { 
	   
	int id;
	String product_name; 
	int qty;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", qty=" + qty + ", price=" + price + "]";
	}
	public Product(int id, String product_name, int qty, int price) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.qty = qty;
		this.price = price;
	}
	
	
    }
   
	