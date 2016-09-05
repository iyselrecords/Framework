package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.DocumentViewControl;

public class DocumentViewControlImpl extends ComponentImpl implements DocumentViewControl {

	public DocumentViewControlImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public WebElement button(String title) {
		WebElement element = null;
		List<WebElement> buttons = Util.getDriver().findElement(By.id("toolbar-magnum-view"))
			.findElements(By.tagName("button"));
		for(WebElement button :buttons){
			if(button.getAttribute("title").equals(title)){
				element = button;
				break;
			}
		}
		return element;
	}

}
