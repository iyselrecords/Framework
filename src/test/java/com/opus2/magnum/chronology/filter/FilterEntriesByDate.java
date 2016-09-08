package com.opus2.magnum.chronology.filter;

import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class FilterEntriesByDate {
	@Steps
	ChronologyFilterSteps filter;

	@When("user selects Date_Option_On and inputs date")
	public void whenUserSelectsDateOptionOnAndInputsDate(){
		filter.dateOption(ChronologyFilter.DATE_OPTION_ON);
	}
	
	@Then("Chronology_Entries On that date should display")
	public void thenChronologyEntriesOnThatDateShouldDisplay(){
		//assertThat(filter.onDate().equals(ChronologyFilter.FROM_DATE)).isTrue();
	}
	
	
	@When("user selects Date_Option_Before and inputs date")
	public void whenUserSelectsDateOptionBeforeAndInputsDate(){
		filter.dateOption(ChronologyFilter.DATE_OPTION_BEFORE);
	}
	@Then("Chronology_Entries Before that date should display")
	public void thenChronologyEntriesBeforeThatDateShouldDisplay(){
		assertThat(filter.assertDIP().equals("TDIP")).isTrue();
	}
	
	
	@When("user selects Date_Option_After and inputs date")
	public void whenUserSelectsDateOptionAfterAndInputsDate(){
		filter.dateOption(ChronologyFilter.DATE_OPTION_AFTER);
	}
	@Then("Chronology_Entries After that date should display")
	public void thenChronologyEntriesAfterThatDateShouldDisplay(){
		assertThat(filter.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user selects Date_Option_Range and inputs date")
	public void whenUserSelectsDateOptionRangeAndInputsDate(){
		filter.dateOption(ChronologyFilter.DATE_OPTION_RANGE);
	}
	@Then("Chronology_Entries between Date_Range should display")
	public void thenChronologyEntriesBetweenDateRangeShouldDisplay(){
		assertThat(filter.assertDIP().equals("TDIP")).isTrue();
	}
	
}
