package com.opus2.magnum.home.recentDocuments;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class ViewRecentDocumentInPreviewDialogHomePage{
	@Steps
	RecentDocumentsSteps renDocs;
	
	@Given("there is a Document visible in the Recent_Documents section")	
	public void givenThereIsADocumentVisibleInTheRecent_DocumentsSection(){
		assertThat(renDocs.targetDocument().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Document_Title")
	public void whenTheUserClicksTheDocument_Title(){
		renDocs.previewDocument();
	}
	
	@Then("the Preview_Dialog must open via the Document_Title")
	public void thenThePreview_DialogMustOpenViaTheTranscriptTitle(){
		assertThat(renDocs.previewDialog().equals("block")).isTrue();
	}
	
	@Then("the correct Document must be loaded in the Preview_Dialog")
	public void thenTheCorrectDocumentMustBeLoadedInThePreview_Dialog(){
		assertThat(renDocs.previewDialogTitle().equals(renDocs.targetDocument().getText())).isTrue();
	}
	
	@Then("the Preview_Dialog_Title must equal the Document_Title")
    public void thenThePreview_Dialog_TitleMustEqualTheDocument_Title(){
		assertThat(renDocs.previewDialogTitle().equals(renDocs.targetDocument().getText())).isTrue();
    }
}