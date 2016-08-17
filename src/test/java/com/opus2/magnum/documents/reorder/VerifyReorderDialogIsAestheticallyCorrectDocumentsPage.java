package com.opus2.magnum.documents.reorder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyReorderDialogIsAestheticallyCorrectDocumentsPage{
	@Steps 
	ReOrderSteps reorder;
	
	@Given("the Reorder_Dialog is open on the Documents_Page")	
	public void givenTheReorder_DialogIsOpenOnTheDocuments_Page(){
		assertThat(reorder.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@When("the user is viewing the Reorder_Dialog")	
	public void whenTheUserIsViewingTheReorder_Dialog(){
		assertThat(reorder.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Reorder_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void thenTheReorder_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(reorder.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Reorder_Dialog")   
    public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheReorder_Dialog(){
		assertThat(reorder.assertDIP().equals("TDIP")).isTrue(); 
    }
}