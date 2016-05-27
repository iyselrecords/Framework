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
	
	public void goTo() {
		getDriver().findElement(By.id("magnumAdmin")).click();
	}
		
	public void select(SideMenu menu){		
		switch(menu){
			case Overview:
	            sideMenuSelect(menu, "activemenuitem");
	            break;
	        case Roles:
	        	//sideMenuSelect(menu, "menuitem");
	        	sideMenuRoleHack();
	            break;
	        case Users:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case Groups:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case DocumentStamps:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case Metadata:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case DocumentTags:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case Recovery:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case Settings:
	        	sideMenuSelect(menu, "menuitem");
	            break;
	        case MonitorActivity:
	        	sideMenuSelect(menu, "adminlink");
	            break;
	        case ACLReports:
	        	sideMenuSelect(menu, "adminlink");
	            break;
		}
	}
	
	private void sideMenuSelect(SideMenu menu, String elem){
		WebElement sideMenu = getDriver().findElements(By.className("menudiv")).get(0);
        List<WebElement> rows = sideMenu.findElements(By.className(elem));

        for (int i = 1; i < rows.size(); i++)
        {       	
            if (rows.get(i).getText().equals(menu.enumField()))
            {
            	rows.get(i).click();
                 break;
            }
        }
	}
	
	private void sideMenuRoleHack(){
		WebElement sideMenu = getDriver().findElement(By.id("settingsmain"))
				.findElements(By.className("menudiv")).get(0);
        sideMenu.findElements(By.tagName("tr")).get(2)
        .findElements(By.tagName("td")).get(0).click();
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
			util.clickAction("settingsmain","floatleft","button",0);
		}

		public static void enterNewRole(String newrole) {
			util.inputTextClassName("panel-header", newrole);
		}

		public static void generalCapabilities() {
			util.setCapabilities(3,13);			
		}
		public static void documentsCapability() {
			util.setCapabilities(14,15);			
		}
		public static void transcriptsCapabilities() {
			util.setCapabilities(16,18);			
		}
		public static void chronologyCapabilities() {
			util.setCapabilities(19,21);			
		}
		public static void exportingCapabilities() {
			util.setCapabilities(22,24);			
		}

		public static void saveChanges() {
			util.clickAction("settingsmain","floatleft","button","Save change to the roles table");		
			//util.acceptAlert();
		}

		public static void edit(String newrole) {
			event.editNewRole(newrole);
			util.setCapabilities(6,9);
			util.wait(0.5);
			util.setCapabilities(17,18);
			util.wait(0.5);		
			util.setCapabilities(19,20);
			util.wait(0.5);	
			util.setCapabilities(23,24);
			util.wait(0.5);
			util.clickAction("settingsmain","floatleft","button","Save change to the roles table");
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
	
}
