package com.opus2.magnum.documents.importNotes;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

import com.opus2.dialog.importnotes.ImportNotes;

public class ImportNotesSteps {
	ImportNotes notes;
	
	@Step("option is visible")
	public WebElement option() {
		return notes.hasOption();
	}
	
	@Step("clicks autonotes option")
	public void importNotesOption() {
		notes.notesOption();
	}
	
	@Step("dialog is visible")
	public WebElement importNotesDialog() {
		return notes.notesDialog();
	}
	
	@Step("dialog is visible")
	public WebElement selectADocumentDialog() {
		return notes.selectDialog();
	}
	
	@Step("folder is visible")
	public WebElement folderIsVisible() {
		return notes.docFolder();
	}

	@Step("select folder")
	public void selectFolder() {
		notes.selectFolder();
	}
	
	@Step("click apply button")
	public void apply() {
		notes.apply();
	}
		
	@Step("x button is visible")
	public WebElement xButton() {
		return notes.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		notes.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return notes.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}

	

	
}
