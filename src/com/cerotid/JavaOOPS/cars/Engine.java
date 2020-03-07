package com.cerotid.JavaOOPS.cars;

public class Engine {
	
	private String model;
	private String type;
	private String supplier;
	private String oilType;
	
	public String getModel() {
		return model;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOilType() {
		return oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}
	public static Engine parseEngine(String string) {
		return null;
	}
	
	

}
