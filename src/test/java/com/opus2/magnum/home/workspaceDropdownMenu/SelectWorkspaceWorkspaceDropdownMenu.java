package com.opus2.magnum.home.workspaceDropdownMenu;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.core.Configuration;
public class SelectWorkspaceWorkspaceDropdownMenu{
	@Steps
	WorkspaceDropdownSteps ws;
	
	@Given("the Workspace_Title is visible in the Cases section")	
	public void givenTheWorkspace_TitleIsVisibleInTheCasesSection(){
		assertThat(ws.workspaceslist().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Workspace_Title")	
	public void whenTheUserClicksTheWorkspace_Title(){
		ws.selectWorkspace();
	}
	
	@Then("the Page_Title must equal the Workspace_Title")	
	public void thenThePage_TitleMustEqualTheWorkspace_Title(){
		assertThat(ws.getpageTitle().equals("Home - " + Configuration.getSelectedUser().getCase())).isTrue();
	}
}