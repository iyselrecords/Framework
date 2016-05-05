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

	public void newWorkspace() {
		getDriver().findElement(By.id("home-buttons_NewWorkspace")).click();
	}
	
	public boolean newWorkspaceDialog() {
		util.wait(2);
		WebElement h2 = getDriver().findElement(By.tagName("h2"));
		if (h2.getText().equalsIgnoreCase("Start a new workspace")){
			return true;
		}
		return false;
	}
	
	public void closeNewWorkspaceDialog()
	{
		getDriver().findElement(By.id("new-ws dialogClose-div")).click();
	}

	public void manageUserAndWorkspace() {
		getDriver().findElement(By.id("home-buttons_ManageUsersandWorkspaces")).click();
	}

	public void findCase(String workspace) {
		WebElement wrap = getDriver().findElement(By.id("wsfindcontainer"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys(workspace);	
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
