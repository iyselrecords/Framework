package com.opus2.magnum.documents.chronology;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyAddToChronologyDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	AddToChronologySteps action;
	
	@Given("the Add_To_Chronology_Dialog is open on the Documents_Page")  
    public void givenTheAdd_To_Chronology_DialogIsOpenOnTheDocuments_Page(){
        assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
    }
	
	@When("the user is viewing the Add_To_Chronology_Dialog")   
    public void whenTheUserIsViewingTheAdd_To_Chronology_Dialog(){
        assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
    }
	
	@Then("the Add_To_Chronology_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void thenTheAdd_To_Chronology_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Add_To_Chronology_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheAdd_To_Chronology_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
}