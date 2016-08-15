package com.opus2.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class MyPhantomJSDriver implements DriverSource {
	
    @Override
    public WebDriver newDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
		return new PhantomJSDriver(PhantomJSDriverService.createDefaultService(), capabilities);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }

}
