package com.opus2.magnum.chronology;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class FindChronologyEntry {
	@Steps
	ChronologySteps chron;
	
	@Given("the Find_Chronology_Search_Input is visible")
	public void givenTheFindChronologySearchInputIsVisible(){
		assertThat(chron.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user input Entry_Description")
	public void whenUserInputEntryDescription(){
		chron.findEntry();
	}
	
	@Then("Chronology_Entry is visible")
	public void thenChronologyEntryIsVisible(){
		assertThat(chron.assertDIP().equals("TDIP")).isTrue();
	}
}
