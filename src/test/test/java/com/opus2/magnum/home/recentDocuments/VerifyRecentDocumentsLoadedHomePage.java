package com.opus2.magnum.home.recentDocuments;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import com.opus2.magnum.navigate.RecentDocumentsSteps;
public class VerifyRecentDocumentsLoadedHomePage{
	@Steps
	RecentDocumentsSteps renDocs;
	
	@Given("the Recent_Documents section is visible on the Home Page")
	public void givenTheRecent_DocumentsSectionIsVisibleOnTheHome_Page(){
		WebElement header = renDocs.recentDocumentHeader();
		assertThat(header.isDisplayed()).isTrue();
	}
	
	@When("the Recent_Documents section has loaded")
	public void whenTheRecent_DocumentsSectionHasLoaded(){
		WebElement doc = renDocs.loadedDocuments();
		assertThat(doc.isDisplayed()).isTrue();
	}
	
	@Then("the Target Document must be visible")
	public void thenTheTarget_DocumentMustBeVisible(){
		WebElement doc = renDocs.documentIsVisible();
		assertThat(doc.isDisplayed()).isTrue();
	}
	
	@Then("the Target Transcript must be visible")
	public void thenTheTarget_TranscriptMustBeVisible(){
		WebElement doc = renDocs.transcriptIsVisible();
		assertThat(doc.isDisplayed()).isTrue();
	}

}