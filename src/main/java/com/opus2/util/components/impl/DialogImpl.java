package com.opus2.util.components.impl;

import java.util.List;

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
	public String notVisible(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
			.getCssValue("display");
	}

	@Override
	public WebElement folder(String folder) {
		return Util.getDriver().findElement(By.className(folder));
	}

	@Override
	public WebElement dialog(String dialogHeader){
		WebElement element = null;
		List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
		for(WebElement dialog :dialogs){
			if(dialog.findElement(By.tagName("h2")).getText().equals(dialogHeader.toUpperCase())){
				element = dialog;
				break;
			}
		}	
		return element;
	}
}
