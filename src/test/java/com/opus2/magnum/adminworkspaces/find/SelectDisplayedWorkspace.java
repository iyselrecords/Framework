package com.opus2.magnum.adminworkspaces.find;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

import com.opus2.magnum.adminworkspaces.AdminWorkspaceSteps;

public class SelectDisplayedWorkspace {
	@Steps
	AdminWorkspaceSteps user;
	
	@Given("Filtered_Workspace is visible")
	public void givenFiltered_WorkspaceIsVisible(){
		assertThat(user.filteredWorkspace().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the checkbox button")
	public void whenTheUserClicksTheCheckboxButton(){
		user.selectWorkspace();
	}
	
	@Then("Workspace is selected")
	public void thenWorkspaceIsSelected(){
		assertThat(user.workspaceChecked().isSelected()).isTrue();
	}
	
	@Then("all workspace should be selected")	
	public void thenAllUsersShouldBeSelected(){
		assertThat(user.checkedAll().isSelected()).isTrue();
	}
}
