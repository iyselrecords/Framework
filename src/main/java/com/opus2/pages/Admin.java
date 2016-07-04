package com.opus2.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.enums.MetadataOption;
import com.opus2.enums.SideMenu;
import com.opus2.enums.UserActivity;
import com.opus2.enums.UsersCap;
import com.opus2.util.Event;
import com.opus2.util.Util;

import net.serenitybdd.core.pages.PageObject;

public class Admin extends PageObject {
	static UserAction action;
	static Util util;
	static Event event;
	public static Roles roles;
	public static Users users;
	
	public static MonitorActivity monitorActivity;
	
	
	public void select(SideMenu menu){
		switch(menu){
		case Overview:
            SideMenuSelect(menu, "menuitem");
            break;
        case Roles:
            SideMenuSelect(menu, "menuitem");
            break;
        case Users:
            SideMenuSelect(menu, "menuitem");
            break;
        case Groups:
        	SideMenuSelect(menu, "menuitem");
            break;
        case DocumentStamps:
            SideMenuSelect(menu, "menuitem");
            break;
        case Metadata:
            SideMenuSelect(menu, "menuitem");
            break;
        case DocumentTags:
            SideMenuSelect(menu, "menuitem");
            break;
        case Recovery:
            SideMenuSelect(menu, "menuitem");
            break;
        case Settings:
            SideMenuSelect(menu, "menuitem");
            break;
        case MonitorActivity:
        	SideMenuSelect(menu, "adminlink");
            break;
        case ACLReports:
        	SideMenuSelect(menu, "adminlink");
            break;
        case ManageWorkspaces:
            SideMenuSelect("Manage workspaces");
            break;
		}
	}

	private void SideMenuSelect(String linkText) {
		action.clickActionLinkText(linkText);
	}
	
	private void SideMenuSelect(SideMenu menu, String className) {
		 util.pause(0.5);
         WebElement sideMenu = getDriver().findElements(By.className("menudiv")).get(0);
         List<WebElement> rows = sideMenu.findElements(By.className(className));
    
         for (int i = 0; i < rows.size(); i++)
         {
             if (rows.get(i).getText().equalsIgnoreCase(menu.enumField()))
             {
                 rows.get(i).click();
                  break;
             }
         }
	}
	public void addNewColumn() {
		action.element("button", "Add New Column").click();
	}
	
	
	//Nested classes
	public static class MonitorActivity
	{

		public static void show(UserActivity userActivity) {
			action.clickActionLinkText(userActivity.returnActivity());
		}
	}
	public static class Roles
	{
		public static void newRole() {
			action.clickAction("settingsmain","floatleft","button",0);
		}

		public static void enterNewRole(String newrole) {
			action.inputTextClassName("panel-header", (newrole+action.getTime()));
		}

		public static void generalCapabilities() {
			action.setCapabilities(3,13);			
		}
		public static void documentsCapability() {
			action.setCapabilities(14,15);			
		}
		public static void transcriptsCapabilities() {
			action.setCapabilities(16,18);			
		}
		public static void chronologyCapabilities() {
			action.setCapabilities(19,21);			
		}
		public static void exportingCapabilities() {
			action.setCapabilities(22,24);			
		}

		public static void saveChanges() {
			action.clickAction("settingsmain","floatleft","button","Save change to the roles table");		
			//action.acceptAlert();
		}
		public static void edit(String newrole) {
			event.editDeleteRole(newrole, 0);
		}
		public static void userCapabilities() {
			action.setCapabilities(6,9);
			util.pause(0.5);
			action.setCapabilities(17,18);
			util.pause(0.5);		
			action.setCapabilities(19,20);
			util.pause(0.5);	
			action.setCapabilities(23,24);
			util.pause(0.5);
		}
		
		public static void selectRole(String role) {
			action.clickAction("settingsmain", "floatleft", 1, "button", 0);
			action.selectDropdown(role);
		}
		
		public static void importRole() {
			action.clickAction("settingsmain", "floatleft", 1, "button", 1);
		}
	}
	
	public static class Users
	{

		public static void select(UsersCap edit, String email) {
			event.selectUser(edit, email);
		}
		
	}
}
