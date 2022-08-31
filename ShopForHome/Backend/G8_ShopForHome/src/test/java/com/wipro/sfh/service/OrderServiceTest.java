package com.wipro.sfh.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.sfh.entity.Product;
@SpringBootTest
class OrderServiceTest {
	@Autowired
	ProductService service;

	@Test
	void testStoreOrderDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllOrdersDetails() {
		List<Product>getAllProduct=service.getAllProduct();
		Assertions.assertThat(getAllProduct.size()).isGreaterThan(0);
	}

	@Test
	void testDeletecartProduct() {
		fail("Not yet implemented");
	}

}
