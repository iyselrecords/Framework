package com.opus2.magnum.home.recentDocuments;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class ViewRecentTranscriptInPreviewDialogHomePage{
	@Steps
	RecentDocumentsSteps renDocs;
	
	@Given("there is a Transcript visible in the Recent_Documents section")	
	public void givenThereIsATranscriptVisibleInTheRecent_DocumentsSection(){
		assertThat(renDocs.targetTranscript().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Transcript_Title") 
    public void whenTheUserClicksTheTranscript_Title(){
		renDocs.previewDocument();
    }
	
	@Then("the Preview_Dialog must open via the Transcript_Title")    
    public void thenThePreview_DialogMustOpenViaTheTranscript_Title(){
		assertThat(renDocs.previewDialog().isDisplayed()).isTrue();
    }
	
	@Then("the correct Transcript must be loaded in the Preview_Dialog")    
    public void thenTheCorrectTranscriptMustBeLoadedInThePreview_Dialog(){
		assertThat(renDocs.previewDialogTitle().equals(renDocs.targetTranscript().getText())).isTrue();
    }
	
	@Then("the Preview_Dialog_Title must equal the Transcript_Title")	
	public void thenThePreview_Dialog_TitleMustEqualTheTranscript_Title(){
		assertThat(renDocs.previewDialogTitle().equals(renDocs.targetTranscript().getText())).isTrue();
	}
}