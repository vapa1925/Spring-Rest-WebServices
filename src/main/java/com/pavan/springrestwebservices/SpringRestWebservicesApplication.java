package com.pavan.springrestwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringRestWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWebservicesApplication.class, args);
	}

}
