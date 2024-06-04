package com.amol.automation.testutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.amol.automation.base.TestBase;

public class TestUtils extends TestBase {
	
	public static String TEST_DATA_FILE_PATH = System.getProperty("user.dir")+"testdata.xlsx";

	public static Object[][] getTestData(String sheetname){
		try {
			FileInputStream fs = new FileInputStream(TEST_DATA_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}



}
