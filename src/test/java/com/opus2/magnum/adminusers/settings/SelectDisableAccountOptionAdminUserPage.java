package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectDisableAccountOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Disable_Account option")
	public void whenTheUserSelectDisable_AccountOption(){
		  user.disableAccount();
	}
}
