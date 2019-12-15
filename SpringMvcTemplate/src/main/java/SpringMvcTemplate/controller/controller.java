package SpringMvcTemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	
	@GetMapping("/test")
	public void getData() {
		System.out.println("We got a get Request");
	}
	
	
	@PostMapping("/test2")
	public void postData() {
		System.out.println("We got a post Request");
	}
}
