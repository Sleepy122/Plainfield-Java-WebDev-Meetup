package SpringMvcTemplate.Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import SpringMvcTemplate.domain.Berry;
import SpringMvcTemplate.domain.BerryFlavorMap;
import SpringMvcTemplate.domain.Type;

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
	public Berry getInformation() {
		Random random = new Random();
		int number= random.nextInt(100);
		String url = "https://www.pokeapi.co/api/v2/berry/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<?> entity = new HttpEntity<>(headers);
		ResponseEntity<String> info = restTemplate.exchange(url+"12",HttpMethod.GET,entity,String.class);
		JSONObject json = new JSONObject(info.getBody().toString());
		Berry item = null;
		ObjectMapper om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			 item = om.readValue(json.toString(), Berry.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(info.getBody().toString());
		boolean needsName = item.getFlavors().stream()
				.anyMatch(n -> n.getFlavor().getName().equals("spicy"));
		return item;
	}
	

}
