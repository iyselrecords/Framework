package com.opus2.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject{
	private static final String DOCUMENT_WRAP = "docsdiv";
	
	public Page view() {
		return null;
	}

	public void waitForPageToLoad() {
		setWaitForTimeout(25000);
	}
	 
	public void waitForPageAction() {
		 setWaitForTimeout(10000);
	}
	 
	public WebElement getElement(String elem) {
		 withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(elem));
		 return this.getDriver().findElement(By.id(elem));
	}
	 
	public WebElement getDocument(String docTitle) {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(DOCUMENT_WRAP));
		WebElement document = null;
		List <WebElement> documents = Util.getDriver().findElement(By.id(DOCUMENT_WRAP))
			.findElements(By.className("doctitle"));
		for(WebElement element : documents){
			if(element.getText().equals(docTitle)){
				document = element;
				break;
			}
		}
		return document;
	}
	 
	public WebElement getElementByClass(String className) {
		 withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(className));
		return this.getDriver().findElements(By.className(className)).get(0);
	}
}
