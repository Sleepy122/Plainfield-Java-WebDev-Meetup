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
import SpringMvcTemplate.domain.Move;
import SpringMvcTemplate.domain.MoveDescription;
import SpringMvcTemplate.domain.NabeelObject;
import SpringMvcTemplate.domain.Pokemon;
import SpringMvcTemplate.domain.TypeDescription;

@Service
@CrossOrigin
public class PokeApiClientImpl implements ApiClient {
	private final String berryUrl ="https://www.pokeapi.co/api/v2/berry/";
	private final String pokemonUrl = "https://www.pokeapi.co/api/v2/pokemon/";
	@Autowired
	private RestTemplate restTemplate;
	
	
	public PokeApiClientImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	public String getInformation(String type) {
		switch(type) {
		case "spicy": return getSpicyBerry();
		case "pokemon": return getPokemon(false);
		case "pokemon-name":return getPokemon(true);
			default: return getSpicyBerry();
		}
	}

	public String getSpicyBerry() {
		Berry item = null;
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		
		ResponseEntity<String> info = restTemplate.exchange(berryUrl+getRandomNumber(60),HttpMethod.GET,generateHeader(),String.class);
		
		JSONObject json = new JSONObject(info.getBody().toString());
		
		try {
			 item = mapper.readValue(json.toString(), Berry.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(isItSpicy(item)) {
			return item.getName();
		}else {
			return "not spicy";
		}
	}
	
	public int getRandomNumber(int range) {
		Random random = new Random();
		return random.nextInt(range);
	}
	
	public HttpEntity<?> generateHeader(){
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		return new HttpEntity<>(headers);
	}
	
	public boolean isItSpicy(Berry tester) {

		return tester.getFlavors().stream()
				.anyMatch(n -> n.getFlavor().getName().equals("spicy") && n.getPotency().intValue()>0);
	}
	
	public String getPokemon(boolean allData) {
		Pokemon item = null;
		ObjectMapper mapper = new ObjectMapper();
		JSONObject json = null;
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		
		ResponseEntity<String> info = restTemplate.exchange(pokemonUrl+getRandomNumber(60),HttpMethod.GET,generateHeader(),String.class);
		
		//JSONObject json = new JSONObject(info.getBody().toString());
		//System.out.println(json);
		
		try {
			 item = mapper.readValue(info.getBody().toString(), Pokemon.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(allData) {
		//	item.getMoves().stream().map(f -> f.getMove().getName())
			
			NabeelObject transferObject = new NabeelObject(item.getName(),item.getHeight(),item.getWeight(),item.getTypes().get(0).getType().getName());
			for(int i =0; i<5;i++) {
				if(i < item.getMoves().size()) {
					transferObject.addMove(item.getMoves().get(i).getMove().getName());
				}
			}
			
			json = new JSONObject(transferObject);
			
			
			return json.toString();
		}
		return item.getName();
		
	}

}
