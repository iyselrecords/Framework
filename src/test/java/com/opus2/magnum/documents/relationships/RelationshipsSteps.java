package com.opus2.magnum.documents.relationships;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

import com.opus2.dialog.relationships.Relationships;

public class RelationshipsSteps {
	Relationships relatedDoc;
	
	@Step("option is visible")
	public WebElement option() {
		return relatedDoc.hasOption();
	}
	
	@Step("clicks autorelatedDoc option")
	public void relatedDocumentOption() {
		relatedDoc.relatedDocumentOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return relatedDoc.dialog();
	}
	
	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return relatedDoc.cancelButton();
	}
	
	@Step("close dialog")
	public void closeDialog() {
		relatedDoc.closeDialog();
	}		
	@Step("x button is visible")
	public WebElement xButton() {
		return relatedDoc.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		relatedDoc.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return relatedDoc.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
