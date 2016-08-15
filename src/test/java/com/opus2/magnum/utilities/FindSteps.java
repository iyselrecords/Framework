package com.opus2.magnum.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Step;

public class FindSteps {
	@Step
	public String findStepsDIP(){
		return "TDIP";
	}
	
	@Step
	public WebElement inputField(){
		return Util.getDriver().findElements(By.className("searchComponentInput")).get(0)
			.findElements(By.tagName("input")).get(0);
	}
	
	@Step
	public WebElement findInput(){
		return Util.getDriver().findElement(By.className("searchComponentInput"))
			.findElement(By.tagName("input"));
	}
	
	@Step
	public void enterSearch(){
		inputField().sendKeys("Day 2");
		searchButton();
	}
	
	private void searchButton(){
		Util.getDriver().findElement(By.className("searchComponentButton"))
			.click();
	}
}
