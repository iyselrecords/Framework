package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyAccessDialogIsAestheticallyCorrectDocumentsPage{
    @Steps
    DocsAccessSteps menu;
    
	@Given("the Access_Dialog is open on the Documents_Page")
    public void givenTheAccess_DialogIsOpenOnTheDocuments_Page(){
		assertThat(menu.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("the user is viewing the Access_Dialog")	
	public void whenTheUserIsViewingTheAccess_Dialog(){
		assertThat(menu.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Access_Dialog must be aesthetically consistent with other dialogs across the platform")	
	public void thenTheAccess_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(menu.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Access_Dialog")
    public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheAccess_Dialog(){
		assertThat(menu.assertDIP().equals("TDIP")).isTrue();
    }
	
}