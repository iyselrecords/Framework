package com.opus2.magnum.chronology.importentries;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.AWTException;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

public class SelectEntriesToImport {
	@Steps
	ImportEntriesSteps entry;
	

	@Given("the Import_Entries_Dialog is open")
	public void givenTheImport_Entries_DialogIsOpen(){
		assertThat(Util.getElement(ImportEntry.IMPORT_ENTRIES_DIALOG)
			.getCssValue("display").equals("block")).isTrue();
	}
	
	@Given("Select_File_Button is visible")
	public void andSelectFileButtonIsVisible(){
		assertThat(Util.getElement(ImportEntry.SELECT_FILE_BUTTON).isDisplayed()).isTrue();
	}
	
	@When("user clicks Select_File_Button")
	public void whenUserClicksSelectFileButton()  throws AWTException{
		entry.selectFile();
	}
	
	@When("import file")
	public void andImportFile(){
		entry.importEntries();
	}
	
	@Then("Entries_Event are added to Event_List")
	public void thenEntriesEventAreAddedToEventList(){
		assertThat(entry.assertDIP().equals("TDIP")).isTrue();
	}
}
