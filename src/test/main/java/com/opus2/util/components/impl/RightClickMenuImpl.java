package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.RightClickMenu;

public class RightClickMenuImpl extends ComponentImpl implements RightClickMenu {
	
	public RightClickMenuImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public WebElement selectOption(String optionName) {
		WebElement elem = null;
		WebElement menu = Util.getDriver().findElement(By.id("rightClickMenu"));
		List <WebElement> options = menu.findElements(By.tagName("span"));
		for(WebElement option : options){
			if(option.getText().equals(optionName)){
				elem = option;
				break;
			}
		}
		return elem;
	}

	@Override
	public WebElement hasOption(String option) {
		return selectOption(option);
	}

	@Override
	public WebElement hasButton(String elementId) {
	 	return Util.getDriver().findElement(By.id(elementId));
	}  
}
