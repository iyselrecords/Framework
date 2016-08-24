package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectEnableMemorableWordOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Enable_Memorable_Word option")
	public void whenTheUserSelectEnable_Memorable_WordOption(){
		  user.enableMemorableWord();
	}
}
