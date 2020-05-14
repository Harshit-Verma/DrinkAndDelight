package com.cg.updateproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.updateproduct.model.UpdateProduct;
import com.cg.updateproduct.repository.UpdateProductRepository;


@Service
public class UpdateProductServiceImpl implements UpdateProductService{
	
	@Autowired
	private UpdateProductRepository repo;
	
	
	@Override
	public String updateProductDetails(UpdateProduct updateProduct) {
		 repo.save(updateProduct);
		 return "Data updated successfully";
	}
}
