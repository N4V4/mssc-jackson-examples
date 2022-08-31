package guru.springframework.msscjacksonexamples.model;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
public class BeerDtoTest extends BaseTest{
	
	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testSerializeDto() throws JsonProcessingException {
	
		BeerDto dto = getBeer();
		
		String json = objectMapper.writeValueAsString(dto);
		
		System.out.println("JSON " + json);
	}
	
	@Test
	void testDeserialize() throws IOException {
	
		String json = "{\"BeerID\":\"0910907c-0b28-48a3-8e9a-3373aa11fcc7\",\"beerName\":\"Icnussa\",\"beerStyle\":\"Nera\",\"upc\":1273,\"price\":24,\"createdDate\":\"2022-08-31T12:51:05.3933314+02:00\",\"lastUpdatedDate\":\"2022-08-31T12:51:05.3933314+02:00\"}";
		
		BeerDto dto = objectMapper.readValue(json, BeerDto.class);
		
		System.out.println("Beer dto " + dto);
	}
}
