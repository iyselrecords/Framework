package com.opus2.magnum.documents.insert;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.insert.InsertDocument;

import net.thucydides.core.annotations.Step;

public class InsertDocumentSteps {
	InsertDocument insert;
	
	@Step("option is visible")
	public WebElement option() {
		return insert.hasOption();
	}
	
	@Step("clicks autoinsert option")
	public void insertDocumentOption() {
		insert.insertDocumentOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return insert.dialog();
	}
	
	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return insert.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		insert.closeDialog();
	}		
	@Step("x button is visible")
	public WebElement xButton() {
		return insert.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		insert.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return insert.notVisible();
	}
}
