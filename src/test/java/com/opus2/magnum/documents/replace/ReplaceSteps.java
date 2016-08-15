package com.opus2.magnum.documents.replace;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.replace.Replace;

public class ReplaceSteps {
	Replace replace;
	
	@Step("option is visible")
	public WebElement option() {
		return replace.hasOption();
	}
	
	@Step("clicks autoreplace option")
	public void replaceOption() {
		replace.replaceOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return replace.dialog();
	}

	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return replace.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		replace.closeDialog();
	}		
	@Step("x button is visible")
	public WebElement xButton() {
		return replace.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		replace.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return replace.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
