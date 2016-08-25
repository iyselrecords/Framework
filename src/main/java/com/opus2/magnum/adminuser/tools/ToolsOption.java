package com.opus2.magnum.adminuser.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;

public class ToolsOption extends Page {
	
	private static final String TOOLS_BUTTON = "maindiv_Tools";
	private static final String ADD_TO_WORKSPACES = "Add to Workspaces";
	private static final String SELECT_WORKSPACE = "select-workspace";
	private static final String RESET_PASSWORD = "Reset Password";
	private static final String RESET_MEMORABLE_WORD = "Reset Memorable Word";
	private static final String DIALOG = "dialog";
	private static final String ARCHIVE_WORKSPACE = "Archive Workspace";
	private static final String ARCHIVE = "Archive";
	private static final String DELETE = "Delete";
	private static final String ZIP = "Zip";
	private static final String APPLY_BUTTON = "Apply";
	
	
	
	private Dropdown option;
	private Dialog dialog;
	
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
	
	public void resetMemorableWord() {
		option.getOption(0, RESET_MEMORABLE_WORD).click();
	}

	public String dialog() {
		return this.getElementByClass(DIALOG)
			.getCssValue("display");
	}
	
	public void loginAs() {
		//option.getOption(0, LOGIN_AS).click();
	}

	public void alert() {
		//this.getDriver().switchTo().alert().dismiss();
	}
	
	public void archive() {
		option.getOption(0, ARCHIVE).click();
	}
	
	public void delete() {
		option.getOption(0, DELETE).click();
	}
	
	public void zip() {
		option.getOption(0, ZIP).click();
	}

	public WebElement passwordInput() {
		return dialog.dialog(ARCHIVE_WORKSPACE)
			.findElements(By.tagName("input")).get(0);
	}
	
	public WebElement input() {
		return this.getElementByClass(DIALOG)
			.findElements(By.tagName("input")).get(0);
	}
	
	public void inputPassword() {
		input().sendKeys(Configuration.getSelectedUser().getPassword());
	}

	public void archiveWorkspace() {
		dialog.button(APPLY_BUTTON).click();
		confirm();
	}
	
	private void confirm() {
		this.getElement("OK").click();
		Util.pause(3);
	}

	public String archiveManagerStatus() {
		//navigate to "https://customer.opus2.com/rc/admin/archiveManager.php"
		//return workspace Status;
		return "Added for archiving";
	}

	public void deleteWorkspace() {
		dialog.button(DELETE).click();
		Util.pause(3);
	}
}
