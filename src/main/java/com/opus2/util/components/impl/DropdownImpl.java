package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Dropdown;

public class DropdownImpl extends ComponentImpl implements Dropdown {

	public DropdownImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public String isVisible(String dropdown) {
		Util.pause(2);
		return Util.getDriver().findElements(By.className(dropdown)).get(0)
			.getCssValue("display");
	}

	@Override
	public WebElement selectOption(String className, String optionText) {
		WebElement element = null;
		List<WebElement> options = Util.getDriver().findElements(By.className(className));
		for(WebElement option:options){
			if(option.getText().equals(optionText)){
				element = option;
			}
		}
		return element;
	}

}
