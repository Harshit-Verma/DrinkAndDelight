package com.cg.placerawmaterial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.placerawmaterial.model.PlaceRawMaterial;

@Repository
public interface PlaceRawMaterialRepository extends JpaRepository<PlaceRawMaterial , Integer>{

}
