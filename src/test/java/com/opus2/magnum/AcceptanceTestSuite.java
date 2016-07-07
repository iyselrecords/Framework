package com.opus2.magnum;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.openqa.selenium.WebDriver;

import com.opus2.core.configuration.Configuration;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	@BeforeStories
	public void beforeStories() {
		Configuration.getInstance();
	}
	@AfterStories
	public void afterStories(){
	  WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	  driver.close();
      driver.quit();
	}
}
