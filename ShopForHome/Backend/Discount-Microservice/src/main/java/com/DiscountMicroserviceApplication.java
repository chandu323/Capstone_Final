package com;
/*
 * @Author: Ritesh Chandra Shukla
 * 
 * Last Modified Date: 29-08-2022
 * 
 * Description:  Discount Microservice Main Class
 * 
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscountMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountMicroserviceApplication.class, args);
	}

}
