package com.planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class B_plannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(B_plannerApplication.class, args);
	}

}
