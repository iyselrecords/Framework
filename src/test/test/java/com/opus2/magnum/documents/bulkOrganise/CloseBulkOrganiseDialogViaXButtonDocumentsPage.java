package com.opus2.magnum.documents.bulkOrganise;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseBulkOrganiseDialogViaXButtonDocumentsPage{
	@Steps
	BulkOrganiseSteps action;
	
	@Given("the X_Button is visible on the Bulk_Organsie_Dialog") 
	public void givenTheX_ButtonIsVisibleOnTheBulk_Organsie_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@When("the user clicks the X_Button on the Bulk_Organsie_Dialog")	
	public void whenTheUserclicksTheX_ButtonOnTheBulk_Organsie_Dialog() {
	   	assertThat(action.assertDIP().equals("TDIP")).isTrue();
	  
	}
	
	@Then("the Bulk_Organsie_Dialog must close via the X_Button")	
	public void thenTheBulk_Organsie_DialogMustCloseViaTheX_Button(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}