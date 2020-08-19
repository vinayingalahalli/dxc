package com.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Msa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Msa1Application.class, args);
	}

}
