package com.opus2.magnum.navigate;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.pages.navigation.Navigation;
import com.opus2.util.Util;

public class NavigateSteps {
	Navigation nav;
	
	@Step("chronology tab is visible")
	public WebElement chronTab() {
		return nav.chronTab();
	}
	
	@Step("clicks chronology tab")
	public void chronologyTab() {
		nav.chronologyTab();
	}
		
	@Step
	public WebElement tabIsVisible() {
		WebElement tab = Util.getDriver().findElement(By.id("logo"));  
		return tab;
	}
	
	@Step
	public void clickTab() {
		tabIsVisible().click();
	}
}
