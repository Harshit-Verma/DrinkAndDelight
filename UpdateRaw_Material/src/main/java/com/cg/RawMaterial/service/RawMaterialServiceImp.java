package com.cg.RawMaterial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.RawMaterial.dao.RawMaterialDao;
import com.cg.RawMaterial.dao.RawMaterialDaoImp;
import com.cg.RawMaterial.model.RawMaterial;
import com.cg.RawMaterial.repo.RawMaterialRepo;

@Transactional
@Service

public class RawMaterialServiceImp implements RawMaterialService  {

	@Autowired
	RawMaterialRepo rawMaterialRepo; 
	
	@Override
	public List<RawMaterial> getRawMaterials() {
		
		return rawMaterialRepo.findAll();
	}
	@Override
	public RawMaterial getRawMaterialById(int rawMaterial_id) {
		return RawMaterialRepo.findByRawMaterialId(rawMaterial_id);
		
	};
	@Override
	public RawMaterial updateRawMaterial(RawMaterial rawMaterial) {
		RawMaterial existingRawMaterial = RawMaterialRepo.findByRawMaterialId(rawMaterial.getRawMaterial_id());
		existingRawMaterial.setDelivery_status(rawMaterial.getDelivery_status());
		return rawMaterialRepo.save(existingRawMaterial);
		}
	
}