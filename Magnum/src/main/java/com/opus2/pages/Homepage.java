package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opus2.util.Util;
import net.thucydides.core.pages.PageObject;

public class Homepage extends PageObject{
	public WebDriver driver = getDriver();
	Util util;
	
	public void initilize() {
		util.open();
		getDriver().manage().window().maximize();
		util.wait(2);
	}

	public void loginAs(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username);
	}

	public void withPassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);	
	}

	public void tearDown() {
		getDriver().quit();
	}

	public void signIn() {
		getDriver().findElement(By.id("submit")).click();
	}

	public void logout() {
		getDriver().findElement(By.linkText("Log Out")).click();
	}
	
}