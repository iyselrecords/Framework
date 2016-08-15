package com.opus2.util.components.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class DialogImpl extends ComponentImpl implements Dialog {

	public DialogImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public WebElement hasDialog(String elementId) {
		return Util.getDriver().findElement(By.id(elementId));
	}

	@Override
	public WebElement xButton(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
		.findElements(By.tagName("button")).get(0);
	}

	@Override
	public void isNotVisible(String elementId) {
		WebElement dialog = Util.getDriver().findElement(By.id(elementId));
		String value = dialog.getCssValue("style");
		
		String[] att = value.split(";");
		for(String t : att){
			System.out.println("Martino: "+ t.toString());
		}
	}

}
