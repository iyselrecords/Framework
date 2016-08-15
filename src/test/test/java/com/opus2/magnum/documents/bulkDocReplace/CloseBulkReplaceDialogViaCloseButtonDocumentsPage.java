package com.opus2.magnum.documents.bulkDocReplace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseBulkReplaceDialogViaCloseButtonDocumentsPage{
	@Steps
	BulkReplaceSteps action;
	
	@Given("the Close_Button is visible on the Bulk_Replacement_Dialog")
	public void givenTheClose_ButtonIsVisibleOnTheBulk_Replacement_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();  
	}
	
	@When("the user clicks the Close_Button on the Bulk_Replacement_Dialog")
	public void whenTheUserClicksTheClose_ButtonOnTheBulk_Replacement_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Bulk_Replacement_Dialog must close via the Close_Button")
	public void thenTheBulk_Replacement_DialogMustCloseViaTheClose_Button(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
}