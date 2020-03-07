package com.cerotid.JavaOOPS.RichManCollectionTest;

import org.junit.Before;
import org.junit.Test;

import com.cerotid.JavaOOPS.RichManCollection.DisplayMenu;
import com.cerotid.JavaOOPS.RichManCollection.RichManUtilities;

public class DisplayMenuTest {

	DisplayMenu display;
	RichManUtilities rmu;

	@Before
	public void displayMenuObject() {
		display = new DisplayMenu();
		rmu = new RichManUtilities();
		display.displayMenu();

	}

	@Test
	public void displayMenuTest() {
		
		System.out.println(rmu.richmanColletion.size());

	}

}
