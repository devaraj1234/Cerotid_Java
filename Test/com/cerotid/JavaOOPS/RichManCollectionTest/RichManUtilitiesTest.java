package com.cerotid.JavaOOPS.RichManCollectionTest;

import org.junit.*;

import com.cerotid.JavaOOPS.RichManCollection.RichManUtilities;
import com.cerotid.JavaOOPS.UserInputExceptions.InvalidUserInputException;
import com.cerotid.JavaOOPS.cars.Cars;

public class RichManUtilitiesTest {

	RichManUtilities rm;

	@Before
	public void richManCollectionObject() {
		rm = new RichManUtilities();
	}

	@Test
	public void addCarToCollectionTest() {

		Assert.assertEquals(1, rm.addCar("Camaro").size());
		System.out.println(rm.richmanColletion);
		Assert.assertEquals(2, rm.addCar("Mustang").size());
		Assert.assertEquals(2, rm.addCar("Nissan").size());
	}
	
	@Test
	public void modifyCarFeatureTest() {
		addCarToCollectionTest();
		try {
			Cars car = rm.modifyCarFeature("123abc", true, true);
			Assert.assertEquals(true, car.isHasAndroidAuto());
			Assert.assertEquals(true, car.isHasCarPlay());
		} catch (InvalidUserInputException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void repaintCarTest(){
		addCarToCollectionTest();
		Cars car = rm.repaintCar("Mustang", "red"); 
		Assert.assertEquals("red", car.getColor());
		Cars car1 = rm.repaintCar("Camaro", "Black");
		Assert.assertEquals("Black", car1.getColor());
	}
}
