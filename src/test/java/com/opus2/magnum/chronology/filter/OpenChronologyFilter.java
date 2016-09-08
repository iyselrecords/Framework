package com.opus2.magnum.chronology.filter;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class OpenChronologyFilter {
	@Steps
	ChronologyFilterSteps filter;
	
	@Given("the Filter_Button is visible")
	public void givenTheFilterButtonIsVisible(){
		assertThat(Util.getElement(ChronologyFilter.BUTTON).isDisplayed()).isTrue();
	}
	
	@When("user clicks the Filter_Button")
	public void whenUserClicksTheFilterButton(){
		filter.openFilter();
	}
	
	@Then("Chronology_Filter_Dialog should be visible")
	public void thenChronologyFilterDialogShouldBeVisible(){
		assertThat(Util.getElement(ChronologyFilter.DIALOG)
			.getCssValue("display").equals("block")).isTrue();
	}
}
