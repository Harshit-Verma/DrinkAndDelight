package com.cg.updaterawmaterial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.cg.updaterawmaterial.repository")
public class UpdateRawMaterialApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateRawMaterialApplication.class, args);
	}

}
