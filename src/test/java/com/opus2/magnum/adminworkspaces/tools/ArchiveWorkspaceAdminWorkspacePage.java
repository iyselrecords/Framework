package com.opus2.magnum.adminworkspaces.tools;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ArchiveWorkspaceAdminWorkspacePage {
	@Steps
	AdminWorkspaceToolsSteps user;
		
	@Given("Archive_Workspace_Dialog is open")	
	public void givenArchiveWorkspaceDialogIsOpen(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
	
	@Given("Archive_Password_Input box is visible")
	public void givenPassword_InputBoxIsVisible(){
		assertThat(user.passwordInput().isDisplayed()).isTrue(); 
	}
	
	@When("user inputs Archive_Password")	
	public void whenUserInputsArchivePassword(){
		user.inputPassword();
	}
	
	@When("clicks Apply_Button")	
	public void whenClicksApply_Button(){
		 user.archiveWorkspace();
	}
	
	@Then("achived process starts on Archive_Manager")
	public void thenSelected_WorkspaceIsDeletedFromWorkspaces_List(){
		assertThat(user.archiveManagerStatus().equals("Added for archiving")).isTrue(); 
	}
}
