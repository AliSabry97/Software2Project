package com.Softwareproject.Stores;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Store {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String address;
	private String type_of_store;
	private String type;
	private String storeowner ;
	public Store()
	{
		
		
	}
	public Store(Integer id, String name, String address, String type_of_store, String type, String storeowner) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.type_of_store = type_of_store;
		this.type = type;
		this.storeowner = storeowner;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType_of_store() {
		return type_of_store;
	}
	public void setType_of_store(String type_of_store) {
		this.type_of_store = type_of_store;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStoreowner() {
		return storeowner;
	}
	public void setStoreowner(String storeowner) {
		this.storeowner = storeowner;
	}
	
	

}
