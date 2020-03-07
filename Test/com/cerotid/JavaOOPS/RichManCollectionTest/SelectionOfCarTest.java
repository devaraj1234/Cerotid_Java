package com.cerotid.JavaOOPS.RichManCollectionTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cerotid.JavaOOPS.RichManCollection.SelectionOfCar;
import com.cerotid.JavaOOPS.UserInputExceptions.InvalidUserInputException;

public class SelectionOfCarTest {

	SelectionOfCar selection;

	@Before
	public void selectionOfCarObject() {
		selection = new SelectionOfCar();
	}

	@Test
	public void selectionOfCarTypeTest() {

		try {
			Assert.assertEquals("Camaro", selection.selcetCarType("Camaro").getCarName());
			Assert.assertEquals("Mustang", selection.selcetCarType("Mustang").getCarName());
			Assert.assertEquals(null, selection.selcetCarType("Nissan").getCarName());
		} catch (InvalidUserInputException e) {
			e.printStackTrace();
		}

	}

}
