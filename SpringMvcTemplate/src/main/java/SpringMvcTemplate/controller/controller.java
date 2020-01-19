package SpringMvcTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import SpringMvcTemplate.Client.ApiClient;
import SpringMvcTemplate.Client.PokeApiClientImpl;

@RestController
public class controller {
	
	@Autowired
	private ApiClient apiClient;
	
	
	@GetMapping("/getPokemon/name")
	public String getPokemonName() {
		return apiClient.getInformation("pokemon-name");
		
	}
	
	@GetMapping("/getBerry/spice")
	public String getBerrySpice() {
		return apiClient.getInformation("berry");
		
	}
	
	@GetMapping("/getPokemon")
	public String getPokemon() {
		return apiClient.getInformation("pokemon");
		
	}
	@GetMapping("/v1")
	public RedirectView getPage() {
		return new RedirectView("/");
		
	}
	
	
	@PostMapping("/post")
	public void postData() {
		System.out.println("We got a post Request Adding stuff to showjaflkdjkrjkfdslknfsakjlfesjksjfajsfdkl");
	}
}
