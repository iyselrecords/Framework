package com.opus2.magnum.home.newWorkspace;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class VerifyNewWorkspaceDialogIsAestheticallyCorrectDocumentsPage{
    @Steps
    NewWorkspaceSteps nwks;
  
    @Given("the New_Workspace_Dialog is open on the Documents_Page")
    public void givenTheNew_Workspace_DialogIsOpenOnTheDocuments_Page(){
    	assertThat(nwks.assertDIP().equals("TDIP")).isTrue();
    }
    
    @When("the user is viewing the New_Workspace_Dialog")
    public void whenTheUserIsViewingTheNew_Workspace_Dialog(){
    	assertThat(nwks.assertDIP().equals("TDIP")).isTrue();
    }
    
    @Then("the New_Workspace_Dialog must be aesthetically consistent with other dialogs across the platform")
    public void thenTheNew_Workspace_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
    	assertThat(nwks.assertDIP().equals("TDIP")).isTrue();
    }
    
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the New_Workspace_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheNew_Workspace_Dialog(){
		assertThat(nwks.assertDIP().equals("TDIP")).isTrue();
	}
}