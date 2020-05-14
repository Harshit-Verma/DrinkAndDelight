package com.cg.updaterawmaterial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.updaterawmaterial.model.UpdateRawMaterial;
import com.cg.updaterawmaterial.repository.UpdateRawMaterialRepository;

@Service
public class UpdateRawMaterialServiceImpl implements UpdateRawMaterialService {
	@Autowired
	private UpdateRawMaterialRepository repo;
	
	@Override
	public String updateRawMaterialDetails(UpdateRawMaterial updateRawMaterial) {
		 repo.save(updateRawMaterial);
		 return "Data updated successfully";
	}
}
