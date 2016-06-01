package com.opus2.pages;



import java.util.List;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

public class Home extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	UserAction action;

	public void newWorkspace() {
		action.clickAction("home-buttons_NewWorkspace");
	}
	
	public boolean newWorkspaceDialog() {
		//util.wait(1);
		WebElement h2 = getDriver().findElement(By.tagName("h2"));
		if (h2.getText().equalsIgnoreCase("Start a new workspace")){
			return true;
		}
		return false;
	}
	
	public void closeNewWorkspaceDialog()
	{
		action.clickAction("new-ws dialogClose-div");
	}

	public void manageUserAndWorkspace() {
		action.clickAction("home-buttons_ManageUsersandWorkspaces");
	}

	public void findCase(String keysToSend) {
		action.inputText("wsfindcontainer", keysToSend);
	}

	public void selectWorkspace(String workspace) {
		WebElement wslist = getDriver().findElement(By.id("workspaceslist"));
		List <WebElement> lists = wslist.findElements(By.className("wsline"));
		for(WebElement list: lists){
			if(list.getAttribute("title").equalsIgnoreCase(workspace)){
				list.findElements(By.tagName("a")).get(0).click();
				break;
			}
		}	
	}
}
