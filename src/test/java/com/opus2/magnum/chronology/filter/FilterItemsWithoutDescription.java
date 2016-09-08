package com.opus2.magnum.chronology.filter;

import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class FilterItemsWithoutDescription {
	@Steps
	ChronologyFilterSteps filter;
	
	@Given("the Chronology_Filter_Dialog is open")
	public void givenTheChronologyFilterDialogIsOpen(){
		filter.checkFilterIsOpen();
		assertThat(filter.openDialog().equals("block")).isTrue();
	}
	
	@Given("the items without description checkbox is visible")
	public void andTheItemsWithoutDescriptionCheckboxIsVisible(){
		assertThat(filter.iwdCheckbox().isDisplayed()).isTrue();
	}
	
	@When("user clicks the checkbox")
	public void whenUserClicksTheCheckbox(){
		filter.itemsWithoutDescription();
	}
	
	@Then("Chronology_Entries_Without_Description should display")
	public void thenChronologyEntriesWithoutDescriptionShouldDisplay(){
		assertThat(filter.assertDIP().equals("TDIP")).isTrue();
	}
}
