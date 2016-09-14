package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class AddTagToNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user add Tag to Chronology_Details")
	public void userAddTagChronologyEventDetails(){
		newEntry.addTag();
	}
	
	@Then("Tag is added to Chronology_Entry")
	public void thenTagIsAddedToChronologyEntry(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
