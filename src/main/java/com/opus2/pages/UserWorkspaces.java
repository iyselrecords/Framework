package com.opus2.pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.enums.UserWorkspaceOption;
import com.opus2.util.Util;

public class UserWorkspaces extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	UserAction action;
	
	public boolean verifyUserWorkspace() {		
		WebElement adminUser = getDriver().findElement(By.id("adminUsers"));
		WebElement anchor = adminUser.findElements(By.tagName("a")).get(0);
		if(anchor.getText().equalsIgnoreCase("Users and Workspaces")){
			return true;
		}
		return false;		
	}

	public void newUser() {
		action.clickAction("maintoolbar_NewUser");
	}
	
	public void enterUserEmail(String email) {
		action.inputText("new-user", email);
	}
	
	public void inviteUser() {
		action.clickAction("new-user_Invite");
	}
	
	public void newWorkspace() {
		action.clickAction("maintoolbar_NewWorkspace");
	}
	
	public void enterTitleAndDescription(String title, String desc) {
		action.inputText("new-ws", title);		
		action.inputTextArea("new-ws", desc);
	}
	
	public void createWorkspace() {
		action.clickAction("new-ws_Createworkspace");
	}
	
	public void confirmDelete() {		
		util.wait(2);
		action.inputText("DOMadditions", "p00k!DtLQ");
		action.clickAction("DOMadditions","btn-green");
	}
	
	public void viewDropdown(String profile) {		
		if(profile.equals("user")){
			action.clickAction("maindiv", "mainitems", "maindiv_...");
		}else if(profile.equals("workspace")){
			action.clickAction("maindiv", "subitems", "maindiv_...");
		}
	}

	public void selectDisableAccountOption(String disableAccount) {
		action.select(UserWorkspaceOption.DisableAccount, "mainitems");
	}
	
	
	public void findWorkspace(String workspace) {	
		action.inputTextClassName("subitems", workspace);
	}
	
	public void selectWorkspace(String workspace) {	
		action.select("maindiv","subitems",workspace);
	}
	
	public void findUser(String user) {	
		action.inputTextClassName("mainitems", user);
	}
	
	public void selectUser(String user) {
		action.select("maindiv","mainitems",user);
	}
	
	public void selectUserOption(UserWorkspaceOption option) {	
		action.select(option, "mainitems");
	}
	
	public void selectWorkspaceOption(UserWorkspaceOption option) {	
		action.select(option, "subitems");
	}
	
	public void confirmAction(String confirm) {
		action.confirm(confirm);
	}
}
