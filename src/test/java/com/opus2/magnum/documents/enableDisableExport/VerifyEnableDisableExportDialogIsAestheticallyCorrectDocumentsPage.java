package com.opus2.magnum.documents.enableDisableExport;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyEnableDisableExportDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	EnableDisableExportSteps eDExp;
	
	@Given("the EnableDisable_Export_Dialog is open on the Documents_Page")
	public void givenTheEnableDisable_Export_DialogIsOpenOnTheDocuments_Page(){
		assertThat(eDExp.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the EnableDisable_Export_Dialog")
    public void whenTheUserIsViewingTheEnableDisable_Export_Dialog(){
		assertThat(eDExp.assertDIP().equals("TDIP")).isTrue();
    }
	
	@Then("the EnableDisable_Export_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheEnableDisable_Export_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(eDExp.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the EnableDisable_Export_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheEnableDisable_Export_Dialog(){
		assertThat(eDExp.assertDIP().equals("TDIP")).isTrue();
	}
}