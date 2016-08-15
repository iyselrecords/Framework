package com.opus2.magnum.documents.bulkDocReplace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyBulkReplacementDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	BulkReplaceSteps action;
	
	@Given("the Bulk_Replacement_Dialog is open on the Documents_Page")     
   	public void givenTheBulk_Replacement_DialogIsOpenOnTheDocuments_Page(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
    }
	
	@When("the user is viewing the Bulk_Replacement_Dialog")	
	public void whenTheUserIsViewingTheBulk_Replacement_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();  
	}
	
	@Then("the Bulk_Replacement_Dialog must be Aesthetically consistent with other dialogs across the platform")    
    public void thenTheBulk_Replacement_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();  
    }
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Bulk_Replacement_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheBulk_Replacement_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();  
	}
}