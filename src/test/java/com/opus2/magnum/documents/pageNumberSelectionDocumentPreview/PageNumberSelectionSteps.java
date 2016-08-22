package com.opus2.magnum.documents.pageNumberSelectionDocumentPreview;

import org.openqa.selenium.WebElement;

import com.opus2.pages.documents.documentpreview.PageNumberSelection;

import net.thucydides.core.annotations.Step;

public class PageNumberSelectionSteps {
	PageNumberSelection num;
	
	@Step("dropdown button is visible")
	public WebElement arrowButton(){
		return num.arrowButton();
	}
	
	@Step("clicks to open dropdown")
	public void openDropdown() {
		num.openDropdown();
	}

	@Step("clicks to open dropdown")
	public String dropdownOption() {
		return num.dropdownOption();
	}
	
	@Step("clicks to close dropdown")
	public void closeDropdown() {
		num.openDropdown();
	}
	
	@Step("dropdown menu is closed")
	public void dropdownMenu() {
		num.dropdownMenu();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
