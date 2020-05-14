package com.cg.placerawmaterial.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.hibernate.AnnotationException;



@Entity
@Table(name="placerawmaterials_tbl")
public class PlaceRawMaterial {
	
	private int orderId;
	private String name;
	private String SupplierId;
	private int QuantityUnit;
	private Date DateOfOrder;
	private Date DateOfDelivery;
	private int PricePerUnit;
	private int TotalPrice;
	private String DeliveryStatus;
	private int WarehouseId;
	public PlaceRawMaterial() {
		
	}
	public PlaceRawMaterial(int orderId, String name, String supplierId, int quantityUnit, Date dateOfOrder,
			Date dateOfDelivery, int pricePerUnit, int totalPrice, String deliveryStatus, int warehouseId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.SupplierId = supplierId;
		this.QuantityUnit = quantityUnit;
		this.DateOfOrder = dateOfOrder;
		this.DateOfDelivery = dateOfDelivery;
		this.PricePerUnit = pricePerUnit;
		this.TotalPrice = totalPrice;
		this.DeliveryStatus = deliveryStatus;
		this.WarehouseId = warehouseId;
	}
	@Id
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Column(name = "name", length = 15)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "supplierId", length = 15)
	public String getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(String supplierId) {
		SupplierId = supplierId;
	}
	@Column(name = "quantityUnit", length = 15)
	public int getQuantityUnit() {
		return QuantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		QuantityUnit = quantityUnit;
	}
	@Column(name = "dateOfOrder", length = 15)
	public Date getDateOfOrder() {
		return DateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		DateOfOrder = dateOfOrder;
	}
	@Column(name = "dateOfDelivery", length = 15)
	public Date getDateOfDelivery() {
		return DateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		DateOfDelivery = dateOfDelivery;
	}
	@Column(name = "pricePerUnit", length = 15)
	public int getPricePerUnit() {
		return PricePerUnit;
	}
	public void setPricePerUnit(int pricePerUnit) {
		PricePerUnit = pricePerUnit;
	}
	@Column(name = "totalPrice", length = 15)
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	@Column(name = "deliveryStatus", length = 15)
	public String getDeliveryStatus() {
		return DeliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		DeliveryStatus = deliveryStatus;
	}
	@Column(name = "warehouseId", length = 15)
	public int getWarehouseId() {
		return WarehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		WarehouseId = warehouseId;
	}
	@Override
	public String toString() {
		return "PlaceRawMaterial [orderId=" + orderId + ", name=" + name + ", SupplierId=" + SupplierId
				+ ", QuantityUnit=" + QuantityUnit + ", DateOfOrder=" + DateOfOrder + ", DateOfDelivery="
				+ DateOfDelivery + ", PricePerUnit=" + PricePerUnit + ", TotalPrice=" + TotalPrice + ", DeliveryStatus="
				+ DeliveryStatus + ", WarehouseId=" + WarehouseId + "]";
	}
	
	
	
}
