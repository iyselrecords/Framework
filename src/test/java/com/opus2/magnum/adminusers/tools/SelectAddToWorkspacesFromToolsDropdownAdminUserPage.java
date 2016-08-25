package com.opus2.magnum.adminusers.tools;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SelectAddToWorkspacesFromToolsDropdownAdminUserPage {
	@Steps
	ToolsOptionSteps user;	

	@When("the user select Add_To_Workspaces from dropdown options")	
	public void whenTheUserSelectAddToWorkspacesFromDropdownOptions(){
		user.addToWorkspaces();
	}	
	
	@Then("Select_Workspaces_Dialog should be visible")	
	public void thenSelectWorkspacesDialogShouldBeVisible(){
		assertThat(user.selectWorkspace().equals("block")).isTrue();
	}
}
