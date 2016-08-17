package com.opus2.dialog.foldercolor;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class FolderColour extends Page{
	private static final String FOLDER_COLOR = "Folder Color";
	private static final String FOLDER_COLOR_DIALOG = "folder-colour";
	private static final String FOLDER_COLOR_CANCEL = "folder-colour_Cancel";
	private static final String X_BUTTON = "folder-colour dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	
	public WebElement hasOption() {
		return option.hasOption(FOLDER_COLOR);
	}

	public void folderColorOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(FOLDER_COLOR_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(FOLDER_COLOR_CANCEL);
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
		return dialog.notVisible(FOLDER_COLOR_DIALOG);
	}
}
