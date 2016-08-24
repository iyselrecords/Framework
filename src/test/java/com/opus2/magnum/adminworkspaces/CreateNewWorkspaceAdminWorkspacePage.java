package com.opus2.magnum.adminworkspaces;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.core.Configuration;
import com.opus2.home.manageuserandworkspace.AdminWorkspace;
public class CreateNewWorkspaceAdminWorkspacePage{
	@Steps
	AdminWorkspaceSteps user;
		
	@Given("the Workspaces_Tab is visible")
	public void givenTheWorkspaces_TabIsVisible(){
		assertThat( user.workspacesTab().isDisplayed()).isTrue();
	}
	
	@When("the user clicks Workspaces_Tab")
	public void whenTheUserClicksWorkspaces_Tab(){
		user.adminWorkspaces();
	}
	
	@Then("the user must be navigated to Admin_Workspaces")
	public void thenTheUserMustBeNavigatedToAdmin_Workspaces(){
		assertThat(user.currentUrl().equals(Configuration.adminWorkspacesUrl)).isTrue();
	}
	
	
	@Given("that a user is present on the Admin_Workspaces page")	
	public void givenThatAUserIsPresentOnTheAdmin_WorkspacesPage(){
		assertThat(user.currentUrl().equals(Configuration.adminWorkspacesUrl)).isTrue();
	}
	
	@Given("Create_A_New_Workspace button is visible")	
	public void givenCreate_A_New_WorkspaceButtonIsVisible(){
		 assertThat(user.createWorkspaceButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks Create_A_New_Workspace button")
	public void whenTheUserClicksCreate_A_New_WorkspaceButton(){
		 user.openDialog();
	}
	
	@Then("Start_A_New_Workspace dialog must be visible")	
	public void thenStart_A_New_WorkspaceDialogMustBeVisible(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
	
	
	
	@Given("the Start_A_New_Workspace dialog is open")	
	public void givenTheStart_A_New_WorkspaceDialogIsOpen(){
		assertThat(user.dialog().equals("block")).isTrue(); 
	}
	
	@Given("the Title_Textbox is visible")	
	public void givenTheTitle_TextboxIsVisible(){
		assertThat(user.inputBox().isDisplayed()).isTrue(); 
	}
	
	@Given("the Description_Textbox is visible")	
	public void givenTheDescription_TextboxIsVisible(){
		assertThat(user.textArea().isDisplayed()).isTrue(); 
	}
	
	@When("the user input Title")	
	public void whenTheUserInputTitle(){
		user.inputTitle();
	}
	
	@When("Description")	
	public void whenDescription(){
		user.inputDescription();
	}
	
	@When("clicks the Create_workspace button")	
	public void whenClicksTheCreate_workspaceButton(){
		user.createWorkspace();
	}
	
	@Then("the new Workspace must be visible on list")	
	public void thenTheNewWorkspaceMustBeVisibleOnList(){
		assertThat(user.newWorkspace().isDisplayed()).isTrue();
		assertThat(user.newWorkspace().getText().equals(AdminWorkspace.WORKSPACE_TITLE));
	}
}