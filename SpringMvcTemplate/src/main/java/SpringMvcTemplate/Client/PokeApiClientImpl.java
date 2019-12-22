package SpringMvcTemplate.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@CrossOrigin
public class PokeApiClientImpl implements ApiClient {

	@Autowired
	private RestTemplate restTemplate;
	
	
	public PokeApiClientImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}


	@Override
	public String getInformation() {
		Random random = new Random();
		int number= random.nextInt(801);
		String url = "https://www.pokeapi.co/api/v2/pokemon/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<?> entity = new HttpEntity<>(headers);

		
		ResponseEntity<Object> info = restTemplate.exchange(url+number,HttpMethod.GET,entity,Object.class);
		System.out.print(info.getBody().toString());
		ObjectMapper om = new ObjectMapper();
		
		HashMap<String, String> stuff = new HashMap<String, String>();
		
		List<String>  stuff2 = new ArrayList<String>();
		
		return null;
	}
	

}
