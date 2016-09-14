package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class OpenChronologyEventNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@Given("the New_Entry_Button is visible")
	public void givenTheNewEntryButtonIsVisible(){
		assertThat(Util.getElement(ChronologyNewEntry.NEW_ENTRY_BUTTON).isDisplayed()).isTrue();
	}
	
	@When("user clicks the New_Entry_Button")
	public void whenUserClicksTheNewEntryButton(){
		newEntry.newEntry();
	}
	
	@Then("Chronology_Event_Dialog should be visible")
	public void thenChronologyEventShouldBeVisible(){
		assertThat(newEntry.dialog().equals("block")).isTrue();
	}
}
