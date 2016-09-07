package com.opus2.magnum.chronology;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class SelectChronologyList {
	@Steps
	ChronologySteps dip;
	
	@Given("the Chronologies_Dropdown_List is visible")
    public void givenTheChronologiesDropdownListIsVisible(){
        assertThat(dip.chronologyDropdown().isDisplayed()).isTrue();
    }
    
    @When("user selects Chronologies_List_Option")
    public void whenUserSelectChronologiesList(){
        dip.selectChronology();
    }
    
    @Then("Chronologies_List_Option should display Chronology_Entries")
    public void thenChronologiesListOptionShouldDisplayChronologyEntries(){
        assertThat(dip.selectedChron().equals(Chronology.CHRON)).isTrue();
    }
}
