package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class LoadNativeDocumentToDocumentPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps preview;

	@Given("there is a Native_Document visible in the Document_index")
	public void givenThereIsANative_DocumentVisibleInTheDocument_index(){
		assertThat(preview.getNativeDocument().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Native_Document_Title")
	public void whenTheUserClicksTheNative_Document_Title(){
		preview.nativeDocument();
	}
	
	@Then("the Native_Document must load to the Document_Preview")
	public void thenTheNative_DocumentMustLoadToTheDocument_Preview(){
		assertThat(preview.docuementPreview().equals("block")).isTrue();
	}
}