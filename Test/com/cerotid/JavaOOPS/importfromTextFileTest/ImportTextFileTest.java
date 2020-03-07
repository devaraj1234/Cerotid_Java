package com.cerotid.JavaOOPS.importfromTextFileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cerotid.JavaOOPS.importfromTextFile.ImportTextFile;

public class ImportTextFileTest {

	ImportTextFile importTextFile;

	@Before
	public void ImportTextFileObject() {
		importTextFile = new ImportTextFile();
	}

	@Test
	public void importRichmanCollectionTest() {
		try {
			importTextFile.importRichmanCollection(new File(".//libs//cars.txt"));
			Assert.assertTrue(ImportTextFile.getRichmanCars().size() > 0);
		} catch (FileNotFoundException | ParseException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = FileNotFoundException.class)
	public void fileNotFoundTest() throws Exception {
		importTextFile.importRichmanCollection(new File(".//libs//carss.txt"));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void variableLessOrMoreTest() throws FileNotFoundException, ParseException, Exception {
		importTextFile.importRichmanCollection(new File(".//libs//variableLessOrMore.txt"));
	}

	@After
	public void afterTest() {
		try {
			importTextFile.importRichmanCollection(new File(".//libs//cars.txt")).clear();
		} catch (FileNotFoundException | ParseException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}
