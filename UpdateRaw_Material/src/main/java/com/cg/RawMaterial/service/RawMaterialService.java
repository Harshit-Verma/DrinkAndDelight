package com.cg.RawMaterial.service;

import java.util.List;

import com.cg.RawMaterial.model.RawMaterial;



public interface RawMaterialService {


	//public abstract String addRawMaterials(RawMaterial rawMaterial);
	
	//public abstract List<RawMaterial> getRawMaterials();
	
	//get
		public List<RawMaterial> getRawMaterials();
		//get
		public RawMaterial getRawMaterialById(int rawMaterial_id);
		
		//update
		public RawMaterial updateRawMaterial(RawMaterial delivery_status);
	
}
