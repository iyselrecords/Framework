package com.opus2.magnum.chronology.filter;

import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class FilterEntriesByTags {
	@Steps
	ChronologyFilterSteps entry;

	@When("user selects Tags_Option $tag")
	public void whenUserSelectsDateOptionOnAndInputsDate(String tag){
		entry.tagOption(tag);
	}
	
	@Then("Chronology_Entries tagged with $tag should display")
	public void thenChronologyEntriesTaggedWithTagShouldDisplay(String tag){
		assertThat(entry.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user selects Documents without tags")
    public void whenUserSelectsDocumentsWithoutTags(){
        entry.docWithoutTags();
    }
	
	@Then("Chronology_Entries without tags should display")
    public void thenChronologyEntriesWithoutTagsShouldDisplay(){
        assertThat(entry.assertDIP().equals("TDIP")).isTrue();
    }
}
