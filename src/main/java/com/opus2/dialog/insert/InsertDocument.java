package com.opus2.dialog.insert;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class InsertDocument extends Page {
	private static final String INSERT_DOCUMENT = "Insert";
	private static final String INSERT_DOCUMENT_DIALOG = "insert-document";
	private static final String INSERT_DOCUMENT_CANCEL = "insert-document_Cancel";
	private static final String X_BUTTON = "insert-document dialogClose-div";
		
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(INSERT_DOCUMENT);
	}

	public void insertDocumentOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(INSERT_DOCUMENT_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(INSERT_DOCUMENT_CANCEL);
	}

	public void closeDialog() {
		cancelButton().click();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
		return dialog.notVisible(INSERT_DOCUMENT_DIALOG);
	}
}
