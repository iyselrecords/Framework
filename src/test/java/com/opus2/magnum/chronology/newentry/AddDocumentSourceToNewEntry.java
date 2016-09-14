package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class AddDocumentSourceToNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user adds Document Source $document")
	public void userAddTypesChronologyEventDetails(String document){
		newEntry.addSource(document);
	}
	
	@Then("Source is linked to New_Entry")
	public void thenSourceIsLinkedToNewEntry(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
