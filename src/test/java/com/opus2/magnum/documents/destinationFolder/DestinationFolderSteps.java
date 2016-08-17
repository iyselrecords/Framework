package com.opus2.magnum.documents.destinationFolder;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.destinationfolder.DestinationFolder;

import net.thucydides.core.annotations.Step;

public class DestinationFolderSteps {
	DestinationFolder destFol;
	
	@Step("option is visible")
	public WebElement option() {
		return destFol.hasOption();
	}
	
	@Step("clicks copy option")
	public void copyOption() {
		destFol.copyOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return destFol.dialog();
	}
	
	@Step("close button is visible")
	public WebElement cancelButton() {
		return destFol.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		destFol.closeDialog();
	}		
	
	@Step("x button is visible")
	public WebElement xButton() {
		return destFol.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		destFol.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return destFol.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
