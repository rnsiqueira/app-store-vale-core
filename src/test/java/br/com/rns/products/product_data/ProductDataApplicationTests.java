package br.com.rns.products.product_data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

class ProductDataApplicationTests {

	@Test
	void contextLoads() {

		Calendar instance = Calendar.getInstance();
		instance.set(2024, 10, 16);
		System.out.println(instance.getTime());
	}

}
