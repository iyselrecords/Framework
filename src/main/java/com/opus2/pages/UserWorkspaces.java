package com.opus2.pages;

import java.util.List;
import java.util.Set;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

public class UserWorkspaces extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	
	
	public boolean verifyUserWorkspace() {		
		WebElement adminUser = getDriver().findElement(By.id("adminUsers"));
		WebElement anchor = adminUser.findElements(By.tagName("a")).get(0);
		if(anchor.getText().equalsIgnoreCase("Users and Workspaces")){
			return true;
		}
		return false;		
	}


	public void clickNewUser() {
		getDriver().findElement(By.id("maintoolbar_NewUser")).click();
	}

	public void typesUserEmail(String email) {
		WebElement newUser = getDriver().findElement(By.id("new-user"));
		newUser.findElements(By.tagName("input")).get(0).sendKeys(email);	
	}

	public void inviteUser() {
		getDriver().findElement(By.id("new-user_Invite")).click();	
	}

	public void clicksNewWorkspace() {
		getDriver().findElement(By.id("maintoolbar_NewWorkspace")).click();
		util.wait(1);
	}

	public void entersTitleAndDescription(String title, String desc) {
		util.wait(3);
		WebElement ws = getDriver().findElement(By.id("new-ws"));
		ws.findElements(By.tagName("input")).get(0).sendKeys(title);
		ws.findElements(By.tagName("textarea")).get(0).sendKeys(desc);
	}

	public void switchToCurrentWindow() {
		util.wait(3);
		Set<String> AllWindowHandles = getDriver().getWindowHandles(); 
		String currentWindow = (String) AllWindowHandles.toArray()[1];
		getDriver().switchTo().window(currentWindow);
	}

	public void createWorkspace() {
		getDriver().findElement(By.id("new-ws_Createworkspace")).click();	
	}
	
	public void selectWorkspace(String workspace) {
		WebElement maindiv = getDriver().findElement(By.id("maindiv"));		
		List<WebElement> tables = maindiv.findElements(By.tagName("table"));
		
		for(WebElement table: tables){
			WebElement header = table.findElements(By.className("tablehead")).get(0);
			
			WebElement span = header.findElements(By.tagName("span")).get(0);
			if(span.getText().equals("Workspace")){
				
				WebElement tbody = table.findElements(By.tagName("tbody")).get(0);
				List<WebElement> rows = tbody.findElements(By.tagName("tr"));
				for(WebElement row : rows){
					WebElement rowSpan = row.findElements(By.tagName("span")).get(0);
					if(rowSpan.getText().equalsIgnoreCase(workspace)){
						row.findElements(By.tagName("input")).get(0).click();
						util.wait(1);
						return;
					}
				}
			}
		}		
	}
	
	public void viewDropdown() {
		WebElement wrap = getDriver().findElement(By.className("subitems"));
		wrap.findElements(By.className("normalIcon")).get(0).click();
		util.wait(1);
	}

	public void selectDeleteOption() {
		WebElement wrap = getDriver().findElement(By.className("subitems"));		
		WebElement view = wrap.findElement(By.id("view-menu"));
		
		List<WebElement> options = view.findElements(By.tagName("span"));
		for(WebElement option : options){
			if(option.getText().equalsIgnoreCase("Delete")){
				option.click();
				break;
			}
		}	
	}

	public void confirmDelete() {	
		WebElement wrap = getDriver().findElement(By.id("DOMadditions"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys("p00k!DtLQ");
		util.wait(1);
		
		List<WebElement> buttons =wrap.findElements(By.tagName("button"));
		for(WebElement button : buttons){
			if(button.getText().equalsIgnoreCase("Delete")){
				button.click();
				break;
			}
		}
	}

	public void findWorkspace(String workspace) {	
		WebElement wrap = getDriver().findElement(By.className("subitems"));
		WebElement searchInput = wrap.findElements(By.className("searchInputArea")).get(0);
		searchInput.findElements(By.tagName("input")).get(0).sendKeys(workspace);		
		util.wait(1);
	}
	public void findUser(String user) {	
		WebElement wrap = getDriver().findElement(By.className("mainitems"));
		WebElement searchInput = wrap.findElements(By.className("searchInputArea")).get(0);
		searchInput.findElements(By.tagName("input")).get(0).sendKeys(user);		
		util.wait(1);
	}
	public void selectUser(String workspace) {
		WebElement maindiv = getDriver().findElement(By.id("maindiv"));		
		List<WebElement> tables = maindiv.findElements(By.tagName("table"));
		
		for(WebElement table: tables){
			WebElement header = table.findElements(By.className("tablehead")).get(0);
			
			WebElement span = header.findElements(By.tagName("span")).get(0);
			if(span.getText().equals("User")){
				
				WebElement tbody = table.findElements(By.tagName("tbody")).get(0);
				List<WebElement> rows = tbody.findElements(By.tagName("tr"));
				for(WebElement row : rows){
					WebElement rowSpan = row.findElements(By.tagName("span")).get(1);
					if(rowSpan.getText().equalsIgnoreCase(workspace)){
						row.findElements(By.tagName("input")).get(0).click();
						util.wait(1);
						return;
					}
				}
			}
		}		
	}

	public void viewDropdown(String user) {		
		WebElement wrap = getDriver().findElement(By.className("mainitems"));
		wrap.findElements(By.className("normalIcon")).get(0).click();
		util.wait(1);
	}

	public void selectDisableAccountOption(String disableAccount) {
		WebElement wrap = getDriver().findElement(By.className("mainitems"));		
		WebElement view = wrap.findElement(By.id("view-menu"));
		
		List<WebElement> options = view.findElements(By.tagName("span"));
		for(WebElement option : options){
			if(option.getText().equalsIgnoreCase(disableAccount)){
				option.click();
				break;
			}
		}	
	}

	public void confirmAction() {
		getDriver().findElement(By.id("OK")).click();
		util.wait(1);
	}
}
