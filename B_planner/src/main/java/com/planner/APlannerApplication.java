package com.planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class APlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(APlannerApplication.class, args);
	}

}
