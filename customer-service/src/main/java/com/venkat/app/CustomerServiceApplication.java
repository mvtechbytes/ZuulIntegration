package com.venkat.app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.venkat.controllers.ConsumerControllerClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {
	public static void main(String[] args) throws RestClientException, IOException {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	@Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}
}
