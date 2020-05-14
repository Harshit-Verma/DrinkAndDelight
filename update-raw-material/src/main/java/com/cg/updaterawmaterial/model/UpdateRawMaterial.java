package com.cg.updaterawmaterial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "updaterawmaterial_tbl")
public class UpdateRawMaterial {
	private int orderId;
	private String delivery_status;
	
	public UpdateRawMaterial() {
		
	}

	public UpdateRawMaterial(int orderId, String name, String delivery_status) {
		super();
		this.orderId = orderId;
		
		this.delivery_status = delivery_status;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	@Column(name = "delivery_status")
	public String getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}

	@Override
	public String toString() {
		return "UpdateRawMaterial [orderId=" + orderId + ", delivery_status=" + delivery_status
				+ "]";
	}
	
}
