package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectDeleteAccountOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Delete_Account option")
	public void whenTheUserSelectDelete_AccountOption(){
		  user.deleteAccount();
	}
}
