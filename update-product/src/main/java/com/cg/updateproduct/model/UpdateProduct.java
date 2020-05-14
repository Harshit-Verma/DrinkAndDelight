package com.cg.updateproduct.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "updateproduct_tbl")
public class UpdateProduct {
	
	private int orderId;
	private String delivery_status;
	public UpdateProduct() {
		}
	public UpdateProduct(int orderId, String delivery_status) {
		super();
		this.orderId = orderId;
		
		this.delivery_status = delivery_status;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getorderId() {
		return orderId;
	}
	public void setorderId(int orderId) {
		this.orderId = orderId;
	}
	
	@Column(name = "delivery_status", length = 15)
	public String getDelivery_status() {
		return delivery_status;
	}
	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}
	@Override
	public String toString() {
		return "UpdateProduct [orderId=" + orderId + ", delivery_status=" + delivery_status + "]";
	}
	
	

}
