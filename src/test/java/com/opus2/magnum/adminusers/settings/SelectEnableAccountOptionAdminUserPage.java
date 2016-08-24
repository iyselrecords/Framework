package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectEnableAccountOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Enable_Account option")
	public void whenTheUserSelectEnable_AccountOption(){
		  user.enableAccount();
	}
}
