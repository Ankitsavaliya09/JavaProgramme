package com.kn.entities;

public class Mobile {

	String brand;
	String ram;
	double cost;
	public Mobile() {
	}
	public Mobile(String brand, String ram, double cost) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
	}
	
	
}
