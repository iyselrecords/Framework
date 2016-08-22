package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class LoadDocumentToPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps preview;
	
	@Given("there is a Document visible in the Document_index")
	public void givenThereIsADocumentVisibleInTheIndex(){
		assertThat(preview.getDocument().isDisplayed()).isTrue();
	}
	
	@When("a user clicks the Document_Title")	
	public void theUserClicksTheDocument_Title(){
		preview.preview(); 	 
	}
	
	@Then("the Document must load to the Document_Preview")
	public void thenTheDocumentMustLoadToTheDocument_Preview(){
		assertThat(preview.docuementPreview().equals("block")).isTrue();
	}
}