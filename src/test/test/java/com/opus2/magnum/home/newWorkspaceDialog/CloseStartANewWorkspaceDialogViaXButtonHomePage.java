package com.opus2.magnum.home.newWorkspaceDialog;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;
public class CloseStartANewWorkspaceDialogViaXButtonHomePage{
	@Steps
	NewWorkspaceSteps nwks;
	
	@Given("the X_Button is visible on the Start_A_New_Workspace_Dialog")	
	public void givenTheX_ButtonIsVisibleOnTheStart_A_New_Workspace_Dialog(){
		WebElement xBtn = nwks.dialogXBtn();
		assertThat(xBtn.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Start_A_New_Workspace_Dialog")
	public void whenTheUserClicksTheX_ButtonOnTheStart_A_New_Workspace_Dialog(){
		nwks.closeDialogXBtn();
	}
	
	@Then("the <Start_A_New_Workspace_Dialog> must close via the <X_Button>")
    public void thenTheStart_A_New_Workspace_DialogMustCloseViaTheX_Button(){	
		WebElement dialog = nwks.getDialog();
		assertThat(dialog.isDisplayed()).isFalse();
    }
}