package com.webdev.SpringMvcTemplate.Client;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import SpringMvcTemplate.Client.PokeApiClientImpl;
import SpringMvcTemplate.domain.Berry;

public class PokeApiClientImplTest {
	private RestTemplate rest = new RestTemplate();
	private PokeApiClientImpl subject = new PokeApiClientImpl(rest);

	@Test
	public void whenBerryHasSpicyFlavor_thenShouldReturnBerryName() {
		ObjectMapper mapper = new ObjectMapper();
		Berry test = null;
		try {
			test = mapper.readValue(spicyBerryStub, Berry.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assertions.assertEquals(true, subject.isItSpicy(test));
		
	}
	
	private static final String notSpicyBerryStub = "{\r\n    \"flavors\": [{\r\n            "
			+ "\"flavor\": {\r\n                \"name\": \"spicy\","
			+ "\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/1/\"\r\n            },"
			+ "\r\n            \"potency\": 0\r\n        }, {\r\n            \"flavor\": {\r\n                "
			+ "\"name\": \"dry\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/2/\"\r\n"
			+ "            },\r\n            \"potency\": 15\r\n        }, {\r\n            \"flavor\": {\r\n"
			+ "                \"name\": \"sweet\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/3/\"\r\n"
			+ "            },\r\n            \"potency\": 0\r\n        }, {\r\n            \"flavor\": {\r\n                "
			+ "\"name\": \"bitter\",\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/4/\"\r\n            },"
			+ "\r\n            \"potency\": 0\r\n        }, {\r\n            \"flavor\": {\r\n                \"name\": \"sour\","
			+ "\r\n                \"url\": \"https://pokeapi.co/api/v2/berry-flavor/5/\"\r\n            },\r\n            "
			+ "\"potency\": 0\r\n        }\r\n    ],\r\n    \"natural_gift_type\": {\r\n        \"name\": \"rock\",\r\n        "
			+ "\"url\": \"https://pokeapi.co/api/v2/type/6/\"\r\n    },\r\n    \"item\": {\r\n        \"name\": \"wiki-berry\","
			+ "\r\n        \"url\": \"https://pokeapi.co/api/v2/item/137/\"\r\n    },\r\n    \"smoothness\": 25,\r\n    "
			+ "\"size\": 115,\r\n    \"natural_gift_power\": 60,\r\n    \"firmness\": {\r\n        \"name\": \"hard\",\r\n        "
			+ "\"url\": \"https://pokeapi.co/api/v2/berry-firmness/3/\"\r\n    },\r\n    \"name\": \"wiki\",\r\n   "
			+ " \"growth_time\": 5,\r\n    \"soil_dryness\": 10,\r\n    \"id\": 12,\r\n    \"max_harvest\": 5\r\n}\r\n";
	
	private static final String spicyBerryStub ="{\"firmness\":{\"name\":\"very-hard\",\"url\":\"https://pokeapi.co/api/v2/berry-firmness/4/\"},\"flavors\":[{\"flavor\":{\"name\":\"spicy\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/1/\"},\"potency\":10},{\"flavor\":{\"name\":\"dry\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/2/\"},\"potency\":0},{\"flavor\":{\"name\":\"sweet\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/3/\"},\"potency\":10},{\"flavor\":{\"name\":\"bitter\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/4/\"},\"potency\":10},{\"flavor\":{\"name\":\"sour\",\"url\":\"https://pokeapi.co/api/v2/berry-flavor/5/\"},\"potency\":10}],\"growth_time\":4,\"id\":6,\"item\":{\"name\":\"leppa-berry\",\"url\":\"https://pokeapi.co/api/v2/item/131/\"},\"max_harvest\":5,\"name\":\"leppa\",\"natural_gift_power\":60,\"natural_gift_type\":{\"name\":\"fighting\",\"url\":\"https://pokeapi.co/api/v2/type/2/\"},\"size\":28,\"smoothness\":20,\"soil_dryness\":15}\r\n";
			
}
