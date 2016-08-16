package com.opus2.magnum.home.workspaceDropdownMenu;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class CloseWorkspaceDropdownMenu{
	@Steps	
	WorkspaceDropdownSteps wks;
	
	@Given("the Workspace_Dropdown_Menu is open")	
	public void givenTheWorkspace_Dropdown_MenuIsOpen(){
		assertThat(wks.isVisible().equals("block")).isTrue();
	}
	
	@Then("the Workspace_Dropdown_Menu must close")	
	public void thenTheWorkspace_Dropdown_MenuMustClose(){
		assertThat(wks.isVisible().equals("none")).isTrue();
	}	
}