package com.opus2.magnum.documents.bulkDocReplace;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.bulkReplace.BulkReplace;

import net.thucydides.core.annotations.Step;

public class BulkReplaceSteps {
	BulkReplace  bulkReplace;

	@Step("option is visible")
	public WebElement option() {
		return bulkReplace.hasOption();
	}

	@Step("clicks bulk replace option")
	public void bulkReplaceOption() {
		bulkReplace.bulkReplaceOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return bulkReplace.dialog();
	}
	
	@Step("close button is visible")
	public WebElement closeButton() {
		return bulkReplace.closeButton();
	}

	@Step("close dialog")
	public void closeDialog() {
		bulkReplace.closeDialog();
	}

	@Step("dialog not visible")
	public String notVisible() {
		return bulkReplace.notVisible();
	}
	
	@Step("x button is visible")
	public WebElement xButton() {
		return bulkReplace.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		bulkReplace.closeByXButton();
	}	
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
