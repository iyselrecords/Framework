package com.opus2.magnum.documents.insert;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseInserDocumentDialogViaXButtonDocumentsPage{
	@Steps
	InsertDocumentSteps insert;
	
	@Given("the X_Button is visible on the Insert_Document_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheInsert_Document_Dialog(){
		assertThat(insert.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Insert_Document_Dialog")	
	public void whenTheUserClicksTheX_ButtonOnTheInsert_Document_Dialog(){
		insert.closeByXButton();	 
	}
	@Then("the Insert_Document_Dialog must close via the  X_Button")
	public void thenTheInsert_Document_DialogMustClose() {
		assertThat(insert.notVisible().equals("none")).isTrue(); 
	}
}