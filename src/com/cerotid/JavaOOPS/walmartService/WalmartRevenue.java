package com.cerotid.JavaOOPS.walmartService;

import com.cerotid.JavaOOPS.cars.Coupes;
import com.cerotid.JavaOOPS.cars.Hatchbacks;
import com.cerotid.JavaOOPS.cars.Sedan;

public class WalmartRevenue {

	private float oilChangeRate;
	private float oilChangeRevenue;

	public float oilChangeRevenue(WalmartOilChangeService car) {
		
		if (car.getCarType() instanceof Coupes) {
			oilChangeRate = 49.99f;
		} else if (car.getCarType() instanceof Sedan) {
			oilChangeRate = 39.99f;
		} else if (car.getCarType() instanceof Hatchbacks) {
			oilChangeRate = 29.99f;
		}
		
		oilChangeRevenue += oilChangeRate * car.getNoOfCars();
		return oilChangeRevenue;
	}
	
	public float totalRevenue() {
		return oilChangeRevenue;
	}
}