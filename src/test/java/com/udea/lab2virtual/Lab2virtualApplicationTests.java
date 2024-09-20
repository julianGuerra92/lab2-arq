package com.udea.lab2virtual;

import com.fasterxml.jackson.databind.JsonNode;
import com.udea.lab2virtual.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lab2virtualApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void healthCheck() {
		String response = dataController.healthCheck();
		assertEquals("Health check OK", response);
	}

	@Test
	void version() {
		String response = dataController.version();
		assertEquals("The actual version is 0.0.1", response);
	}

	@Test
	void getRandomNation() {
		var response = dataController.getRandomNation();
		assertEquals(10, response.size());
	}

	@Test
	void getRandomCurrencies() {
		var response = dataController.getRandomCurrencies();
		assertEquals(20, response.size());
	}

//	@Test
//	public void testRandomCurrenciesCodeFormal(){
//		DataController controller = new DataController();
//		JsonNode response = controller.getRandomCurrencies();
//		for (int i=0; i< response.size(); i++){
//			JsonNode currency = response.get(i);
//			String code = currency.get("code").asText();
//			assertTrue(code.matches("[A-Z]{3}"));
//		}
//	}

	@Test
	void testRandomNationsPerformance() {
		long start = System.currentTimeMillis();
		dataController.getRandomNation();
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
		assertTrue(end - start < 2000);
	}

	@Test
	void aviationLength() {
		var response = dataController.getRandomAviation();
		assertEquals(10, response.size());
	}

}
