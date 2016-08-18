package com.opus2.pages.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Tabs;

public class Navigation extends Page {
	
	private static final String DOCUMENT_PAGE = "magnumDocuments";
	private static final String TRANSCRIPTS_PAGE = "transcripts";
	private static final String CHRONOLOGY_PAGE = "chronology";
	private static final String NOTES_PAGE = "magnumNotes";
	private static final String SEARCH_PAGE = "search";
	private static final String ADMIN_PAGE = "magnumAdmin";

	@FindBy(id=DOCUMENT_PAGE)
	private Tabs docs;
	
	@FindBy(id=TRANSCRIPTS_PAGE)	
	private Tabs trans;
	
	@FindBy(id=CHRONOLOGY_PAGE)
	private Tabs chron;
	
	@FindBy(id=NOTES_PAGE)
	private Tabs notes;
	
	@FindBy(id=SEARCH_PAGE)
	private Tabs search;
	
	@FindBy(id=ADMIN_PAGE)
	private Tabs admin;
	
	private Button tab;
	
	public WebElement chronTab(){
		return tab.hasButton(CHRONOLOGY_PAGE);
	}
	
	public void chronologyTab(){
		chronTab().click();
	}
	
	public void documentsTab(){
		docs.click();
	}
	public void transcriptsTab() {
		trans.click();
	}

	public void notesTab() {
		notes.click();
	}
	public void searchTab(){
		search.click();
	}
	public void adminTab() {
		admin.click();
	}
}
