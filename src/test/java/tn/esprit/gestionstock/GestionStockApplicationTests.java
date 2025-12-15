package tn.esprit.gestionstock;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class GestionStockApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	void simpleTest() {
		int a = 2 + 3;
		assertEquals(5, a);
	}
}
