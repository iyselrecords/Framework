package com.opus2.pages.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;

public class NavigationShortcut extends Page {
	
	private static final String DOCUMENTS_SHORTCUT = "documents-option";
	private static final String TRANSCRIPTS_SHORTCUT = "transcripts-option";
	private static final String CHRONOLOGY_SHORTCUT = "chron-option";
	private static final String NOTES_SHORTCUT = "notes-option";
	
	
	public WebElement documentsImage() {
		return this.getElement(DOCUMENTS_SHORTCUT)
			.findElements(By.tagName("img")).get(0);
	}
	
	public void docShortcut() {
		documentsImage().click();
	}
	
	public WebElement transcriptsImage() {
		return this.getElement(TRANSCRIPTS_SHORTCUT)
			.findElements(By.tagName("img")).get(0);
	}
	
	public void transShortcut() {
		transcriptsImage().click();
	}
	
	public WebElement chrnologyImage() {
		return this.getElement(CHRONOLOGY_SHORTCUT)
			.findElements(By.tagName("img")).get(0);
	}
	
	public void chronShortcut() {
		chrnologyImage().click();
	}

	public WebElement notesImage() {
		return this.getElement(NOTES_SHORTCUT)
			.findElements(By.tagName("img")).get(0);
	}

	public void notesShortcut() {
		notesImage().click();
	}
}
