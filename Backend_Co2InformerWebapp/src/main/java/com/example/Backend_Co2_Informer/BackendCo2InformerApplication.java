package com.example.Backend_Co2_Informer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"controller", "service", "repository", "model"})
@EntityScan(basePackages = "model")
@EnableJpaRepositories(basePackages = "repository")
public class BackendCo2InformerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCo2InformerApplication.class, args);
	}

}
