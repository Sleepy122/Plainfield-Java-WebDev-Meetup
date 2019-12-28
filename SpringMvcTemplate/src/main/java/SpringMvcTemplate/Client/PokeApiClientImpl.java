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
//		Random random = new Random();
//		int number= random.nextInt(100);
//		String url = "https://www.pokeapi.co/api/v2/berry/";
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Accept", "application/json");
//        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//		HttpEntity<?> entity = new HttpEntity<>(headers);
//
//		
//		ResponseEntity<String> info = restTemplate.exchange(url+"12",HttpMethod.GET,entity,String.class);
		String info = "{\r\n    \"flavors\": [{\r\n            \"flavor\": {\r\n                \"name\": \"spicy\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/1/\"\r\n            },\r\n            \"potency\": 0\r\n        }, {\r\n            \"flavor\": {\r\n                \"name\": \"dry\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/2/\"\r\n            },\r\n            \"potency\": 15\r\n        }, {\r\n            \"flavor\": {\r\n                \"name\": \"sweet\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/3/\"\r\n            },\r\n            \"potency\": 0\r\n        }, {\r\n            \"flavor\": {\r\n                \"name\": \"bitter\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/4/\"\r\n            },\r\n            \"potency\": 0\r\n        }, {\r\n            \"flavor\": {\r\n                \"name\": \"sour\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/5/\"\r\n            },\r\n            \"potency\": 0\r\n        }\r\n    ],\r\n    \"natural_gift_type\": {\r\n        \"name\": \"rock\",\r\n        \"url\": \"https://pokeapi.co/api/v2/type/6/\"\r\n    },\r\n    \"item\": {\r\n        \"name\": \"wiki-berry\",\r\n        \"url\": \"https://pokeapi.co/api/v2/item/137/\"\r\n    },\r\n    \"smoothness\": 25,\r\n    \"size\": 115,\r\n    \"natural_gift_power\": 60,\r\n    \"firmness\": {\r\n        \"name\": \"hard\",\r\n        \"url\": \"https://pokeapi.co/api/v2/berry-firmness/3/\"\r\n    },\r\n    \"name\": \"wiki\",\r\n    \"growth_time\": 5,\r\n    \"soil_dryness\": 10,\r\n    \"id\": 12,\r\n    \"max_harvest\": 5\r\n}";
		JSONObject json = new JSONObject(info);
		Type typeTester = new Type("some name", "someurl");
		Berry tester = new Berry();
		tester.setNatural_gift_type(typeTester);
		Berry item = null;
		ObjectMapper om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			String test2= om.writeValueAsString(tester);
			 item = om.readValue(json.toString(), Berry.class);
			System.out.println(item.toString());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		JSONObject json = new JSONObject();
//		JsonNode jsonInfo = convertJsonFormat();
//		JsonParser.info.getBody()
		System.out.print(info);
		
		
		return item;
	}
	

}
