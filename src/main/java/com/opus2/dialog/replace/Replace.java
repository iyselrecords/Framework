package com.opus2.dialog.replace;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class Replace extends Page {
	private static final String REPLACE = "Replace";
	private static final String DIALOG_HEADER = "Replace Document";
	private static final String REPLACE_CANCEL_BUTTON = "Cancel";
	private static final String X_BUTTON = "dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(REPLACE);
	}

	public void replaceOption() {
		hasOption().click();
	}

	public WebElement dialog() {
		return dialog.dialog(DIALOG_HEADER);
	}
	
	public WebElement cancelButton() {
		return button.withButton(DIALOG_HEADER, REPLACE_CANCEL_BUTTON);
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
		return dialog.notVisible(DIALOG_HEADER);
	}
}
