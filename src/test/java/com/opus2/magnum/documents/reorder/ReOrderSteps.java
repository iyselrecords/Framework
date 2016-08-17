package com.opus2.magnum.documents.reorder;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

import com.opus2.dialog.reorder.ReOrder;

public class ReOrderSteps {
	ReOrder reorder;
	
	@Step("option is visible")
	public WebElement option() {
		return reorder.hasOption();
	}
	
	@Step("clicks autoreorder option")
	public void reOrderOption() {
		reorder.reOrderOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return reorder.dialog();
	}

	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return reorder.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		reorder.closeDialog();
	}		
	@Step("x button is visible")
	public WebElement xButton() {
		return reorder.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		reorder.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return reorder.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
