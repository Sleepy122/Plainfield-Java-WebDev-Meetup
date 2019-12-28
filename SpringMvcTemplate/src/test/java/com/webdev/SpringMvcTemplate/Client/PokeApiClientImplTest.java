package com.webdev.SpringMvcTemplate.Client;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import SpringMvcTemplate.Client.PokeApiClientImpl;

public class PokeApiClientImplTest {
	
	private PokeApiClientImpl subject = mock(PokeApiClientImpl.class);

	@Test
	public void whenBerryHasSpicyFlavor_thenShouldReturnBerryName() {
		subject.getSpicyBerry();
	}
	
	public String spicyBerryStub = "{\r\n    \"flavors\": [{\r\n            "
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
}
