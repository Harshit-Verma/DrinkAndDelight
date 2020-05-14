package com.cg.RawMaterial.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.RawMaterial.model.RawMaterial;

@Repository

public interface RawMaterialRepo extends JpaRepository<RawMaterial,Integer > {
@Query
	static RawMaterial findByRawMaterialId(int rawMaterial_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
