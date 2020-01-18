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
	
	
	@GetMapping("/getBerry")
	public String getData() {
		//System.out.println("We got a get Request");
		return apiClient.getInformation("pokemon");
		
	}
	
	@GetMapping("/v1")
	public RedirectView getPage() {
		return new RedirectView("/static/index.html");
		
	}
	
	
	@PostMapping("/post")
	public void postData() {
		System.out.println("We got a post Request Adding stuff to showjaflkdjkrjkfdslknfsakjlfesjksjfajsfdkl");
	}
}
