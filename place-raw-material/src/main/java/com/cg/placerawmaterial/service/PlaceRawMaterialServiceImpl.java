package com.cg.placerawmaterial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.placerawmaterial.model.*;
import com.cg.placerawmaterial.repository.*;

@Service
public class PlaceRawMaterialServiceImpl implements PlaceRawMaterialService {
	
	@Autowired
	private PlaceRawMaterialRepository repo;
   
	@Override
	public  PlaceRawMaterial getPlaceRawMaterialDetails(PlaceRawMaterial placeRawMaterial) {
		
		 
		 return repo.save(placeRawMaterial);
		
	}

}
