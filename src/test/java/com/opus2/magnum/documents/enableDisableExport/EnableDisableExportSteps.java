package com.opus2.magnum.documents.enableDisableExport;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.enabledisableexport.EnableDisableExport;

import net.thucydides.core.annotations.Step;

public class EnableDisableExportSteps {
	EnableDisableExport eDExp;
	
	@Step("option is visible")
	public WebElement option() {
		return eDExp.hasOption();
	}
	
	@Step("clicks autoeDExp option")
	public void enbDsbExpOption() {
		eDExp.enbDsbExpOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return eDExp.dialog();
	}
	
	@Step("close button is visible")
	public WebElement closeButton() {
		return eDExp.closeButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		eDExp.closeDialog();
	}
	
	@Step("x button is visible")
	public WebElement xButton() {
		return eDExp.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		eDExp.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return eDExp.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
