package com.opus2.magnum.chronology.importentries;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class OpenImportEntriesDialog {
	@Steps
	ImportEntriesSteps entry;
	
	
	@Given("the Import_Entries_Button is visible")
	public void givenTheImportEntriesButtonIsVisible(){
		assertThat(Util.getElement(ImportEntry.IMPORT_ENTRIES_BUTTON).isDisplayed()).isTrue();
	}
	
	@When("user clicks the Import_Entries_Button")
	public void whenUserClicksTheImportEntriesButton(){
		entry.importEntry();
	}
	
	@Then("Import_Entries_Dialog should be visible")
	public void thenImportEntriesDialogShouldBeVisible(){
		assertThat(Util.getElement(ImportEntry.IMPORT_ENTRIES_DIALOG)
			.getCssValue("display").equals("block")).isTrue();
	}
}
