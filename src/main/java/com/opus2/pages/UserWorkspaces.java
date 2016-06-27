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
	
	public void enterUserEmail() {
		UserAction.currentValue =  "taf"+ action.getTime()+"@opus2.com";
		String email = UserAction.currentValue;
		action.inputText("new-user", email);
	}
	
	public void inviteUser() {
		action.clickAction("new-user_Invite");
	}
	
	public void newWorkspace() {
		action.clickAction("maintoolbar_NewWorkspace");
	}
	
	public void enterTitleAndDescription() {
		UserAction.currentValue = "wks_" + action.getTime();
		util.pause(1);
		String title = UserAction.currentValue;
		String desc = "Automation Framework";
		action.inputText("new-ws", title);	
		action.inputTextArea("new-ws", desc);
	}
	
	public void createWorkspace() {
		action.clickAction("new-ws_Createworkspace");
	}
	
	public void confirmDelete() {		
		util.pause(2);
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
		if(UserAction.currentValue == null){
			action.inputTextClassName("mainitems", user);
			return;
		}else{
			user = UserAction.currentValue;
			action.inputTextClassName("mainitems", user);
		}
	}
	
	public void selectUser(String user) {
		action.select("maindiv","users",user);
	}
	
	public void selectUserOption(UserWorkspaceOption option) {	
		action.select(option, "mainitems");
	}
	
	public void selectWorkspaceOption(UserWorkspaceOption option) {	
		action.select(option, "subitems");
	}
	
	public void confirmAction(String confirm) {
		action.confirm(confirm);
		util.pause(3);
	}
}
