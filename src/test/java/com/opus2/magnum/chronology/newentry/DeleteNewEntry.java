package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class DeleteNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user inputs new entry $entry")
	@Alias("edit new entry $entry")
	public void userInputsNewEntryDetails(String entry){
		newEntry.chronEntry(entry);
	}
	
	@When("inputs $entry")
	public void userInputsEditedEntryDetails(String entry){
		newEntry.chronEntry(entry);
	}
	
	@When("rightclick New_Entry")
	public void andRightclickNewEntry(){
		newEntry.rightclick();
	}
	
	@When("select $option option")
	public void andSelectDeleteOption(String option){
		newEntry.selectOption(option);
	}
	
	@Then("New_Entry is deleted from Chronology_Index")
	public void thenNewEntryIsDeletedFromChronologyIndex(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
