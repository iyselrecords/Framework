package com.opus2.magnum.adminworkspaces.tools;

import org.openqa.selenium.WebElement;

import com.opus2.magnum.adminuser.tools.ToolsOption;

import net.thucydides.core.annotations.Step;


public class AdminWorkspaceToolsSteps {
	ToolsOption user;

	@Step("dialog is visible")
	public String dialog() {
		return user.dialog();
	}

	public void inputPassword() {
		user.inputPassword();
	}

	public WebElement input() {
		return user.input();
	}
	
	public WebElement passwordInput() {
		return user.passwordInput();
	}

	public void archiveWorkspace() {
		user.archiveWorkspace();
	}

	public String archiveManagerStatus() {
		return user.archiveManagerStatus();
	}

	public void deleteWorkspace() {
		user.deleteWorkspace();
	}

	public String assertDIP() {
		return "TDIP";
	}
		
	
}
