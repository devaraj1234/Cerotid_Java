package com.cerotid.JavaOOPS.importfromTextFileTest;

import java.io.FileNotFoundException;
import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cerotid.JavaOOPS.importfromTextFile.CarReport;
import com.cerotid.JavaOOPS.importfromTextFile.ImportTextFile;

public class CarReportTest {
	
	ImportTextFile importTextFile;
	CarReport carReport;

	@Before
	public void ImportTextFileObject() {
		importTextFile = new ImportTextFile();
		try {
			importTextFile.importRichmanCollection();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		carReport = new CarReport();
	}
	
	@Test
	public void typeOfCarsTest() {
		try {
			carReport.reportForTypeOfCars();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void reportOnColorOfCarTest() {
		carReport.reportOnColorOfCar();
	}
	
	@Test
	public void reportForOilChangedInLast30DaysTest() {
		carReport.reportForOilChangedInLast30Days();
	}
	
	@After
	public void afterTest() {
		try {
			importTextFile.importRichmanCollection().clear();
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
	}
}
