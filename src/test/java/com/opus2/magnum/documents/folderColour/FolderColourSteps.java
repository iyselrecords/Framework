package com.opus2.magnum.documents.folderColour;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.foldercolor.FolderColour;

public class FolderColourSteps {
	FolderColour color;
	
	@Step("option is visible")
	public WebElement option() {
		return color.hasOption();
	}
	
	@Step("clicks autocolor option")
	public void folderColorOption() {
		color.folderColorOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return color.dialog();
	}
	
	@Step("close button is visible")
	public WebElement cancelButton() {
		return color.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		color.closeDialog();
	}
	
	@Step("x button is visible")
	public WebElement xButton() {
		return color.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		color.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return color.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
