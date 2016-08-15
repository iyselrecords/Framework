package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseAccessDialogViaCancelButtonDocumentLevelDocumentsPage{
	@Steps
    AccessSteps access;
	
	@Given("the Cancel_Button is visible on the Access_Dialog")
 	public void givenTheCancel_ButtonIsVisibleOnTheAccess_Dialog(){
		assertThat(access.cancelButton().isDisplayed()).isTrue();
 	}
 
 	@When("the user clicks  the Cancel_Button on the Access_Dialog")	
 	public void whenTheUserClicksTheCancel_ButtonoOnTheAccess_Dialog(){
 		access.closeDialog();
  	}
 	
 	@Then("the Access_Dialog must close via the Cancel_Button")	
 	public void thenTheAccess_DialogMustCloseViaTheCancel_Button(){
 		assertThat(access.notVisible().equals("none")).isTrue();
 	}
}