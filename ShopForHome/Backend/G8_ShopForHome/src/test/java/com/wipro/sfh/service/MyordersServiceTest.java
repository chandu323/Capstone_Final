package com.wipro.sfh.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.sfh.entity.Odetails;
@SpringBootTest
class MyordersServiceTest {
	@Autowired
	OrderService service;

	@Test
	void testStoremyOrderDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllmyOrdersDetails() {
		List<Odetails> getAllOrdersDetails = service.getAllOrdersDetails();
		Assertions.assertThat(getAllOrdersDetails.size()).isGreaterThan(0);
	}

}
