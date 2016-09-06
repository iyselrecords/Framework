package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class CreateNewEventEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@Given("the Chronology_Event_Dialog is open")
	public void givenTheChronologyEventDialogIsOpen(){
		assertThat(newEntry.dialog().equals("block")).isTrue();
	}
	
	@When("user inputs Chronology_Event_Details")
	public void userInputsChronologyEventDetails(){
		newEntry.eventEntries();
	}
	
	@Then("a new Chronology_Event is added to Event_List")
	public void thenANewChronologyEventIsAddedToEventList(){
	    newEntry.deleteEntry();
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
