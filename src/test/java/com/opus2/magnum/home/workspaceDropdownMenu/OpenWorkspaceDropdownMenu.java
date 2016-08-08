package com.opus2.magnum.home.workspaceDropdownMenu;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;

public class OpenWorkspaceDropdownMenu {
	@Steps	
	WorkspaceDropdownSteps ws;
	
	@Given("the user is a member of several Workspaces")
	public void givenTheUserIsAMemberOfSeveralWorkspaces(){
		String dip = ws.assertDIP();
		String test = "TestDesignInProgress";
		assertThat(dip.equals(test)).isTrue();
	}
	
	@Given("the <Workspace_Info_Button> is visible")
	public void givenTheWorkspace_Info_ButtonIsVisible(String Workspace_Info_Button){
		WebElement button = ws.isVisible(Workspace_Info_Button);
		assertThat(button.isDisplayed()).isTrue();		
	}
	
	@When("the user clicks the <Workspace_Info_Button>")
	public void whenTheUserClicksTheWorkspace_Info_Button(String Workspace_Info_Button){
		ws.clickDropdown(Workspace_Info_Button);
	}
	
	@Then("the <Workspace_Dropdown_Menu> must open")
	public void thenTheWorkspace_Dropdown_MenuMustOpen(String Workspace_Dropdown_Menu){
		String dip = ws.assertDIP();
		String test = "TestDesignInProgress";
		assertThat(dip.equals(test)).isTrue();
	}
}