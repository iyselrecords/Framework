package com.opus2.magnum.home.workspaceDropdownMenu;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.util.Util;

public class SelectWorkspaceWorkspaceDropdownMenu{
	@Steps
	WorkspaceDropdownSteps wks;
	
	@Given("the Workspace_Title is visible in the Cases section")	
	public void givenTheWorkspace_TitleIsVisibleInTheCasesSection(){
		assertThat(wks.workspacesList().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Workspace_Title")	
	public void whenTheUserClicksTheWorkspace_Title(){
		wks.selectWorkspace();
	}
	
	@Then("the Page_Title must equal the Workspace_Title")	
	public void thenThePage_TitleMustEqualTheWorkspace_Title(){
		assertThat(wks.getCurrentUrl().equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}