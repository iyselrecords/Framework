package com.opus2.magnum.documents.configureStamps;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;
import org.jbehave.core.annotations.*;
public class VerifyConfigureStampsDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	ConfigureStampsSteps action;
	
	@Given("the Configure_Stamps_Dialog is open on the Documents_Page")
	public void givenTheConfigure_Stamps_DialogIsOpenOnTheDocuments_Page(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the Configure_Stamps_Dialog")
	public void whenTheUserIsViewingTheConfigure_Stamps_Dialog(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Configure_Stamps_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheConfigure_Stamps_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Configure_Stamps_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheConfigure_Stamps_Dialog(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}