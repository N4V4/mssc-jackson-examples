package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
	
	BeerDto getBeer(){
		
		return BeerDto.builder()
				.beerName("Icnussa")
				.beerStyle("Nera")
				.createdDate(OffsetDateTime.now())
				.lastUpdatedDate(OffsetDateTime.now())
				.id(UUID.randomUUID())
				.upc(1273L)
				.price(new BigDecimal("24"))
				.build();
		
	}

}
