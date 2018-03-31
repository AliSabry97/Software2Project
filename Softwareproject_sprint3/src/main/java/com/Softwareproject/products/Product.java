package com.Softwareproject.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String price;
	private String category;
	private String brandname;
	private Integer amounts;
	public Product()
	{
	
		
	}
	public Product(Integer id, String name, String price, String category, Integer amounts, String brandname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.brandname = brandname;
		this.amounts=amounts;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Integer getAmounts() {
		return amounts;
	}
	public void setAmounts(Integer amounts) {
		this.amounts = amounts;
	}
	
	
}
