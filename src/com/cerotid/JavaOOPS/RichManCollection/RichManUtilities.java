package com.cerotid.JavaOOPS.RichManCollection;

import java.util.ArrayList;
import java.util.List;

import com.cerotid.JavaOOPS.UserInputExceptions.InvalidUserInputException;
import com.cerotid.JavaOOPS.cars.Cars;
import com.cerotid.JavaOOPS.walmartService.WalmartOilChangeService;

public class RichManUtilities {

	public List<Cars> richmanColletion = new ArrayList<>();

	public List<Cars> addCar(String car) {

		SelectionOfCar customerSelection = new SelectionOfCar();

		try {
			Cars selectedCar = customerSelection.selcetCarType(car);
			richmanColletion.add(selectedCar);
		} catch (InvalidUserInputException e) {
			// e.printStackTrace();
		}
		return richmanColletion;
	}

	public Cars modifyCarFeature(String vin, boolean androidFeature, boolean carPlayFeature)
			throws InvalidUserInputException {
		Cars modifiedCar = null;
		for (int i = 0; i < richmanColletion.size(); i++) {
			List<Cars> carToModify = new ArrayList<>();
			carToModify.add(richmanColletion.get(i));
			if (!carToModify.isEmpty()) {
				carToModify.set(0, richmanColletion.get(i));
			}

			for (Cars modifyingCar : carToModify) {
				if (modifyingCar.getVin() != null && modifyingCar.getVin().contains(vin)) {
					modifyingCar.setHasAndroidAuto(androidFeature);
					modifyingCar.setHasCarPlay(carPlayFeature);
					modifiedCar = modifyingCar;
				} else {
					throw new InvalidUserInputException("The vin you entered is not matched");
				}
			}
		}
		return modifiedCar;
	}

	public Cars repaintCar(String carName, String color) {
		Cars modifiedCar = null;
		for (int i = 0; i < richmanColletion.size(); i++) {
			List<Cars> carToModify = new ArrayList<>();
			carToModify.add(richmanColletion.get(i));
			if (!carToModify.isEmpty()) {
				carToModify.set(0, richmanColletion.get(i));
			}
			for (Cars carToRepaint : carToModify) {
				if (carToRepaint.getCarName().equalsIgnoreCase(carName)) {
					carToRepaint.setColor(color);
					modifiedCar = carToRepaint;
				}
			}
		}
		return modifiedCar;
	}
	
	public void regularServiceonWalmart(Cars car, int noOfCars) {
		
		WalmartOilChangeService walmartService = new WalmartOilChangeService(car, noOfCars);
	}
	
}
