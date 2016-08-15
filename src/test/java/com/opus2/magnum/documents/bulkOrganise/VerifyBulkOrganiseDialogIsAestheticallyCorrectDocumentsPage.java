package com.opus2.magnum.documents.bulkOrganise;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyBulkOrganiseDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	BulkOrganiseSteps action;

	@Given("the Bulk_Organize_Dialog is open on the Documents_Page")
	public void givenTheBulk_Organize_DialogIsOpenOnTheDocuments_Page(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@When("the user is viewing the Bulk_Organize_Dialog")
	public void whenTheUserIsViewingTheBulk_Organize_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Bulk_Organize_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void whenTheBulk_Organize_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Bulk_Organize_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheBulk_Organize_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
}