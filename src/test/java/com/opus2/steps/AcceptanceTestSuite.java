package com.opus2.steps;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories  {
	Util driver;
	
	public static Logger APP_LOGS = Logger.getLogger(AcceptanceTestSuite.class);
	public static String baseUrl;
	public static String brand;
	
	public AcceptanceTestSuite()throws IOException {
		
		baseUrl = getEnvironmentVariables().getProperty("webdriver.base.url");
		APP_LOGS.info("AcceptanceTestSuite(): baseUrl=" + baseUrl);
		
		
		
		
		findStoriesCalled("Admin_001.story;"
				+ "Admin_002a.story;"
				+ "Admin_004a.story;"
				+ "Admin_004b.story;"
				+ "Admin_004b1.story;"
				+ "Admin_004c1.story;"
				+ "Admin_004c2.story;"
				+ "Admin_004c3.story;"
				+ "Admin_004c4.story;"
				+ "Admin_004c42.story;"
				+ "Admin_004c5.story;"
				+ "Admin_004d.story;"
				+ "Admin_004e.story;"
				+ "Admin_004f.story;"
				+ "Admin_004g.story;"
				+ "Admin_004h.story;"
				+ "Admin_004i.story;"
				+ "Admin_084.story;"
				+ "Admin_085.story;"
				+ "Admin_086.story;"
				+ "Admin_087a.story;");
		
		Util.initializing(getEnvironmentVariables().getProperty("brand"),
				getEnvironmentVariables().getProperty("lan"),
				getEnvironmentVariables().getProperty("platform"),
				getEnvironmentVariables().getProperty("webdriver.driver"));
	}
}