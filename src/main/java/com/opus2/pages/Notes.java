package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Notes extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	
	public void goTo() {
		getDriver().findElement(By.id("magnumNotes")).click();
	}
}
