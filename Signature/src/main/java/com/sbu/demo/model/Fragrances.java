package com.sbu.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fragrances {
	
	@Id
	private int id;
	private String name;
	private float price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fragrances [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}
