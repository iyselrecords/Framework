package com.opus2.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject{
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
         return Util.getDriver().findElement(By.id(elem));
     }
}
