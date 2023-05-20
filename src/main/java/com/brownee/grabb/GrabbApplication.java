package com.brownee.grabb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GrabbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrabbApplication.class, args);
	}

}
