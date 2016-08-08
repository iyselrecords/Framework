package com.opus2.magnum.home.newWorkspaceDialog;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;
public class CloseStartANewWorkspaceDialogViaCancelButtonHomePage{
	@Steps
	NewWorkspaceSteps nwks;
	
	@Given("the <Cancel_Button> is visible on the Start_A_New_Workspace_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheStart_A_New_Workspace_Dialog(String Cancel_Button){
		WebElement cancelBtn = nwks.dialogBtn(Cancel_Button);
		assertThat(cancelBtn.isDisplayed()).isTrue();
	}

	@When("the user clicks the <Cancel_Button> on the <Start_A_New_Workspace_Dialog>")
	public void whenTheUserClicksTheCancel_ButtonOnTheStart_A_New_Workspace_Dialog(String Cancel_Button, String Start_A_New_Workspace_Dialog){
		nwks.closeDialog(Cancel_Button, Start_A_New_Workspace_Dialog);
	}
	
	@Then("the Start_A_New_Workspace_Dialog must close via the Cancel_Button")
	public void thenTheStart_A_New_Workspace_DialogMustCloseViaTheCancel_Button(){
		WebElement dialog = nwks.getDialog();
		assertThat(dialog.isDisplayed()).isFalse();
	}
}