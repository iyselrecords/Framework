package com.opus2.magnum.documents.rename;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.rename.Rename;

import net.thucydides.core.annotations.Step;

public class RenameSteps {
	Rename rename;
	
	@Step("option is visible")
	public WebElement option() {
		return rename.hasOption();
	}
	
	@Step("clicks autorename option")
	public void renameOption() {
		rename.renameOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return rename.dialog();
	}

	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return rename.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		rename.closeDialog();
	}		
	@Step("x button is visible")
	public WebElement xButton() {
		return rename.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		rename.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return rename.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
