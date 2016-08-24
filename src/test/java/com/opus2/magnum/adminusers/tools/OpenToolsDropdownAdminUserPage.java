package com.opus2.magnum.adminusers.tools;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class OpenToolsDropdownAdminUserPage {
	@Steps
	ToolsOptionSteps user;
	
	@Given("the Tools_Dropdown_Button is visible")
	public void givenTheTools_Dropdown_ButtonIsVisible(){
		assertThat(user.toolsDropdownButton().isDisplayed()).isTrue(); 
	}
	
	@When("user clicks the Tools_Dropdown_Button")	
	public void whenUserClicksTheTools_Dropdown_Button(){
		user.openDropdown();
	}
	
	@Then("the Dropdown should display Dropdown_Options")
	public void thenTheDropdownShouldDisplayDropdown_Options(){
		assertThat(user.toolsDropdown().equals("block")).isTrue();
	}
}
