package com.opus2.util.components.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Find;

public class FindImpl extends ComponentImpl implements  Find {

	private static final String FIND_INPUT = "searchInputArea";
	private static final String FIND_BUTTON = "searchComponentButton";

	public FindImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	public void find(String keyword) {
		WebElement input = Util.getDriver().findElements(By.className(FIND_INPUT)).get(0);
		input.findElements(By.tagName("input")).get(0).sendKeys(keyword);	
		Util.pause(1);
		Util.getDriver().findElements(By.className(FIND_BUTTON)).get(0).click();
	}
}
