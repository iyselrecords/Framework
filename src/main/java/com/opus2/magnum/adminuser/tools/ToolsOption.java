package com.opus2.magnum.adminuser.tools;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Dropdown;

public class ToolsOption extends Page {
	
	private static final String TOOLS_BUTTON = "maindiv_Tools";
	private static final String ADD_TO_WORKSPACES = "Add to Workspaces";
	private static final String SELECT_WORKSPACE = "select-workspace";
	private static final String RESET_PASSWORD = "Reset Password";
	public static final String PASSWORD_RESET = "dialog";
	private static final String RESET_MEMORABLE_WORD = "Reset Memorable Word";
	private static final String MEMORABLE_WORD_RESET = "dialog";
	private Dropdown option;
	
	
	public WebElement toolsDropdownButton() {
		return this.getElement(TOOLS_BUTTON);
	}

	public void openDropdown() {
		toolsDropdownButton().click();
	}

	public String toolsDropdown() {
		return option.dropdownPanel(0).getCssValue("display");
	}

	public void addToWorkspaces() {
		option.getOption(0, ADD_TO_WORKSPACES).click();
	}
	
	public String selectWorkspace() {
		return this.getElement(SELECT_WORKSPACE)
			.getCssValue("display");
	}
	
	public void resetPassword() {
		option.getOption(0, RESET_PASSWORD).click();
	}
	
	public String passwordReset() {
		return this.getElementByClass(PASSWORD_RESET)
			.getCssValue("display");
	}
	
	public void resetMemorableWord() {
		option.getOption(0, RESET_MEMORABLE_WORD).click();
	}

	public String memorableWordReset() {
		return this.getElementByClass(MEMORABLE_WORD_RESET)
			.getCssValue("display");
	}
	
	public void loginAs() {
		//option.getOption(0, LOGIN_AS).click();
	}

	public void alert() {
		//this.getDriver().switchTo().alert().dismiss();
	}
}
