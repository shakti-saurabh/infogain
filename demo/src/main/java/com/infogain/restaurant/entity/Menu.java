package com.infogain.restaurant.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Menu {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long menuId;
	private String category;
	@OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name="menuId",referencedColumnName="menuId")
	private List<Product> product;
	
	public long getMenuId() {
		return menuId;
	}
	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
