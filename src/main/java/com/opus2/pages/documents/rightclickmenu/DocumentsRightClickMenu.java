package com.opus2.pages.documents.rightclickmenu;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opus2.util.Page;
import com.opus2.util.TestData;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class DocumentsRightClickMenu extends Page {
	private RightClickMenu doc;	
	private static final String DOCUMENT_TITLE = TestData.DOCUMENTS_.getProperty("document");
	private static final String FOLDER_TITLE = "Test";
	private static final String MENU = "rightClickMenu";
	private Dialog dialog;
	

	public WebElement getDocument() {
		return this.getDocument(DOCUMENT_TITLE);
	}

	public void rightclickDocument() {
		Actions action = new Actions(this.getDriver());
        action.contextClick(getDocument()).sendKeys(Keys.ARROW_DOWN).perform();
	}
	
	public String hasMenu() {
		return dialog.hasDialog(MENU);
	}
	
	public WebElement getFolder() {
		return doc.getFolder(FOLDER_TITLE);
	}

	public void rightclickFolder() {
		doc.rightclickFolder(FOLDER_TITLE);
	}
}
