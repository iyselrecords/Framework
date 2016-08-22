package com.opus2.pages.documents.documentpreview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opus2.util.Page;

public class PageNumberSelection extends Page {
	private static final String PAGE_SELECTOR = "page-selector";
	private static final String MENU_OPTION = "autocompletes";
	
	
	public WebElement arrowButton() {
		return this.getElementByClass(PAGE_SELECTOR)
			.findElement(By.tagName("button"));
	}
	
	public void openDropdown() {
		arrowButton().click();
	    this.waitForPageToLoad();
	}
	
	public String dropdownOption() {
		return this.getElementByClass(MENU_OPTION)
			.getCssValue("display");
	}
	
	public WebElement arrowButtona() {
		return this.getElementByClass(PAGE_SELECTOR)
			.findElement(By.tagName("button"));
	}
	
	public void openDropdowna() {
		arrowButton().click();
	}
	
	public String dropdownOptiona() {
		return this.getElementByClass(MENU_OPTION)
			.getCssValue("display");
	}

	public void dropdownMenu() {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(MENU_OPTION)));
	}
}
