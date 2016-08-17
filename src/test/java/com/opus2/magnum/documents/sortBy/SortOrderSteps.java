package com.opus2.magnum.documents.sortBy;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

import com.opus2.dialog.sortorder.SortOrder;

public class SortOrderSteps {
	SortOrder order;
	
	@Step("option is visible")
	public WebElement option() {
		return order.hasOption();
	}
	
	@Step("clicks page rotate option")
	public void sortOrderOption() {
		order.sortOrderOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return order.dialog();
	}

	@Step("close button is visible")
	public WebElement closeButton() {
		return order.closeButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		order.closeDialog();
	}	
	
	@Step("x button is visible")
	public WebElement xButton() {
		return order.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		order.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return order.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
