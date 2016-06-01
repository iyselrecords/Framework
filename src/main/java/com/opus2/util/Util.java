package com.opus2.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.guice.Injectors;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;

public class Util extends PageObject{
	
	private EnvironmentVariables environmentVariables;
		
	public static Logger APP_LOGS = Logger.getLogger(Util.class);
	private static String language;
	private static String brandType;
	private static String platform;
	private static String browser;
	private static long defaultImplicitlyWait;
	private static Properties configuration;
	public WebDriver driver = getDriver();
	
	
	
	public void wait(int sec){
		try {
			Thread.sleep(1000 * sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void wait(double sec){
		try {
			Thread.sleep((long) (1000 * sec));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void explicitWait(String elementId){	
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), 300);
			wait.until( 
					ExpectedConditions.elementToBeClickable(By.id(elementId)));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public EnvironmentVariables getEnvironmentVariables() {
        if (environmentVariables == null) {
            environmentVariables = Injectors.getInjector().getProvider(EnvironmentVariables.class).get().copy();
        }
        return environmentVariables;
    }
		
	public static void initializing(final String brand, final String lang,
			final String platf, final String browser) throws IOException {
		APP_LOGS.info("Inside initialization....." + brand);
		setBrand(brand);
		setLang(lang);
		setPlatform(platf);
		setDefaultImplicitlyWait(200000);
		brandConfigLoader(brand);
	}
	
	private static void setBrand(final String brand) {
		if ("Opus2".equals(brand)) {
			setBrandType(Constants.Opus2);
		} else {
			APP_LOGS.info("(): ERROR: The brand \'" + brand + "\' is not supported.");
		}
	}
	
	public static void setBrandType(final String brand) {
		brandType = brand;
	}
	
	private static void setLang(final String lang) {
		if ("EN".equals(lang)) {
			setLanguage(Constants.EN);
		} else if ("HI".equals(lang)) {
			setLanguage(Constants.HI);
		}else if ("IT".equals(lang)) {
			setLanguage(Constants.IT);
		}  
		else {
			APP_LOGS.info("(): ERROR: The language \'" + lang + "\' is not supprted.");
		}
	}
	
	private static void setLanguage(final String lang) {
		language = lang;
	}

	public static void setDefaultImplicitlyWait(final long defaultImplicitlyWait) {
		Util.defaultImplicitlyWait = defaultImplicitlyWait;
	}
	
	private static void setPlatform(final String platf) {
		if ("DESKTOP".equals(platf.toUpperCase())) {
			platform = Constants.PLATFORM_DESKTOP;
		} else if ("MOBILE".equals(platf.toUpperCase())) {
			platform = Constants.PLATFORM_MOBILE;
		} else if ("GRID".equals(platf.toUpperCase())) {
			platform = Constants.PLATFORM_GRID;
		} else {
			APP_LOGS.info("(): ERROR: The platform \'" + platf + "\' is not supported.\n");
		}
	}
	
	public static void brandConfigLoader(String brandType) throws IOException {
		FileInputStream brandConfigFile = null;

			APP_LOGS.info("brandConfigLoader(): brandType= "+getBrandType());
			APP_LOGS.info("brandConfigLoader(): Platform = "+getPlatform());
			
			brandConfigFile = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//"+ brandType + "//" + Constants.CONFIG +".properties");
			configuration = new Properties();
			configuration.load(brandConfigFile);
	}
	
	public static String getBrandType() {
		return brandType;
	}
	
	public static String getPlatform() {
		return platform;
	}
	
}