package com.opus2.steps;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;


public class AcceptanceTestSuite extends SerenityStories{
	Util driver;
	
	public static Logger APP_LOGS = Logger.getLogger(AcceptanceTestSuite.class);
	public static String baseUrl;
	public static String brand;
	
	public AcceptanceTestSuite()throws IOException {

		baseUrl = getEnvironmentVariables().getProperty("webdriver.base.url");
		APP_LOGS.info("AcceptanceTestSuite(): baseUrl=" + baseUrl);
		//BasicConfigurator.configure();

		findStoriesCalled("Admin_001.story;"
				+ "Admin_002a.story;"
				
				+ "CH_01_06.story;"
				+ "test.story;");
		
			Util.initializing(getEnvironmentVariables().getProperty("brand"),
				getEnvironmentVariables().getProperty("lan"),
				getEnvironmentVariables().getProperty("platform"),
				getEnvironmentVariables().getProperty("webdriver.driver"));
		
	}
}