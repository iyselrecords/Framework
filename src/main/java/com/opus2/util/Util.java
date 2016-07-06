package com.opus2.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;

public final class Util{
	public static WebDriver getDriver(){
	  return Serenity.getWebdriverManager().getCurrentDriver();
	}
	public static Alert getActiveNativeAlert(){
	  WebDriverWait wait = new WebDriverWait(getDriver(), 10);
      wait.until(ExpectedConditions.alertIsPresent());
      return getDriver().switchTo().alert();  
	}
}
