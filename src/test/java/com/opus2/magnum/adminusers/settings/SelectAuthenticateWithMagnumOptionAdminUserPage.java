package com.opus2.magnum.adminusers.settings;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.adminuser.settings.SettingsOptions;

import net.thucydides.core.annotations.Steps;

public class SelectAuthenticateWithMagnumOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Authenticate_With_Magnum option")
	public void whenTheUserSelectAuthenticate_With_MagnumOption(){
		  user.authenticateWithMagnum();
	}
	
	@Then("User_Authenticate should be set to Magnum")
	public void thenUser_AuthenticateShouldBeSetToMagnum(){
		assertThat(user.authentication().equals(SettingsOptions.MAGNUM)).isTrue();
	}
}
