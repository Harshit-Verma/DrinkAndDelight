package com.cg.updateproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.updateproduct.model.UpdateProduct;

@Repository
public interface UpdateProductRepository extends JpaRepository<UpdateProduct , Integer> {

}
