package com.opus2.pages.documents.rightclickmenu;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class DocumentsRightClickMenu extends Page {
	private RightClickMenu doc;	
	private static final String DOCUMENT_TITLE = "autolink";
	private static final String FOLDER_TITLE = "Test";
	private static final String MENU = "rightClickMenu";
	private Dialog dialog;
	

	public WebElement getDocument() {
		return doc.getDocument(DOCUMENT_TITLE);
	}

	public void rightclickDocument() {
		doc.rightclickDocument(DOCUMENT_TITLE);
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
