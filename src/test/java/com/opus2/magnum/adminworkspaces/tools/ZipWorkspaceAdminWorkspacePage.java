package com.opus2.magnum.adminworkspaces.tools;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class ZipWorkspaceAdminWorkspacePage{
	@Steps
	AdminWorkspaceToolsSteps user;
	
	@Given("Zip_Workspace_Dialog is open")	
	public void givenZipWorkspaceDialogIsOpen(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
	
	@Given("Zip_Password_Input box is visible")
	public void givenPassword_InputBoxIsVisible(){
		assertThat(user.input().isDisplayed()).isTrue(); 
	}
	
	@When("user inputs Zip_Password")	
	public void whenUserInputsZipPassword(){
		user.inputPassword();
	}
	
	@Then("Selected_Workspace is downloaded as a Zip_File")
	public void thenSelected_WorkspaceIsDownloadedAsAZipFile(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue(); 
	}
}