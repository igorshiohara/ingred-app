package br.com.ingred.entity;

import java.io.Serializable;

/**
 * Class that represents a Ingredient
 * @author igor
 *
 */
public class Ingredient implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Ingredient(String name) {
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
		return "Ingredient [name=" + name + "]";
	}

}
