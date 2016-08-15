package com.opus2.magnum.documents.access;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.access.Access;

import net.thucydides.core.annotations.Step;

public class AccessSteps {
	Access access;
	
	@Step("option is visible")
	public WebElement option() {
		return access.hasOption();
	}

	@Step("clicks access option")
	public void accessOption() {
		access.accessOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return access.dialog();
	}	
	
	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return access.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		access.closeDialog();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return access.notVisible();
	}
	
	@Step("x button is visible")
	public WebElement xButton() {
		return access.xButton();
	}
	
	@Step("close dialog by X button")
	public void closeByXButton() {
		access.closeByXButton();
	}
		
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
