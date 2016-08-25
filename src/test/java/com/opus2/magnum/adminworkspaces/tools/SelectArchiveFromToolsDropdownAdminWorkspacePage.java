package com.opus2.magnum.adminworkspaces.tools;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.adminusers.tools.ToolsOptionSteps;

public class SelectArchiveFromToolsDropdownAdminWorkspacePage {
	@Steps
	ToolsOptionSteps user;
	
	@When("the user select Archive from dropdown options")	
	public void whenTheUserSelectArchiveFromDropdownOptions(){
		user.archive();
	}	
	
	@Then("Archive_Workspace_Dialog should be visible")	
	public void thenArchiveWorkspaceDialogShouldBeVisible(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
}
