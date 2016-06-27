package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

import net.serenitybdd.core.pages.PageObject;

public class Home extends PageObject{
	UserAction user;
	Util util;
	
	public void findCase(String keysToSend) {
		user.inputText("wsfindcontainer", keysToSend);
	}

	public void selectWorkspace(String workspace) {
		user.selectWorkspace(workspace);
	}
	
	public void newWorkspace() {
		user.clickAction("home-buttons_NewWorkspace");
	}
	
	public boolean newWorkspaceDialog() {
		util.pause(1);
		WebElement h2 = getDriver().findElement(By.tagName("h2"));
		if (h2.getText().equalsIgnoreCase("Start a new workspace")){
			return true;
		}
		return false;
	}
	
	public void closeNewWorkspaceDialog()
	{
		user.clickAction("new-ws dialogClose-div");
	}

	public void manageUserAndWorkspace() {
		user.clickAction("home-buttons_ManageUsersandWorkspaces");
	}

	public void workspace(String workspace) {
		WebElement wslist = getDriver().findElement(By.linkText(workspace));
		wslist.click();
	}
}
