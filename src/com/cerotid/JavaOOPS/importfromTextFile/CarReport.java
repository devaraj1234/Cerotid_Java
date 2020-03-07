package com.cerotid.JavaOOPS.importfromTextFile;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cerotid.JavaOOPS.cars.Cars;

public class CarReport {

	ImportTextFile importfile = new ImportTextFile();
	
	List<Cars> richmanCar = ImportTextFile.getRichmanCars();

	public void TypeOfCars() throws FileNotFoundException, ParseException {

		Map<String, Integer> carType = new HashMap<>();

		for (Cars car : richmanCar) {
			Integer count = carType.get(car.getCarType());
			if (count == null) {
				count = 0;
			}
			carType.put(car.getCarType(), count + 1);
		}
		System.out.println("========================================================================\n"
				+ "Collection of different Type of car in RichMan parking lot are:");
		for (Map.Entry<String, Integer> entry : carType.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
	}

	public void colorOfCar() {

		List<String> carColor = new ArrayList<>();

		for (Cars car : richmanCar) {
			carColor.add(car.getColor());
		}

		Set<String> distinctCarColor = new HashSet<>(carColor);
		System.out.println("\n========================================================================\n"
				+ "Collection of different Color of car in RichMan parking lot are:");
		for (String color : distinctCarColor) {
			System.out.println(color + " ==> " + Collections.frequency(carColor, color));
		}
	}

	public List<Cars> oilChangedInLast30Days() {

		List<Cars> oilChangedinLast30Days = new ArrayList<>();
		Date todayDate = new Date();

		System.out.println("\n========================================================================\n"
				+ "List of Cars which changed the oil in last 30 days are:");
		for (Cars car : richmanCar) {

			long diffMils = todayDate.getTime() - car.getLastOilChangeDate().getTime();
			int diffDays = (int) (diffMils / (24 * 60 * 60 * 1000));
			if (diffDays < 30) {
				oilChangedinLast30Days.add(car);
				System.out.println(car);
			}
		}
		System.out.println("Total no of Cars which changed oil in last 30 Days ==> " + oilChangedinLast30Days.size());
		return oilChangedinLast30Days;
	}
}