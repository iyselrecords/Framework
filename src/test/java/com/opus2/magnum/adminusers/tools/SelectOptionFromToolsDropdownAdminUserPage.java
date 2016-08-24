package com.opus2.magnum.adminusers.tools;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class SelectOptionFromToolsDropdownAdminUserPage{
	@Steps
	ToolsOptionSteps user;
		
	@Given("the Tools_Dropdown is open")	
	public void givenTheTools_Dropdown_IsOpen(){
		assertThat(user.toolsDropdown().equals("block")).isTrue();
	}
	
	@When("the user select Add_To_Workspaces from dropdown options")	
	public void whenTheUserSelectAddToWorkspacesFromDropdownOptions(){
		 
	}	
	@Then("Select_Workspaces_Dialog should be visible")	
	public void thenSelectWorkspacesDialogShouldBeVisible(){
		 
	}
	
	@When("the user select Reset_Password from dropdown options")	
	public void whenTheUserSelectResetPasswordFromDropdownOptions(){
		 
	}
	@Then("Reset_Password_Dialog should be visible")	
	public void thenResetPasswordDialogShouldBeVisible(){
		 
	}
	
	@When("the user select Reset_Memorable_Word from dropdown options")	
	public void whenTheUserSelectResetMemorableWordFromDropdownOptions(){
		 
	}
	@Then("Reset_Memorable_Word_Dialog should be visible")	
	public void thenResetMemorableWordDialogShouldBeVisible(){
		 
	}
	
	@When("the user select Login_As from dropdown options")	
	public void whenTheUserSelectLoginAsFromDropdownOptions(){
		 
	}
	@Then("Windows_Alert should be visible")	
	public void thenWindowsAlertShouldBeVisible(){
		 
	}
}