package com.opus2.magnum.documents.insert;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseInsertDocumentDialogViaCancelButtonDocumentsPage{
	@Steps
	InsertDocumentSteps insert;
	
	@Given("the Cancel_Button is visible on the Insert_Document_Dialog")	
	public void givenTheCancel_ButtonIsVisibleOnTheInsert_Document_Dialog(){
		assertThat(insert.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Insert_Document_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheInsert_Document_Dialog(){		  	 
		insert.closeDialog();
	}
	
	@Then("the Insert_Document_Dialog must close via the Cancel_Button")	 
	public void thenTheInsert_Document_DialoggMustCloseViaTheCancel_Button() {
		assertThat(insert.notVisible().equals("none")).isTrue();
	}
}