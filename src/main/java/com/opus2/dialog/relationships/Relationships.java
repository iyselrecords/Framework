package com.opus2.dialog.relationships;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class Relationships extends Page {
	private static final String RELATIONSHIPS = "Related Documents";
	private static final String RELATIONSHIPS_DIALOG = "relationships";
	private static final String RELATIONSHIPS_CANCEL = "relationships_Cancel";
	private static final String X_BUTTON = "relationships dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(RELATIONSHIPS);
	}

	public void relatedDocumentOption() {
		hasOption().click();
	}

	public WebElement dialog() {
		return dialog.hasDialog(RELATIONSHIPS_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(RELATIONSHIPS_CANCEL);
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
		return dialog.notVisible(RELATIONSHIPS_DIALOG);
	}
}
