package com.opus2.dialog.bulkReplace;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class BulkReplace extends Page {
	private static final String BULK_REPLACE = "Bulk doc replace";
	private static final String BULK_REPLACE_CLOSE = "bulk-replacement_Close";
	private static final String X_BUTTON = "bulk-replacement dialogClose-div";
	private static final String BULK_REPLACE_DIALOG = "bulk-replacement";
	
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	
	public WebElement hasOption() {
		return option.hasOption(BULK_REPLACE);
	}

	public void bulkReplaceOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(BULK_REPLACE_DIALOG);
	}

	public WebElement closeButton() {
		return button.hasButton(BULK_REPLACE_CLOSE);
	}

	public void closeDialog() {
		closeButton().click();
	}

	public String notVisible() {
		return dialog.notVisible(BULK_REPLACE_DIALOG);
	}	
	
	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}
}
