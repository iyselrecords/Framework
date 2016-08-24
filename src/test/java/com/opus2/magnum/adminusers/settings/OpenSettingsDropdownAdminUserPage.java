package com.opus2.magnum.adminusers.settings;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenSettingsDropdownAdminUserPage{
	@Steps
	SettingsOptionSteps user;
	
	@Given("the Settings_Dropdown_Button is visible")
	public void givenTheSettings_Dropdown_ButtonIsVisible(){
		assertThat(user.settingsDropdownButton().isDisplayed()).isTrue(); 
	}
	
	@When("user clicks the Settings_Dropdown_Button")	
	public void whenUserClicksTheSettings_Dropdown_Button(){
		user.openDropdown();
	}
	
	@Then("Setting_Dropdown should display Dropdown_Options")
	public void thenTheDropdownShouldDisplayDropdown_Options(){
		assertThat(user.settingsDropdown().equals("block")).isTrue();
	}
	
	@Then("Confirm_Alert should be visible")
	public void thenConfirm_AlertShouldBeVisible(){
		assertThat(user.confirmAlert().equals("block")).isTrue();
	}
	
	@Given("the Settings_Dropdown is open")
	public void givenTheSettingsDropdownIsOpen(){
		assertThat(user.settingsDropdown().equals("block")).isTrue();
	}
}