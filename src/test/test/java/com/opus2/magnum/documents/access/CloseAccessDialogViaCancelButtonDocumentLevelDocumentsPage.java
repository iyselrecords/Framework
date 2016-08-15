package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.dialog.access.Access;
public class CloseAccessDialogViaCancelButtonDocumentLevelDocumentsPage{
	@Steps
    DocsAccessSteps menu;
	Access access;
	
	@Given("the Cancel_Button is visible on the Access_Dialog")
 	public void givenTheCancel_ButtonIsVisibleOnTheAccess_Dialog(){
		assertThat(access.hasButton().isDisplayed()).isTrue();
 	}
 
 	@When("the user clicks  the Cancel_Button on the Access_Dialog")	
 	public void whenTheUserClicksTheCancel_ButtonoOnTheAccess_Dialog(){
 		menu.closeDialog();
  	}
 	
 	@Then("the Access_Dialog must close via the Cancel_Button")	
 	public void thenTheAccess_DialogMustCloseViaTheCancel_Button(){
 		assertThat(access.dialog().isDisplayed()).isFalse();
 	}
}