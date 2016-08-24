package com.opus2.magnum.adminusers.settings;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.assertj.core.api.Assertions.*;

import com.opus2.magnum.adminuser.settings.SettingsOptions;

import net.thucydides.core.annotations.Steps;

public class SelectAuthenticateWithLDAPOptionAdminUserPage {
	@Steps
	SettingsOptionSteps user;
	
	@When("the user select Authenticate_With_LDAP option")
	public void whenTheUserSelectAuthenticate_With_LDAPOption(){
		  user.authenticateWithLDAP();
	}
	
	@Then("User_Authenticate should be set to LDAP")
	public void thenUser_AuthenticateShouldBeSetToLDAP(){
		  assertThat(user.authentication().equals(SettingsOptions.LDAP)).isTrue();
	}
}
