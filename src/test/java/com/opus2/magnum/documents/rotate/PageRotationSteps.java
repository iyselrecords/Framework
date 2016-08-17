package com.opus2.magnum.documents.rotate;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.rotate.PageRotate;

import net.thucydides.core.annotations.Step;


public class PageRotationSteps {
	PageRotate page;
	
	@Step("option is visible")
	public WebElement option() {
		return page.hasOption();
	}
	
	@Step("clicks page rotate option")
	public void pageRotateOption() {
		page.pageRotateOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return page.dialog();
	}

	@Step("close button is visible")
	public WebElement closeButton() {
		return page.closeButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		page.closeDialog();
	}		
	
	@Step("x button is visible")
	public WebElement xButton() {
		return page.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		page.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return page.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
