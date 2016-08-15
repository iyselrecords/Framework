package com.opus2.dialog.rename;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class Rename extends Page {
	private static final String RENAME = "Rename";
	private static final String RENAME_DIALOG = "name-dialog";
	private static final String RENAME_CANCEL = "name-dialog_Cancel";
	private static final String X_BUTTON = "name-dialog dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(RENAME);
	}

	public void renameOption() {
		hasOption().click();
	}

	public WebElement dialog() {
		return dialog.hasDialog(RENAME_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(RENAME_CANCEL);
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
		return dialog.notVisible(RENAME_DIALOG);
	}
}
