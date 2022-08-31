package com;
/*
 * @Author: Ritik Patidar
 * 
 * Last Modified Date: 29-08-2022
 * 
 * Description:  Sales Microservice Main Class
 * 
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SalesReportMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesReportMicroserviceApplication.class, args);
	}

}
