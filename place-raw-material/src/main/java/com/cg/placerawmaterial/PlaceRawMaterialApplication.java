package com.cg.placerawmaterial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.cg.placerawmaterial.repository")

@EnableAutoConfiguration
public class PlaceRawMaterialApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaceRawMaterialApplication.class, args);
		
	}

}
