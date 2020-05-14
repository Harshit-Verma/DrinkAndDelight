package com.cg.placerawmaterial.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.placerawmaterial.model.PlaceRawMaterial;
import com.cg.placerawmaterial.service.PlaceRawMaterialService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api")
public class PlaceRawMaterialController {
	@Autowired
	private PlaceRawMaterialService service;
	
	@Autowired
	EntityManager em;
	
	
	@PostMapping("/place/{orderId}")
	public PlaceRawMaterial getPlaceRawMaterialDetails(@RequestBody PlaceRawMaterial placeRawMaterial){
		
		return service.getPlaceRawMaterialDetails(placeRawMaterial);
		
	}
}
