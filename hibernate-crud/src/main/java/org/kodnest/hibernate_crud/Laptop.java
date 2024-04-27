package org.kodnest.hibernate_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	int laptopId;
	String brandName;
	double cost;
	public Laptop() {
		super();
	}
	public Laptop(int laptopId, String brandName, double cost) {
		super();
		this.laptopId = laptopId;
		this.brandName = brandName;
		this.cost = cost;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brandName=" + brandName + ", cost=" + cost + "]";
	}
	
	
}
