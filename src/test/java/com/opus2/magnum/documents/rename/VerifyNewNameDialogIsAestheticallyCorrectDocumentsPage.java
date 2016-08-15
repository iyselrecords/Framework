package com.opus2.magnum.documents.rename;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyNewNameDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	RenameSteps rename;
	
	@Given("the New_Name_Dialog is open on the Documents_Page")
	public void givenTheNew_Name_DialogIsOpenOnTheDocuments_Page(){
		assertThat(rename.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the New_Name_Dialog")
    public void whenTheUserIsViewingTheNew_Name_Dialog(){
		assertThat(rename.assertDIP().equals("TDIP")).isTrue();
    }
	
	@Then("the New_Name_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheNew_Name_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(rename.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the New_Name_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheNew_Name_Dialog(){
		 
	}
}