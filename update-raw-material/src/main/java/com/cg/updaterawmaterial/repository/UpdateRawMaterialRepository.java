package com.cg.updaterawmaterial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.updaterawmaterial.model.UpdateRawMaterial;

@Repository
public interface UpdateRawMaterialRepository extends JpaRepository<UpdateRawMaterial , Integer> {

}
