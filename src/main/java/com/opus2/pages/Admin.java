package com.opus2.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.enums.SideMenu;
import com.opus2.enums.UserActivity;
import com.opus2.enums.UsersCap;
import com.opus2.util.Constants;
import com.opus2.util.Event;
import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Admin extends PageObject {
	public WebDriver driver = getDriver();
	public static Metadata metadata;
	public static Roles roles;
	public static Users users;
	public static Util util;
	static Event event;
	public static MonitorActivity monitorActivity;
	static UserAction action;
	
		
	public void select(SideMenu menu){		
		action.adminSidemMenu(menu);
	}
	
	public static class Metadata 
	{

		public static void edit(String type) {
			event.selectDocumentType(type.toString());
		}
		
	}
	
	public static class Roles
	{
		public static void newRole() {
			action.clickAction("settingsmain","floatleft","button",0);
		}

		public static void enterNewRole(String newrole) {
			action.inputTextClassName("panel-header", newrole);
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
			util.wait(0.5);
			action.setCapabilities(17,18);
			util.wait(0.5);		
			action.setCapabilities(19,20);
			util.wait(0.5);	
			action.setCapabilities(23,24);
			util.wait(0.5);
		}
	}
	
	public static class Users
	{

		public static void select(UsersCap edit, String email) {
			event.selectUser(edit, email);
		}
		
	}
	
	public static class MonitorActivity
	{

		public static void show(UserActivity userActivity) {
            event.userActivity(userActivity);
		}
	}

	public void backToAdmin() {
		action.clickAction("adminbackbutton", "a", 0);
	}
	
}
