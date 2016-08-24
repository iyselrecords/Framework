package com.opus2.magnum.adminusers.settings;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import net.thucydides.core.annotations.Steps;

public class CloseSettingsDropdownAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@Given("the Settings_Dropdown_Button is open")
	public void givenTheSettings_Dropdown_ButtonIsVisible(){
		assertThat(user.settingsDropdown().equals("block")).isTrue();
	}
	
	@Then("the Settings_Dropdown_Panel should close")
	public void thenTheDropdownShouldClose(){
		assertThat(user.settingsDropdown().equals("none")).isTrue();
	}
}
