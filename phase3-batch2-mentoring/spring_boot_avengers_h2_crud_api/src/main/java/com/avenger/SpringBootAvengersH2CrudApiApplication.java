package com.avenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootAvengersH2CrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAvengersH2CrudApiApplication.class, args);
	}

	@Bean
	public Docket avengersAPI() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.avenger"))
				.build();
	}
//you can view swagger documentation on localhost:portnumber(of the app)/swagger-ui.html
}
