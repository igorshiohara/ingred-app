package br.com.ingred.config;

import br.com.ingred.services.SearchService;
import br.com.ingred.services.SearchServiceImpl;

import com.google.inject.AbstractModule;

public class IngredModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(SearchService.class).to(SearchServiceImpl.class);
		
	}

}
