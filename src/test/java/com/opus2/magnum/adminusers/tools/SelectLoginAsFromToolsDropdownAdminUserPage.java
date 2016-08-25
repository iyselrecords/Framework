package com.opus2.magnum.adminusers.tools;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SelectLoginAsFromToolsDropdownAdminUserPage {
	@Steps
	ToolsOptionSteps user;
	
	@When("the user select Login_As from dropdown options")	
	public void whenTheUserSelectLoginAsFromDropdownOptions(){
		user.loginAs();
	}
	
	@Then("Windows_Alert should be visible")	
	public void thenWindowsAlertShouldBeVisible(){
		user.alert();
	}
}
