package com.opus2.magnum.chronology.filter;

import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;

public class FilterEntriesByDate {
	@Steps
	ChronologyFilterSteps entry;

	@When("user selects Date_Option $option and inputs date")
	public void whenUserSelectsDateOptionOnAndInputsDate(String option){
		entry.dateOption(option);
	}
	
	@Then("Chronology_Entries $option that date should display")
	public void thenChronologyEntriesOnThatDateShouldDisplay(String option){
		assertThat(entry.assertDIP().equals("TDIP")).isTrue();
	}

	@Then("Chronology_Entries between Date $option should display")
	public void thenChronologyEntriesBeforeThatDateShouldDisplay(String option){
		assertThat(entry.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("Chronology_Entries displays entries within Today's Date")
    public void thenChronologyEntriesDisplaysEntriesWithinTodaysDate(){
        assertThat(entry.assertDIP().equals("TDIP")).isTrue();
        entry.openFilter();
        Util.pause(3);
    }
}
