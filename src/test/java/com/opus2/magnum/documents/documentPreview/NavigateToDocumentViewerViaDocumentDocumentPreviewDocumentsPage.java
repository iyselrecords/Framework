package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class NavigateToDocumentViewerViaDocumentDocumentPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps preview;
		
	@Given("there is a Document loaded in the Document_Preview")
	public void givenThereIsADocumentLoadedInTheDocument_Preview(){
		assertThat(preview.docuementPreview().equals("block")).isTrue();
	}
	
	@When("the user clicks the Document in the Document_Preview")
	public void whenTheUserClicksTheDocumentInTheDocument_Preview(){
		preview.documentPreview();
	}
	
	@Then("the user must be navigated to Document_Viewer")
	public void thenTheUserMustBeNavigatedToTheDocument_Viewer(){
		assertThat(preview.assertDIP().equals("TDIP")).isTrue();  
	}
}