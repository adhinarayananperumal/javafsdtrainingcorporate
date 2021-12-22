package com.ba.bapayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BapaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BapaymentApplication.class, args);
	}

}
