package com.opus2.magnum.documents.bulkDocReplace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseBulkReplacementDialogViaXButtonDocumentsPage{
	@Steps
	BulkReplaceSteps action;
	
	@Given("the X_Button is visible on the Bulk_Replacement_Dialog")	
	public void givenTheClose_ButtonIsVisibleOnTheBulk_Replacement_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@When("the user clicks the X_Button on the Bulk_Replacement_Dialog")	
	public void whenTheUserClicksTheX_ButtonOnTheBulk_Replacement_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Bulk_Replacement_Dialog must close via the X_Button")	
	public void thenTheBulk_Replacement_DialogMustCloseViaTheX_Button(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
}