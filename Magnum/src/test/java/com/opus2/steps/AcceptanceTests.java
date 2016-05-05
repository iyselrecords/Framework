package com.opus2.steps;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.opus2.util.Util;
import net.serenitybdd.jbehave.SerenityStories;


public class AcceptanceTests extends SerenityStories{
	Util driver;
	
	public static Logger APP_LOGS = Logger.getLogger(AcceptanceTests.class);
	public static String baseUrl;
	public static String brand;
	
	public AcceptanceTests()throws IOException {

		baseUrl = getEnvironmentVariables().getProperty("webdriver.base.url");
		APP_LOGS.info("AcceptanceTests(): baseUrl=" + baseUrl);
		
		
		findStoriesCalled("*Admin_001*.story,*Admin_002a*.story,*Admin_004a*.story,"
				+ "*Admin_004b*.story,*Admin_004b1*.story");
		Util.initializing(getEnvironmentVariables().getProperty("brand"),
				getEnvironmentVariables().getProperty("lan"),
				getEnvironmentVariables().getProperty("platform"),
				getEnvironmentVariables().getProperty("webdriver.driver"));

	}
}