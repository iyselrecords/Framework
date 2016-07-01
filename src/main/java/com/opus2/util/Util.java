package com.opus2.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import net.serenitybdd.core.pages.PageObject;

public class Util extends PageObject {

	public Properties Test_Properties;
	public Properties Test_Json;
	public Properties Test_Table;
	
	public void pause(int waitTime) {
		try {
			Thread.sleep(1000 * waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void pause(double waitTime) {
		try {
			Thread.sleep((long) (1000 * waitTime));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void testVariableLoader() throws IOException {
		FileInputStream testFile = null;
		
		testFile = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//testData.properties");		
		Test_Properties = new Properties();
		Test_Properties.load(testFile);
		
		testFile = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//tData.table");
		Test_Table = new Properties();
		Test_Table.load(testFile);
	}
	public void initializing() throws IOException {
		testVariableLoader();
	}
	
}
