package com.opus2.magnum.adminusers.tools;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import net.thucydides.core.annotations.Steps;

public class CloseToolsDropdownAdminUserPage {
	@Steps
	ToolsOptionSteps user;
	
	@Given("the Tools_Dropdown_Button is open")
	public void givenTheSettingsDropdownButtonIsOpen(){
		assertThat(user.toolsDropdown().equals("block")).isTrue();
	}
	
	@Then("the Tools_Dropdown_Panel should close")
	public void thenTheToolsDropdownPanelShouldClose(){
		assertThat(user.toolsDropdown().equals("none")).isTrue();
	}
}
