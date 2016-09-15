package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class ViewDocumentOnPreviewPane {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user adds Document_Source $document")
	public void userAddTypesChronologyEventDetails(String document){
		newEntry.previewDocument(document);
	}
	
	@When("clicks Document to Preview")
	public void andClicksDocumentToPreview(){
		newEntry.preview();
	}
	
	@Then("Preview_Dialog should load Document")
	public void thenPreviewDialogShouldLoadDocument(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
}
