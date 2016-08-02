package br.com.ingred.api;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import br.com.ingred.domain.Product;
import br.com.ingred.services.SearchService;

import com.google.common.collect.Lists;

@Path("/search")
public class SearchRS {

	private final SearchService searchService;
	private static final ObjectMapper mapper = new ObjectMapper();
	
	@Inject
	public SearchRS(final SearchService searchService) {
		this.searchService = searchService;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public Response search() 	{
		
		List<String> ingredientsMust = Lists.newArrayList("amido");
		List<String> ingredientsMustNot = Lists.newArrayList();
		List<String> categories = Lists.newArrayList();
		
		String response = StringUtils.EMPTY;
		try {
			List<Product> productList = searchService.getProductsBy(ingredientsMust, ingredientsMustNot, categories);
			response = mapper.writeValueAsString(productList);
		} catch (IOException e) {
			Response.status(400).build();
		}
		return Response.status(200).entity(response).build();
	}
	
	
}
