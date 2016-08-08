package com.opus2.magnum.documents.documentPreview;
import org.jbehave.core.annotations.*;
public class LoadDocumentToPreviewDocumentsPage{
	@Then("the <Document> must load to the <Document_Preview>")
	@Pending
	public void thenTheDocumentMustLoadToTheDocument_Preview(@Named("Document") String Document, @Named("Document_Preview") String Document_Preview){
		 //TODO 
	}
	@When("the user clicks  the <Document_Title>")	
	 public void theUserClicksTheDocument_Title(@Named("Document_Title") String Document_Title){
		  //TODO 	 
	  

	}
	@Given("there is a <Document> visible in the <Document_index>")
	@Pending
	public void givenThereIsADocumentVisibleInTheIndex(@Named("Document") String Document, @Named("Document_Index") String Document_Index){
		 //TODO 
	}
}