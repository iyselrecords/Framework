package com.opus2.magnum.chronology.filter;

import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class FilterEntriesByTypes {
	@Steps
	ChronologyFilterSteps entry;
	
	
	@When("user selects Type_Option $type")
    public void whenUserSelectsTypeOption(String type){
        entry.typeOption(type);
    }
	
	@Then("$type Type Chronology_Entries should display")
    public void thenChronologyEntriesWithTypeShouldDisplay(String type){
        assertThat(entry.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("user selects Custom_Type_Option")
    public void whenUserSelectsCustomTypeOption(){
        entry.customTypeOption();
    }
    
    @Then("Chronology_Entries with Custom_Type_Option should display")
    public void thenChronologyEntriesWithCustomTypeShouldDisplay(){
        assertThat(entry.assertDIP().equals("TDIP")).isTrue();
    }
}
