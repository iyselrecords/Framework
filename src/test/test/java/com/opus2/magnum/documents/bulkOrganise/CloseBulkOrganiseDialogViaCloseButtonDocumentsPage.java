package com.opus2.magnum.documents.bulkOrganise;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class CloseBulkOrganiseDialogViaCloseButtonDocumentsPage{
	@Steps
	BulkOrganiseSteps action;
	 
	 @Given("the Close_Button is visible on the Bulk_Organsie_Dialog")	 
	 public void givenTheClose_ButtonIsVisibleOnTheBulk_Organsie_Dialog(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	 }
	 
	 @When("the user clicks the Close_Button on the Bulk_Organsie_Dialog")	 
	 public void whenTheUserClicksTheClose_ButtonOnTheBulk_Organsie_Dialog(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	 }
	 
	 @Then("the Bulk_Organsie_Dialog must close via the Close_Button")	 
	 public void thenTheBulkOrganiseDialogMustCloseViaTheClose_Button(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	 }
}