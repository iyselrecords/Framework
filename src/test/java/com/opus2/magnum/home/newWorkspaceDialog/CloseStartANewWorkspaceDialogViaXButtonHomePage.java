package com.opus2.magnum.home.newWorkspaceDialog;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class CloseStartANewWorkspaceDialogViaXButtonHomePage{
	@Steps
	NewWorkspaceSteps nwks;
	
	@Given("the X_Button is visible on the Start_A_New_Workspace_Dialog")	
	public void givenTheX_ButtonIsVisibleOnTheStart_A_New_Workspace_Dialog(){
		assertThat(nwks.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Start_A_New_Workspace_Dialog")
	public void whenTheUserClicksTheX_ButtonOnTheStart_A_New_Workspace_Dialog(){
		nwks.closeByXButton();
	}
	
	@Then("the Start_A_New_Workspace_Dialog must close via the X_Button")
    public void thenTheStart_A_New_Workspace_DialogMustCloseViaTheX_Button(){
		assertThat(nwks.notVisible().equals("none")).isTrue();
    }
}