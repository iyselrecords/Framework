package com.opus2.magnum.adminusers.tools;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SelectResetPasswordFromToolsDropdownAdminUserPage {
	@Steps
	ToolsOptionSteps user;

	@When("the user select Reset_Password from dropdown options")	
	public void whenTheUserSelectResetPasswordFromDropdownOptions(){
		user.resetPassword();
	}
	@Then("Reset_Password_Dialog should be visible")	
	public void thenResetPasswordDialogShouldBeVisible(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
}
