package com.opus2.magnum.documents.bulkDocReplace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseBulkReplaceDialogViaCloseButtonDocumentsPage{
	@Steps
	BulkReplaceSteps bulkReplace;
	
	@Given("the Close_Button is visible on the Bulk_Replacement_Dialog")
	public void givenTheClose_ButtonIsVisibleOnTheBulk_Replacement_Dialog(){
		assertThat(bulkReplace.closeButton().isDisplayed()).isTrue();  
	}
	
	@When("the user clicks the Close_Button on the Bulk_Replacement_Dialog")
	public void whenTheUserClicksTheClose_ButtonOnTheBulk_Replacement_Dialog(){
		bulkReplace.closeDialog(); 
	}
	
	@Then("the Bulk_Replacement_Dialog must close via the Close_Button")
	public void thenTheBulk_Replacement_DialogMustCloseViaTheClose_Button(){
		assertThat(bulkReplace.notVisible().equals("none")).isTrue(); 
	}
}