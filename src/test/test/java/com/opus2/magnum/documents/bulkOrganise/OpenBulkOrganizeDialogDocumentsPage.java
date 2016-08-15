package com.opus2.magnum.documents.bulkOrganise;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenBulkOrganizeDialogDocumentsPage{
	@Steps
	BulkOrganiseSteps action;
		
	@Given("the Bulk_Organise_Option is visible in the Right_Click_Menu")	
	public void givenTheBulk_Organise_OptionIsVisibleInTheRight_Click_Menu(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@When("the user clicks the Bulk_Organise_Option")	
	public void whenTheUserClicksTheBulk_Organise_Option(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Bulk_Organsie_Dialog must open")	
	public void thenTheBulk_Organsie_DialogMustOpen(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
}