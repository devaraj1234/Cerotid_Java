package com.cerotid.JavaOOPS.walmartService;

import com.cerotid.JavaOOPS.cars.Cars;

public class WalmartOilChangeService {
	
	private int noOfCars;
	private Cars carType;
	
	public WalmartOilChangeService(Cars carType, int noOfCars) {
		this.noOfCars = noOfCars;
		this.carType = carType;
	}
	public int getNoOfCars() {
		return noOfCars;
	}
	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}
	public Cars getCarType() {
		return carType;
	}
	public void setCarType(Cars carType) {
		this.carType = carType;
	}

}