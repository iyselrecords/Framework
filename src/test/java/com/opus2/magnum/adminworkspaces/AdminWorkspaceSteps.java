package com.opus2.magnum.adminworkspaces;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebElement;

import com.opus2.home.manageuserandworkspace.AdminWorkspace;

public class AdminWorkspaceSteps {
	AdminWorkspace user;

	
	@Step("workspaces tab is visible")
	public WebElement workspacesTab() {
		return user.workspacesTab();
	}
	
	@Step("navigate to admin workspaces page")
	public void adminWorkspaces() {
		user.adminWorkspaces();
	}
	
	@Step("user in workspaces page")
	public String currentUrl() {
		return user.currentUrl();
	}
	
	@Step("create new workspabce button visible")
	public WebElement createWorkspaceButton() {
		return user.createWorkspaceButton();
	}
	
	@Step("click to open dialog")
	public void openDialog() {
		user.openDialog();
	}

	@Step("dialog is visible")
	public String dialog() {
		return user.dialog();
	}
	
	@Step("title textbox is visible")
	public WebElement inputBox() {
		return user.inputBox();
	}
	
	@Step("description textbox is visible")
	public WebElement textArea() {
		return user.textArea();
	}
	
	@Step("user enters workspace title")
	public void inputTitle() {
		user.inputTitle();
	}
	
	@Step("user enters workspace description")
	public void inputDescription() {
		user.inputDescription();
	}
	
	@Step("creates workspace")
	public void createWorkspace() {
		user.createWorkspace();
	}
	
	@Step("new workspace visible on list")
	public WebElement newWorkspace() {
		return user.newWorkspace();
	}

	@Step("find input is visible")
	public WebElement findInput() {
		return user.findInput();
	}

	@Step("workspace is listed")
	public void findWorkspace() {
		user.findWorkspace();
	}

	@Step("user enters workspace title")
	public WebElement filteredWorkspace() {
		return user.filteredWorkspace();
	}
	
	@Step("select workspace")
	public void selectWorkspace() {
		user.selectWorkspace();
	}
	
	@Step("workspace checked")
	public WebElement workspaceChecked() {
		return user.workspaceChecked();
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

	@Step("select option")
	public void selectOption() {
		user.selectOption();
	}

	@Step("delete dialog is visible")
	public String deleteDialog() {
		return user.deleteDialog();
	}
	
	@Step("password input is visible")
	public WebElement passwordInput() {
		return user.passwordInput();
	}
	
	@Step("user enters password")
	public void inputPassword() {
		user.inputPassword();
	}
	
	public void deleteWorkspace() {
		user.deleteWorkspace();
	}
	
	public WebElement checkedAll() {
		return user.checkedAll();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}	
}
