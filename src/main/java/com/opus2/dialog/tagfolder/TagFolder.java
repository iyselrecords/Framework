package com.opus2.dialog.tagfolder;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class TagFolder extends Page {
	private static final String TAG_FOLDER = "Tag Folder";
	private static final String TAG_FOLDER_DIALOG = "tagFolderDialog";
	private static final String TAG_FOLDER_NO = "tagFolderDialog_No";
	private static final String X_BUTTON = "tagFolderDialog dialogClose-div";

	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(TAG_FOLDER);
	}

	public void tagFolderOption() {
		hasOption().click();
	}

	public WebElement dialog() {
		return dialog.hasDialog(TAG_FOLDER_DIALOG);
	}
	
	public WebElement noButton() {
		return button.hasButton(TAG_FOLDER_NO);
	}

	public void closeDialog() {
		noButton().click();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
		return dialog.notVisible(TAG_FOLDER_DIALOG);
	}
}
