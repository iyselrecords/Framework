package com.opus2.pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;
import com.opus2.util.components.home.CasesSelection;


public class Home extends Page {
	private static final String HOME_ID = "homemain";
	private static final String NEW_WORKSPACE = "home-buttons_NewWorkspace";
	private static final String MANAGE_USERS_ID = "home-buttons_ManageUsersandWorkspaces";
	@FindBy(id=NEW_WORKSPACE)
	private WebElement newWorkspaceBtn;
	@FindBy(id=MANAGE_USERS_ID)
	private WebElement manageUsersBtn;
	private CasesSelection cases;
	public Home(){
	  cases = new CasesSelection();
	}
	
	public void makeWorkspace(String title , String description){
		
	}
	public List<WebElement> searchWorkspace(String title){
		return cases.findCase(title);
	}
	public boolean hasWorkspaceInTheList(String wsid){
	  return cases.containsElements(By.id(cases.getWorkspaceItemId(wsid)));
	}
	public Page visitWorkspace(String wsid){
	  if(hasWorkspaceInTheList(wsid)){
	    cases.selectWorkspace(wsid);
	    return new DocumentsPage(wsid);
	  }
	  return null;
	}
	public boolean isCasesListVisible(){
	  return cases.isVisible();
	}
	public AdminUsersPage manageUsers(){
		manageUsersBtn.click();
		return new AdminUsersPage();
	}
	@Override
	public Page view() {
		Configuration.getInstance();
        this.openAt(Configuration.homeUrl);
        withTimeoutOf(20,TimeUnit.SECONDS).waitForPresenceOf(By.id(HOME_ID));
        me = this.element(By.id(HOME_ID));
        cases.init();
		return this;
	}
	
}
