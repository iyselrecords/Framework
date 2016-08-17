package com.opus2.magnum.documents.rotate;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyPageRotationDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	PageRotationSteps page;
		
	@Given("the Page_Rotation_Dialog is open on the Documents_Page")	
	public void givenThePage_Rotation_DialogIsOpenOnTheDocuments_Page(){
		assertThat(page.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the Page_Rotation_Dialog")   
    public void whenTheUserIsViewingThePage_Rotation_Dialog(){
		assertThat(page.assertDIP().equals("TDIP")).isTrue();
    }
	
	@Then("the Page_Rotation_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void thenThePage_Rotation_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(page.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Page_Rotation_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnThePage_Rotation_Dialog(){
		assertThat(page.assertDIP().equals("TDIP")).isTrue(); 
	}
}