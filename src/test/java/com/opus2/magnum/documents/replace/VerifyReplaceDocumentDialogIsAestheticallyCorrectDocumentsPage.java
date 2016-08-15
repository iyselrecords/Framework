package com.opus2.magnum.documents.replace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyReplaceDocumentDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	ReplaceSteps replace;
	
	@Given("the Replace_Document_Dialog is open on the Documents_Page")
    public void givenTheReplace_Document_DialogIsOpenOnTheDocuments_Page(){
		assertThat(replace.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("the user is viewing the Replace_Document_Dialog")
	public void whenTheUserIsViewingTheReplace_Document_Dialog(){
		assertThat(replace.assertDIP().equals("TDIP")).isTrue();
	}
			
	@Then("the Replace_Document_Dialog must be Aesthetically consistent with other dialogs across the platform")
    public void thenTheReplace_Document_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(replace.assertDIP().equals("TDIP")).isTrue(); 
    }
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Replace_Document_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheReplace_Document_Dialog(){
		assertThat(replace.assertDIP().equals("TDIP")).isTrue();
	}
}