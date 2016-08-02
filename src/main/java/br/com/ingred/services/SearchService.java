package br.com.ingred.services;

import java.util.List;

import br.com.ingred.domain.Product;

public interface SearchService {

	List<Product> getProductsBy(List<String> ingredientsMust, List<String> ingredientsMustNot, List<String> categories); 
	
	String test();
	
}
