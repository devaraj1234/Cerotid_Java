package com.cerotid.JavaOOPS.importfromTextFileTest;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cerotid.JavaOOPS.cars.Cars;
import com.cerotid.JavaOOPS.importfromTextFile.CarReport;
import com.cerotid.JavaOOPS.importfromTextFile.ImportTextFile;

public class CarReportTest {
	
	ImportTextFile importTextFile;
	CarReport carReport;
	List<Cars> richmanCar;

	@Before
	public void ImportTextFileObject() {
		importTextFile = new ImportTextFile();
		try {
			importTextFile.importRichmanCollection();
			richmanCar = ImportTextFile.getRichmanCars();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		carReport = new CarReport();
	}
	
	@Test
	public void typeOfCarsTest() {
		try {
			carReport.reportForTypeOfCars(richmanCar);
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void reportOnColorOfCarTest() {
		carReport.reportOnColorOfCar(richmanCar);
	}
	
	@Test
	public void reportForOilChangedInLast30DaysTest() {
		carReport.reportForOilChangedInLast30Days(richmanCar);
	}
	
	@After
	public void afterTest() {
		try {
			importTextFile.importRichmanCollection().clear();
			ImportTextFile.getRichmanCars().clear();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
	}
}
