package com.opus2.pages.navigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Tabs;

public class Navigation extends Page {
	
	private static final String DOCUMENT_TAB = "documents";
	private static final String TRANSCRIPTS_TAB = "transcripts";
	private static final String CHRONOLOGY_TAB = "chronology";
	private static final String NOTES_TAB = "notes";
	private static final String SEARCH_TAB = "search";
	private static final String ADMIN_TAB = "admin";
	private static final String HOME_ICON = "logo";
	private static final String PANEL_HEADER = "panel-header";
	
	

	@FindBy(id=DOCUMENT_TAB)
	private Tabs docs;
	
	@FindBy(id=TRANSCRIPTS_TAB)	
	private Tabs trans;
	
	@FindBy(id=CHRONOLOGY_TAB)
	private Tabs chron;
	
	@FindBy(id=NOTES_TAB)
	private Tabs notes;
	
	@FindBy(id=SEARCH_TAB)
	private Tabs search;
	
	@FindBy(id=ADMIN_TAB)
	private Tabs admin;
	
	@FindBy(id=HOME_ICON)
	private Tabs home;
	
	
	public String getCurrentUrl(){
		return Util.getDriver().getCurrentUrl();
	}
	
	public WebElement homeIcon() {  
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(HOME_ICON));	    
		return home;
	}
	
	public WebElement docTab(){
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(DOCUMENT_TAB));	    
		return docs;
	}
	
	public void documentsTab(){
		docTab().click();
	}
	
	public WebElement chronTab(){
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(CHRONOLOGY_TAB));	    
		return chron;
	}
	
	public void chronologyTab(){
		chronTab().click();
	}
	
	public WebElement transTab(){
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(TRANSCRIPTS_TAB));	    
		return trans;
	}
	
	public void transcriptsTab() {
		trans.click();
	}

	public WebElement noteTab(){
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(NOTES_TAB));	    
		return notes;
	}
	
	public void notesTab() {
		noteTab().click();
	}
	
	public WebElement searcTab(){
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(SEARCH_TAB));	    
		return search;
	}
	
	public void searchTab(){
		searcTab().click();
	}
	
	public WebElement admin_Tab(){
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(ADMIN_TAB));	    
		return admin;
	}
	
	public void adminTab() {
		admin_Tab().click();
	}

	public WebElement getCasesSection() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(PANEL_HEADER));	
		return this.getDriver().findElements(By.className(PANEL_HEADER)).get(0);
	}

	public WebElement workspaceTitle() {
		return this.getElement("a-" + Configuration.getSelectedUser().getWorkspace());
	}
	
	public void getWorkspace() {
		workspaceTitle().click();
	}

	
	
	
}
