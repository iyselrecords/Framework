package com.opus2.magnum.documents.autolink;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyAutolinkDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	AutolinkSteps action;
	
	@Given("the Autolink_Dialog is open on the Documents_Page")    
    public void givenTheAutolink_DialogIsOpenOnTheDocuments_Page(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("the user is viewing the Autolink_Dialog")	
	public void whenTheUserIsViewingTheAutolink_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Autolink_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void whenTheAutolink_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Autolink_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheAutolink_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}