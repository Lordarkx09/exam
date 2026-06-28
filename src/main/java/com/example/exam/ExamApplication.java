package com.example.exam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class ExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	//Create the petStoreRestClient Bean and expose the baseUrl value
	@Bean
	public RestClient petStoreRestClient(@Value("${petstore.base-url}") String baseUrl) {
		return RestClient.builder()
				.baseUrl(baseUrl)
				.build();
	}

}
