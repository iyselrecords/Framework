package com.opus2.magnum.adminusers.settings;

import org.openqa.selenium.WebElement;

import com.opus2.magnum.adminuser.settings.SettingsOptions;

import net.thucydides.core.annotations.Step;

public class SettingsOptionSteps {
	SettingsOptions user;
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}

	public WebElement settingsDropdownButton() {
		return user.settingsDropdownButton();
	}

	@Step("open settings dropdown")
	public void openDropdown() {
		user.openDropdown();
	}

	public String settingsDropdown() {
		return user.settingsDropdown();
	}

	@Step("disable account")
	public void disableAccount() {
		user.disableAccount();
	}

	@Step("enable account")
	public void enableAccount() {
		user.enableAccount();
	}
	
	@Step("delete account")
	public void deleteAccount() {
		user.deleteAccount();
	}
	
	@Step("enable 2FA")
	public void enable2FA() {
		user.enable2FA();
	}
	
	@Step("disable 2FA")
	public void disable2FA() {
		user.disable2FA();
	}
	
	@Step("enable memorable word")
	public void enableMemorableWord() {
		user.enableMemorableWord();
	}
	
	@Step("disable memorable word")
	public void disableMemorableWord() {
		user.disableMemorableWord();
	}
	
	@Step("authenticate with Magnum")
	public void authenticateWithMagnum() {
		user.authenticateWithMagnum();
	}
	
	@Step("authenticate with LDAP")
	public void authenticateWithLDAP() {
		user.authenticateWithLDAP();
	}
	
	@Step("alert is visible")
	public String confirmAlert() {
		return user.confirmAlert();
	}

	public String authentication() {
		return user.authentication();
	}
}
