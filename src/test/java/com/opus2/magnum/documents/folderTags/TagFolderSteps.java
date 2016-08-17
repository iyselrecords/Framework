package com.opus2.magnum.documents.folderTags;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

import com.opus2.dialog.tagfolder.TagFolder;

public class TagFolderSteps {
	TagFolder tagFolder;
	
	@Step("option is visible")
	public WebElement option() {
		return tagFolder.hasOption();
	}
	
	@Step("clicks autotagFolder option")
	public void tagFolderOption() {
		tagFolder.tagFolderOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return tagFolder.dialog();
	}
	
	@Step("close button is visible")
	public WebElement noButton() {
		return tagFolder.noButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		tagFolder.closeDialog();
	}
	@Step("x button is visible")
	public WebElement xButton() {
		return tagFolder.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		tagFolder.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return tagFolder.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
	    return "TDIP";
	}
}
