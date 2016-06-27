package com.opus2.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.enums.MetadataOption;
import com.opus2.enums.SideMenu;
import com.opus2.enums.UserActivity;
import com.opus2.util.Util;

import net.serenitybdd.core.pages.PageObject;

public class Admin extends PageObject {
	static UserAction user;
	Util util;

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
		user.clickActionLinkText(linkText);
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
		user.element("button", "Add New Column").click();
	}
	
	
	//Nested classes
	public static class MonitorActivity
	{

		public static void show(UserActivity userActivity) {
			user.clickActionLinkText(userActivity.returnActivity());
		}
	}
	
	
}
