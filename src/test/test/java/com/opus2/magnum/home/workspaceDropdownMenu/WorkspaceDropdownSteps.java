package com.opus2.magnum.home.workspaceDropdownMenu;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Util;

public class WorkspaceDropdownSteps {

	@Step
	public String assertDIP() {
		String test = "TestDesignInProgress";
		return test;
	}

	@Step
	public WebElement isVisible(String button) {
		WebElement tab = Util.getDriver().findElement(By.id(button));  
		return tab;
	}

	@Step
	public void clickDropdown(String wsif) {
		Util.click(wsif);
	}

	@Step
	public void selectWorkspace() {
		Util.click(Configuration.getSelectedUser().getWorkspace());
	}
	
	@Step
	public WebElement workspaceslist(){
		return Util.getDriver().findElement(By.id("a-" + Configuration.getSelectedUser().getWorkspace()));
	}

	@Step
	public String getpageTitle() {
		return Util.getDriver().getTitle();
	}
}
