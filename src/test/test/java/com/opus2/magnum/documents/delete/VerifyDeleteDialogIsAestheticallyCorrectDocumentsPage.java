package com.opus2.magnum.documents.delete;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyDeleteDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	DeletePopupSteps action;

	@Given("the Delete_Dialog is open on the Documents_Page")
    public void givenTheDelete_DialogIsOpenOnTheDocuments_Page(){
        assertThat(action.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("the user is viewing the Delete_Dialog")
	public void whenTheUserIsViewingTheDelete_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Delete_Dialog must be aesthetically consistent with other dialogs across the platform")
	public void thenTheDelete_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names on the Delete_Dialog must be correct")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheDelete_DialogMustBeCorrect(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}