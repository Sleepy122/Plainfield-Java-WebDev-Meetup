package SpringMvcTemplate.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RestTemplateConfig {

	
	@Bean
	public static RestTemplate restTemplate() {
		RestTemplateBuilder builder = null;
		return builder.build();
	}
}
