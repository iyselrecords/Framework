package com.opus2.magnum.documents.chronology;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.addtochronology.AddToChronology;

import net.thucydides.core.annotations.Step;

public class AddToChronologySteps {
	AddToChronology addToChron;
	
	@Step("option is visible")
	public WebElement option() {
		return addToChron.hasOption();
	}
	
	@Step("clicks addToChron option")
	public void addToChronOption() {
		addToChron.addToChronOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return addToChron.dialog();
	}
	
	@Step("cancel button is visible")
	public WebElement cancelButton() {
		return addToChron.cancelButton();
	}

	@Step("close dialog")
	public void closeDialog() {
		addToChron.closeDialog();
	}	
	
	@Step("x button is visible")
	public WebElement xButton() {
		return addToChron.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		addToChron.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return addToChron.notVisible();
	}

    public void selectChronology(String option) {
        addToChron.selectChronology(option);
    }
	
	@Step("test data")
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step()
    public void createNewEntry() {
        addToChron.createNewEntry();
    }

	@Step()
    public void selectExistingEntry() {
	    addToChron.selectExistingEntry();
    }
}
