package com.opus2.magnum.adminworkspaces.find;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.adminworkspaces.AdminWorkspaceSteps;

public class FindWorkspaceFromWorkspaceList {
	@Steps
	AdminWorkspaceSteps user;
	
	@Given("Workspace is listed in Workspace_List")	
	public void givenWorkspaceIsListedInWorkspace_List(){
		assertThat(user.newWorkspace().isDisplayed()).isTrue();
	}
	
	@When("the user enters Workspace_Title")
	public void whenTheUserEntersWorkspace_Title(){
		user.findWorkspace();
	}

	@Then("Workspace is visible")
	public void thenWorkspaceIsVisible(){
		assertThat(user.filteredWorkspace().isDisplayed()).isTrue();
	}
}
