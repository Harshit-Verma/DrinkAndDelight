package com.cg.RawMaterial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.*;


import com.cg.RawMaterial.model.RawMaterial;
import com.cg.RawMaterial.service.RawMaterialService;
import com.cg.RawMaterial.service.RawMaterialServiceImp;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(path = "/api")
public class RawMaterialContoller {

	private RawMaterialService rawMaterialService = new RawMaterialServiceImp();

	@GetMapping("/getRawMaterials")
	public List<RawMaterial> getRawMaterials() {
		return rawMaterialService.getRawMaterials();
	}

	@PutMapping("/update")
	public RawMaterial updateCustomer(@RequestBody RawMaterial rawMaterial) {
		return rawMaterialService.updateRawMaterial(rawMaterial);
	}
}
