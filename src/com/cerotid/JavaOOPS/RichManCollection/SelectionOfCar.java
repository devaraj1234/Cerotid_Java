package com.cerotid.JavaOOPS.RichManCollection;

import com.cerotid.JavaOOPS.UserInputExceptions.InvalidUserInputException;
import com.cerotid.JavaOOPS.cars.Camaro;
import com.cerotid.JavaOOPS.cars.Cars;
import com.cerotid.JavaOOPS.cars.Challenger;
import com.cerotid.JavaOOPS.cars.Mustang;
import com.cerotid.JavaOOPS.cars.Sedan;
import com.cerotid.JavaOOPS.cars.Spark;
import com.cerotid.JavaOOPS.cars.Volester;

public class SelectionOfCar {

	public Cars selcetCarType(String car) throws InvalidUserInputException {
		
		Cars newCar = null;
		if (car.equalsIgnoreCase("Camaro")) {
			newCar = new Camaro();
		} else if (car.equalsIgnoreCase("Challenger")) {
			newCar = new Challenger();
		} else if (car.equalsIgnoreCase("Mustang")) {
			newCar = new Mustang();
		} else if (car.equalsIgnoreCase("Sedan")) {
			newCar = new Sedan();
		} else if (car.equalsIgnoreCase("Volester")) {
			newCar = new Volester();
		} else if (car.equalsIgnoreCase("Spark")) {
			newCar = new Spark();
		} else {
			throw new InvalidUserInputException("Sorry we don't have car model you entered");
		}
		
		return newCar;
	}
}
