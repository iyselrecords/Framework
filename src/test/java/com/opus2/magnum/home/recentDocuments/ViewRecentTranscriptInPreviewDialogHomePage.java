package com.opus2.magnum.home.recentDocuments;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import com.opus2.magnum.navigate.RecentDocumentsSteps;
public class ViewRecentTranscriptInPreviewDialogHomePage{
	@Steps
	RecentDocumentsSteps renDocs;
	
	@Given("there is a <Transcript> visible in the Recent_Documents section")	
	public void givenThereIsATranscriptVisibleInTheRecent_DocumentsSection(String Transcript){
		WebElement doc = renDocs.documentIsVisible(Transcript);
		assertThat(doc.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the <Transcript_Title>") 
    public void whenTheUserClicksTheTranscript_Title(String Transcript_Title){
		renDocs.clickDocument(Transcript_Title);
    }
	
	@Then("the <Preview_Dialog> must open via the <Transcript_Title>")    
    public void thenThePreview_DialogMustOpenViaTheTranscript_Title(String Preview_Dialog, String Transcript_Title){
		WebElement previewDialog = renDocs.previewDialogVisible();
		assertThat(previewDialog.isDisplayed()).isTrue();
    }
	
	@Then("the correct <Transcript> must be loaded in the <Preview_Dialog>")    
    public void thenTheCorrectTranscriptMustBeLoadedInThePreview_Dialog(String Transcript, String Preview_Dialog){
		String dip = renDocs.assertDIP();
		assertThat(dip.equals("TestDesignInProgress")).isTrue();
    }
	
	@Then("the <Preview_Dialog_Title> must equal the <Transcript_Title>")	
	public void thenThePreview_Dialog_TitleMustEqualTheTranscript_Title(String Preview_Dialog_Title, String Transcript_Title){
		WebElement previewHeader = renDocs.previewDialog();
		assertThat(previewHeader.getText().equals(Transcript_Title.toUpperCase())).isTrue();
	}	
}