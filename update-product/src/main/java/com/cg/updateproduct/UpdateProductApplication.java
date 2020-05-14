package com.cg.updateproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.cg.updateproduct.repository")
public class UpdateProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateProductApplication.class, args);
	}

}
