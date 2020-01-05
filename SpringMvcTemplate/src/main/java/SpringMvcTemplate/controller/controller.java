package SpringMvcTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringMvcTemplate.Client.ApiClient;
import SpringMvcTemplate.Client.PokeApiClientImpl;

@RestController
public class controller {
	
	@Autowired
	private ApiClient apiClient;
	
	
	@GetMapping("/getBerry")
	public String getData() {
		//System.out.println("We got a get Request");
		return apiClient.getInformation("spicy");
		
	}
	
	
	@PostMapping("/post")
	public void postData() {
		System.out.println("We got a post Request Adding stuff to showjaflkdjkrjkfdslknfsakjlfesjksjfajsfdkl");
	}
}
