package com.opus2.home.manageuserandworkspace;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;

public class AdminWorkspace extends Page {
	private static final String WORKSPACES_TAB = "adminWorkspaces";
	public static final String CREATE_WORKSPACES_BUTTON = "maintoolbar_CreateaNewWorkspace";
	private static final String NEW_WORKSPACE_DIALOG = "new-ws";
	public static final String WORKSPACE_TITLE = "ACME v TBD Incorporated";
	private static final String WORKSPACE_DESCRIPTION = "Test Automation";
	private static final String WORKSPACE_LIST = "mainitems";
	private static final String DIALOG_CREATE_BUTTON = "new-ws_Createworkspace";
	private static final String FIND_INPUT = "searchInputArea";
	private static final String FILTERED_WORKSPACE = "mainitems";
	private static final String TOOLS_BUTTON = "maindiv_Tools";
	private static final String VIEW_MENU = "view-menu";
	private static final String DELETE_OPTION = "Delete";
	private static final String DELETE_WORKSPACE_DIALOG = "Delete Workspace";
	private Dropdown option;
	private Dialog dialog;
	
	
	public WebElement workspacesTab() {
		return this.getElement(WORKSPACES_TAB);
	}

	public void adminWorkspaces() {
		workspacesTab().click();
	}

	public String currentUrl() {
		return this.getDriver().getCurrentUrl();
	}

	public WebElement createWorkspaceButton() {
		return this.getElement(CREATE_WORKSPACES_BUTTON);
	}

	public void openDialog() {
		createWorkspaceButton().click();
	}

	public String dialog() {
		return this.getElement(NEW_WORKSPACE_DIALOG)
			.getCssValue("display");
	}
	
	public WebElement inputBox() {
		return this.getElement(NEW_WORKSPACE_DIALOG)
			.findElements(By.tagName("input")).get(0);
	}
	
	public WebElement textArea() {
		return this.getElement(NEW_WORKSPACE_DIALOG)
			.findElements(By.tagName("textarea")).get(0);
	}

	public void inputTitle() {
		inputBox().sendKeys(WORKSPACE_TITLE);
	}
	
	public void inputDescription() {
		textArea().sendKeys(WORKSPACE_DESCRIPTION);
	}

	public void createWorkspace() {
		this.getElement(DIALOG_CREATE_BUTTON).click();
	}

	public WebElement newWorkspace() {
		return workspace();
	}

	private WebElement workspace() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(WORKSPACE_LIST));
		WebElement workspace = null;
		List <WebElement> workspaces = this.getDriver().findElements(By.className(WORKSPACE_LIST)).get(0)
			.findElements(By.className("awc1"));
		for(WebElement wks : workspaces){
			if(wks.findElements(By.tagName("span")).get(0).getText().equals(WORKSPACE_TITLE)){
				workspace = wks;
			}
		}
		return workspace;
	}

	public WebElement findInput() {
		return this.getElementByClass(FIND_INPUT)
			.findElements(By.tagName("input")).get(0);
	}

	public void findWorkspace() {
		 findInput().sendKeys(WORKSPACE_TITLE);
	}

	public WebElement filteredWorkspace() {
		WebElement element = null;		
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(FILTERED_WORKSPACE));		
		WebElement t = this.getElementByClass(FILTERED_WORKSPACE)
			.findElements(By.className("users")).get(0);
		
		List <WebElement> rows = t.findElements(By.tagName("tr"));
		for(WebElement row : rows){			
			WebElement wks = row.findElements(By.className("awc1")).get(0);		
			if(wks.findElements(By.tagName("span")).get(0).getText().equals(WORKSPACE_TITLE)){
				element = row;
				break;
			}
		}
		return element;
	}

	
	public void selectWorkspace() {
		filteredWorkspace().findElements(By.tagName("input"))
			.get(0).click();
	}
	
	public WebElement workspaceChecked() {
		return filteredWorkspace().findElements(By.tagName("input"))
			.get(0);
	}

	public WebElement toolsDropdownButton() {
		return this.getElement(TOOLS_BUTTON);
	}

	public void openDropdown() {
		toolsDropdownButton().click();
	}

	public String toolsDropdown() {
		return this.getElement(VIEW_MENU)
			.getCssValue("display");
	}

	public void selectOption() {
		option.selectOption(DELETE_OPTION)
			.click();
	}

	public String deleteDialog() {		
		return this.dialog.dialog(DELETE_WORKSPACE_DIALOG)
			.getCssValue("display");
	}

	public WebElement passwordInput() {
		return dialog.dialog(DELETE_WORKSPACE_DIALOG)
			.findElements(By.tagName("input")).get(0);
	}

	public void inputPassword() {
		passwordInput().sendKeys(Configuration.getSelectedUser().getPassword());
	}

	public void deleteWorkspace() {
		List <WebElement> buttons = dialog.dialog(DELETE_WORKSPACE_DIALOG)
			.findElements(By.tagName("button"));
		for(WebElement button : buttons){
			if(button.getText().equals(DELETE_OPTION)){
				button.click();
				break;
			}
		}
		Util.pause(2);
	}
	
	public WebElement checkedAll() {
		return allChecked();
	}

	private WebElement allChecked() {
		WebElement all = null;
		
		WebElement a = this.getElementByClass(FILTERED_WORKSPACE)
			.findElements(By.className("users")).get(0);
		List <WebElement> rows = a.findElements(By.tagName("tbody")).get(0)
			.findElements(By.className("awc0"));
		
		for(WebElement row : rows){
			all = row.findElements(By.tagName("input")).get(0);
		}
		return all;
	}
}
