package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectDisableMemorableWordOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Disable_Memorable_Word option")
	public void whenTheUserSelectDisable_Memorable_WordOption(){
		  user.disableMemorableWord();
	}
}
