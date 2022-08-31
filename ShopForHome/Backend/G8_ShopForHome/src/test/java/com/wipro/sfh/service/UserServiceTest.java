package com.wipro.sfh.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.sfh.entity.User;
@SpringBootTest
class UserServiceTest {
	@Autowired
	UserService service;

	@Test
	void testRegisterUser() {
	User user=new User(101,"arun","arun@gmail.com","12345","123456789","User","UP");
	String registerUser = service.registerUser(user);
	}

	@Test
	void testGetAllUsers() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteuser() {
		fail("Not yet implemented");
	}

}
