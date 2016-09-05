package com.opus2.magnum.chronology;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

public class ResetEntryList {
	@Steps
	ChronologySteps user;
	
	@Given("the Reset_Button is visible")
	public void givenTheFindChronologySearchInputIsVisible(){
		assertThat(Util.getElement(Chronology.RESET).isDisplayed()).isTrue();
	}
	
	@When("user clicks the Reset_Button")
	public void whenUserClicksTheResetButton(){
		user.reset();
	}
	
	@Then("Chronology_Entries should set to default")
	public void thenChronologyEntriesShouldSetToDefault(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
	}
}
