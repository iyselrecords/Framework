package com.opus2.magnum.home.newWorkspace;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class CloseStartANewWorkspaceDialogViaCancelButtonHomePage{
	@Steps
	NewWorkspaceSteps nwks;
	
	@Given("the Cancel_Button is visible on the Start_A_New_Workspace_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheStart_A_New_Workspace_Dialog(){
		assertThat(nwks.cancelButton().isDisplayed()).isTrue();
	}

	@When("the user clicks the Cancel_Button on the Start_A_New_Workspace_Dialog")
	public void whenTheUserClicksTheCancel_ButtonOnTheStart_A_New_Workspace_Dialog(){
		nwks.closeDialog();
	}
	
	@Then("the Start_A_New_Workspace_Dialog must close via the Cancel_Button")
	public void thenTheStart_A_New_Workspace_DialogMustCloseViaTheCancel_Button(){
		assertThat(nwks.notVisible().equals("none")).isTrue();
	}
}