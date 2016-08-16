package com.opus2.magnum.home.workspaceDropdownMenu;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import com.opus2.core.Configuration;
import com.opus2.enums.Role;
import static org.assertj.core.api.Assertions.*;

public class OpenWorkspaceDropdownMenu {
	@Steps	
	WorkspaceDropdownSteps wks;
	
	@Given("the user is a member of several Workspaces")
	public void givenTheUserIsAMemberOfSeveralWorkspaces(){	
		assertThat(Configuration.getSelectedUser().getRole().equals(Role.SUPERADMIN)).isTrue();
	}
	
	@Given("the Workspace_Info_Button is visible")
	public void givenTheWorkspace_Info_ButtonIsVisible(){
		assertThat(wks.InfoButton().isDisplayed()).isTrue();		
	}
	
	@When("the user clicks the Workspace_Info_Button")
	public void whenTheUserClicksTheWorkspace_Info_Button(){
		wks.openDropdown();
	}
	
	@Then("the Workspace_Dropdown_Menu must open")
	public void thenTheWorkspace_Dropdown_MenuMustOpen(){
		assertThat(wks.isVisible().equals("block")).isTrue();
	}
}