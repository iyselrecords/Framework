package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectEnable2FAOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Enable_2FA option")
	public void whenTheUserSelectEnable_2FAOption(){
		  user.enable2FA();
	}
}
