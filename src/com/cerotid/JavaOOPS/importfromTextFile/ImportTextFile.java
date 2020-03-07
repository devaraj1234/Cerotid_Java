package com.cerotid.JavaOOPS.importfromTextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cerotid.JavaOOPS.cars.Cars;
import com.cerotid.JavaOOPS.cars.Engine;
import com.cerotid.JavaOOPS.cars.Tires;

public class ImportTextFile {

	private static List<Cars> richmanCars = new ArrayList<>();

	public List<Cars> importRichmanCollection() throws ParseException, FileNotFoundException {

		File file = new File(".//libs//cars.txt");
		Scanner scan = new Scanner(file);
		SimpleDateFormat dtf = new SimpleDateFormat("MMM-dd-yyyy");

		String car;

		while (scan.hasNextLine()) {

			car = scan.nextLine();
			String[] token = car.split(" ");
			if (token.length == 12) {
				String carName = token[0];
				String carType = token[1];
				String color = token[2];
				int doors = Integer.parseInt(token[3]);
				float maxSpeed = Float.parseFloat(token[4]);
				Tires tires = Tires.parseTires(token[5]);
				Engine engine = Engine.parseEngine(token[6]);
				boolean hasAndroidAuto = Boolean.parseBoolean(token[7]);
				boolean hasCarPlay = Boolean.parseBoolean(token[8]);
				Date lastOilChangeDate = dtf.parse(token[9]);
				Date lastTireChangeDate = dtf.parse(token[10]);
				String vin = token[11];
				Cars rmCar = new Cars(carName, carType, color, doors, maxSpeed, tires, engine, hasAndroidAuto,
						hasCarPlay, lastOilChangeDate, lastTireChangeDate, vin);
				getRichmanCars().add(rmCar);
			} else
				try {
					throw new Exception(
							"values in cars.txt file doesnot match with the numbers of variables in programme");
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		scan.close();
		return richmanCars;
	}

	public static List<Cars> getRichmanCars() {
		return richmanCars;
	}
}