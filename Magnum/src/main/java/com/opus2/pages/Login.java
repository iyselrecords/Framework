package com.opus2.pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opus2.util.Util;

public class Login  extends PageObject {
	public WebDriver driver = getDriver();
	
	Util browser;

	public void initilize() {
		browser.open();
		getDriver().manage().window().maximize();
		browser.wait(2);		
	}

	public void withPassword(String pwd) {
		getDriver().findElement(By.id("passwordField")).sendKeys(pwd);
	}

	public void loginAs(String uid) {
		getDriver().findElement(By.id("eid")).sendKeys(uid);
	}

	public void login() {
		getDriver().findElement(By.id("submit-login")).click();
	}

}
