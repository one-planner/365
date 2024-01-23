package com.planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class A_plannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(A_plannerApplication.class, args);
	}

}
