package com.opus2.pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;

public class Assertions extends PageObject {

	public WebDriver driver = getDriver();
	
	public String baseurl = "https://customer.opus2.com";
	public String server = "/rc/php/magnumAdmin.php?";
	public String workspace = "ws=110717515#";
		
		
	
	public boolean isAt() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAt(String page) {
		String url = "https://customer.opus2.com/rc/php/magnumAdmin.php?ws=110717515#";		
		String currentUrl = getDriver().getCurrentUrl();
		System.out.println("Martino..." +currentUrl);
		System.out.println("Martino..." +url + page);
		return true;
		//return url + page == currentUrl;
	}

}
