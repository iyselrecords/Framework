package com.opus2.magnum.home.workspaceDropdownMenu;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import com.opus2.home.workspace.dropdownmenu.WorkspaceDropdown;


public class WorkspaceDropdownSteps {
	WorkspaceDropdown wks;
	
	@Step("workspace is visible")
	public WebElement workspacesList(){
		return wks.workspacesList();
	}
	
	@Step("select workspace")
	public void selectWorkspace() {
		wks.selectWorkspace();
	}
	
	@Step("page title")
	public String getCurrentUrl() {
		return wks.getCurrentUrl();
	}
	
	@Step("button is visible")
	public WebElement InfoButton() {
		return wks.InfoButton();
	}
	
	@Step("open dropdown")
	public void openDropdown() {
		wks.openDropdown();
	}
		
	@Step("dropdown menu is open")
	public String isVisible() {
		return wks.dropdownMenu();
	}	
}
