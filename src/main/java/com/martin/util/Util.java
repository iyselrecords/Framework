package com.martin.util;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://customer.opus2.com/rc/php/magnumLogin.php")
public class Util extends PageObject {
	public WebDriver driver = getDriver();
	
	public void wait(int sec){
		try {
			Thread.sleep(1000 * sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void wait(double sec){
		try {
			Thread.sleep((long) (1000 * sec));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
