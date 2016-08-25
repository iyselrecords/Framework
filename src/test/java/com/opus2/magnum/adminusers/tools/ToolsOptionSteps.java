package com.opus2.magnum.adminusers.tools;

import org.openqa.selenium.WebElement;

import com.opus2.magnum.adminuser.tools.ToolsOption;

import net.thucydides.core.annotations.Step;

public class ToolsOptionSteps {
	ToolsOption user;
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step("tools dropdown button visible")
	public WebElement toolsDropdownButton() {
		return user.toolsDropdownButton();
	}

	@Step("open tools dropdown")
	public void openDropdown() {
		user.openDropdown();
	}
	
	@Step("dropdown options displayed")
	public String toolsDropdown() {
		return user.toolsDropdown();
	}

	public void addToWorkspaces() {
		user.addToWorkspaces();
	}
	
	public String selectWorkspace() {
		return user.selectWorkspace();
	}
	
	public void resetPassword() {
		user.resetPassword();
	}
	
	public String passwordReset() {
		return user.passwordReset();
	}
	
	public void resetMemorableWord() {
		user.resetMemorableWord();
	}
	
	public String memorableWordReset() {
		return user.memorableWordReset();
	}
	
	public void loginAs() {
		user.loginAs();
	}

	public void alert() {
		user.alert();
	}
}
