package com.cerotid.JavaOOPS.importfromTextFileTest;

import java.io.FileNotFoundException;
import java.text.ParseException;

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
			importTextFile.importRichmanCollection();
			Assert.assertTrue(ImportTextFile.getRichmanCars().size()>0);
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
	}
}
