package com.opus2.magnum.documents.access;
import org.jbehave.core.annotations.*;
public class CloseAccessDialogViaCancelButtonDocumentLevelDocumentsPage{

 @Then("the <Access_Dialog> must close via the <Cancel_Button>")	
 public void thenTheAccess_DialogMustCloseViaTheCancel_Button(@Named("Access_Dialog") String Access_Dialog, @Named("Cancel_Button") String Cancel_Button){
	 
 
 }
	
 @When("the user clicks  the <Cancel_Button> on the <Access_Dialog>")	
 public void whenTheUserClicksTheCancel_ButtonoOnTheAccess_Dialog(@Named("Cancel_Button") String Cancel_Button, @Named("Access_Dialog") String Access_Dialog){
		
	//To do 

  }
 
 @Given("the <Cancel_Button> is visible on the <Access_Dialog>")
 @Pending
 public void givenTheCancel_ButtonIsVisibleOnTheAccess_Dialog(@Named("Cancel_Button") String Cancel_Button, @Named("Access_Dialog") String Access_Dialog){
		 
	//To do 
  
 }
 
}