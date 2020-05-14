package com.cg.updaterawmaterial.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.updaterawmaterial.model.UpdateRawMaterial;
import com.cg.updaterawmaterial.service.UpdateRawMaterialService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping(path = "/api")
public class UpdateRawMaterialController {
	

	@Autowired
	private UpdateRawMaterialService service;
	
	@Autowired
	EntityManager em;
	
	@PutMapping("/update/{orderId}")
	public String updateRawMaterial(@RequestBody UpdateRawMaterial updateRawMaterial,
			@PathVariable int orderId) {
		UpdateRawMaterial order = em.find(UpdateRawMaterial.class, orderId);
		if (order == null) {
			return "Please enter the correct Order Id";
		} else {
			return service.updateRawMaterialDetails(updateRawMaterial);
		}

	}
		
	
	
	
}
