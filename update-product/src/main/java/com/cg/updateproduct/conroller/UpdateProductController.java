package com.cg.updateproduct.conroller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.updateproduct.model.UpdateProduct;
import com.cg.updateproduct.service.UpdateProductService;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api")
public class UpdateProductController {

	@Autowired
	private UpdateProductService service;
	
	@Autowired
	EntityManager em;
	
	@PutMapping("/update/{orderId}")
	public String updateProduct(@RequestBody UpdateProduct updateProduct,
			@PathVariable int orderId) {
		UpdateProduct order = em.find(UpdateProduct.class, orderId);
		if (order == null) {
			return "null";
		} else {
			return service.updateProductDetails(updateProduct);
		}

	}

	}



