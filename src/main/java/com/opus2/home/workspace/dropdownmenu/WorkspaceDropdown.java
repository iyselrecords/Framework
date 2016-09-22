package com.opus2.home.workspace.dropdownmenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dropdown;

public class WorkspaceDropdown extends Page {
	private static final String WORKSPACE_BUTTON = "wsinfo";
	private static final String DROPDOWN = "bareDialog";
	
	private Button button;
	private Dropdown dropdown;
	
	public WebElement workspacesList(){
		return button.hasButton(Configuration.getSelectedUser()
			.getWorkspace());
	}
	
	public void selectWorkspace(){
		workspacesList().click();
	}	
	
	public WebElement workspacesLists() {
		this.waitForPageAction();
		return Util.getDriver().findElement(By.id("wsline-" + Configuration.getSelectedUser()
			.getWorkspace()));
	}

	public WebElement InfoButton() {
		this.waitForPageToLoad();
		return button.hasButton(WORKSPACE_BUTTON);
	}

	public void openDropdown() {
		InfoButton().click();
	}
	
	public String dropdownMenu() {
		return dropdown.isVisible(DROPDOWN);
	}
	
	public String getCurrentUrl() {
	    String url = Configuration.homeUrl+"?ws="+Configuration.getSelectedUser().getWorkspace();
		return url;
	}
}
