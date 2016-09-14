package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class AddDescriptionToNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user adds Description $desc")
	public void whenUserAddsEntryDescription(String desc){
		newEntry.addDescription(desc);
	}
	
	@Then("Description is added to Chronology_Entry")
	public void thenTagIsAddedToChronologyEntry(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
