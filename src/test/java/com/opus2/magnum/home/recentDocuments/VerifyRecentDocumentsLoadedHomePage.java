package com.opus2.magnum.home.recentDocuments;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyRecentDocumentsLoadedHomePage{
	@Steps
	RecentDocumentsSteps renDocs;
	
	@Given("the Recent_Documents section is visible on the Home Page")
	public void givenTheRecent_DocumentsSectionIsVisibleOnTheHome_Page(){
		assertThat(renDocs.recDocSection().isDisplayed()).isTrue();
	}
	
	@When("the Recent_Documents section has loaded")
	public void whenTheRecent_DocumentsSectionHasLoaded(){
		assertThat(renDocs.docHasLoaded().isDisplayed()).isTrue();
	}
	
	@Then("the Target Document must be visible")
	public void thenTheTarget_DocumentMustBeVisible(){
		assertThat(renDocs.targetDocument().isDisplayed()).isTrue();
	}
	
	@Then("the Target Transcript must be visible")
	public void thenTheTarget_TranscriptMustBeVisible(){
		assertThat(renDocs.targetTranscript().isDisplayed()).isTrue();
	}
}