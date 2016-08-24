package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectDisable2FAOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Disable_2FA option")
	public void whenTheUserSelectDisable_2FAOption(){
		  user.disable2FA();
	}
}
