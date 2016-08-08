package com.opus2.magnum.home.recentDocuments;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import com.opus2.magnum.navigate.RecentDocumentsSteps;
public class ViewRecentDocumentInPreviewDialogHomePage{
	@Steps
	RecentDocumentsSteps renDocs;
	
	@Given("there is a <Document> visible in the Recent_Documents section")	
	public void givenThereIsADocumentVisibleInTheRecent_DocumentsSection(String Document){
		WebElement doc = renDocs.documentIsVisible(Document);
		assertThat(doc.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Document_Title")
	public void whenTheUserClicksTheDocument_Title(String Document_Title){
		renDocs.clickDocument(Document_Title);
	}
	
	@Then("the <Preview_Dialog> must open via the <Document_Title>")
	public void thenThePreview_DialogMustOpenViaTheTranscriptTitle(String Preview_Dialog, String Document_Title){
		WebElement previewDialog = renDocs.previewDialogVisible();
		assertThat(previewDialog.isDisplayed()).isTrue();
	}
	
	@Then("the correct <Document> must be loaded in the <Preview_Dialog>")
	public void thenTheCorrectDocumentMustBeLoadedInThePreview_Dialog(String Document, String Preview_Dialog){
		String dip = renDocs.assertDIP();
		assertThat(dip.equals("TestDesignInProgress")).isTrue();
	}
	
	@Then("the <Preview_Dialog_Title> must equal the <Document_Title>")
    public void Document(String Preview_Dialog_Title, String Document_Title){
		WebElement previewHeader = renDocs.previewDialog();
		assertThat(previewHeader.getText().equals(Document_Title.toUpperCase())).isTrue();
    }
}