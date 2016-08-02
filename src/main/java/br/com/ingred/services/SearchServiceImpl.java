package br.com.ingred.services;

import java.util.List;

import javax.inject.Inject;

import br.com.ingred.domain.Product;
import br.com.ingred.engine.SearchAPI;

public class SearchServiceImpl implements SearchService {

	private final SearchAPI searchAPI;
	
	@Inject
	public SearchServiceImpl(final SearchAPI searchAPI) {
		this.searchAPI = searchAPI;
	}
	
	@Override
	public String test() {
		return "Injected Search Service";
	}

	@Override
	public List<Product> getProductsBy(List<String> ingredientsMust,
			List<String> ingredientsMustNot, List<String> categories) {
		
//		List<Ingredient> ingredientsMustList = ingredientsMust.stream().map(ingredient -> new Ingredient(ingredient)).collect(Collectors.toList());
//		List<Ingredient> ingredientsMustNotList = ingredientsMustNot.stream().map(ingredient -> new Ingredient(ingredient)).collect(Collectors.toList());
//		List<Category> categoriesList = categories.stream().map(category -> new Category(category)).collect(Collectors.toList());
		
		return searchAPI.getProductsBy(ingredientsMust, ingredientsMustNot, categories);
	}

}
