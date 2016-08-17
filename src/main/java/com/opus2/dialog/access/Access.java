package com.opus2.dialog.access;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class Access extends Page {
	private static final String ACCESS = "Access";
	private static final String ACCESS_DIALOG = "access";
	private static final String ACCESS_CANCEL = "access_Cancel";
	private static final String X_BUTTON = "access dialogClose-div";

	private RightClickMenu option;
	private Dialog dialog;
	private Button button;
	
	
	public WebElement hasOption() {
		return option.hasOption(ACCESS);
	}
	
	public void accessOption(){
		hasOption().click();
	}
	
	public String dialog() {
		return dialog.hasDialog(ACCESS_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(ACCESS_CANCEL);
	}
	
	public void closeDialog() {
		cancelButton().click();
	}

	public String notVisible() {
		return dialog.notVisible(ACCESS_DIALOG);
	}
	
	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}
}
