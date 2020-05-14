package com.cg.RawMaterial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "jvm")

public class RawMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rawMaterial_id;
	@NotNull
	private String name;
	@NotNull
	private String delivery_status;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id")
	
	
	
	public int getRawMaterial_id() {
		return rawMaterial_id;
	}
	public void setRawMaterial_id(int rawMaterial_id) {
		this.rawMaterial_id = rawMaterial_id;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="delivery_status")
	public String getDelivery_status() {
		return delivery_status;
	}
	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}
	@Override
	public String toString() {
		return "RawMaterial [rawMaterial_id=" + rawMaterial_id + ", name=" + name + ", delivery_status="
				+ delivery_status + "]";
	}
	
	
	
}