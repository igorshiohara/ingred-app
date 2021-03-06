package br.com.ingred.entity;

import java.io.Serializable;

/**
 * Class that represents a Category for each product
 * @author igor
 *
 */
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}

}
