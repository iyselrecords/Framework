package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class NavigateToDocumentViewerViaNativeDocumentDocumentPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps preview;
	
	@Given("there is a Native_Document loaded in the Document_Preview")
	public void givenThereIsANative_DocumentLoadedInTheDocument_Preview(){
		assertThat(preview.docuementPreview().equals("block")).isTrue();
	}
	
	@When("the user clicks the Native_Document in the Document_Preview")
	public void whenTheUserClicksTheNative_DocumentInTheDocument_Preview(){
		preview.documentPreview(); 
	}
	
	@Then("the user must be navigated to Document_Viewer via the Native_Document")
	public void thenTheUserMustBeNavigatedToDocument_ViewerViaTheNative_Document(){
		assertThat(preview.assertDIP().equals("TDIP")).isTrue();  
	}
}