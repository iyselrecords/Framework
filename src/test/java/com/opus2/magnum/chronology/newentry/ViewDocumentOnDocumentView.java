package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class ViewDocumentOnDocumentView {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@Given("Preview_Dialog is open")
	public void givenUserPreviewDialogIsOpen(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user clicks on Document")
	public void whenUserClicksOnDocument(){
		newEntry.document();
	}
	
	@Then("Document should open in a new tab")
	public void thenDocumentShouldOpenInANewTab(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
