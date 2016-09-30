package com.opus2.magnum.chronology.filter;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class FilterEntriesByStatus {
	@Steps
	ChronologyFilterSteps entry;

	@When("user selects Status_Option $option")
	@Alias("selects Status_Option $option")
	public void whenUserSelectsStatusOptionDisputed(String option){
		entry.statusOption(option);
	}
	
	@Then("Chronology_Entries with $option Status should display")
	public void thenChronologyEntriesWithDisputedStatusShouldDisplay(String option){
		assertThat(entry.assertDIP().equals("TDIP")).isTrue();
	}
}
