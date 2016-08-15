package com.opus2.magnum.documents.replace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseReplaceDocumentDialogViaCancelButtonDocumentsPage{
	@Steps
	ReplaceSteps replace;
	
	@Given("the Cancel_Button is visible on the Replace_Document_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheReplace_Document_Dialog(){
		assertThat(replace.cancelButton().isDisplayed()).isTrue();  
	}
	@When("the user clicks the Cancel_Button on the Replace_Document_Dialog")	 
	 public void theUserClicksTheCancel_ButtonOnTheReplace_Document_Dialog(){
		replace.closeDialog();
	}
	@Then("the Replace_Document_Dialog must close via the Cancel_Button")
	public void thenTheReplace_Document_DialogMustCloseViaTheCancel_Button() {
		assertThat(replace.notVisible().equals("none")).isTrue(); 
	}
}