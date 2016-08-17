package com.opus2.dialog.rotate;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class PageRotate extends Page {
	private static final String ROTATE_OPTION = "Rotate";
	private static final String ROTATE_DIALOG = "page-rotation";
	private static final String ROTATE_CLOSE_BUTTON = "page-rotation_Close";
	private static final String X_BUTTON = "page-rotation dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(ROTATE_OPTION);
	}

	public void pageRotateOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(ROTATE_DIALOG);
	}
	
	public WebElement closeButton() {
		return button.hasButton(ROTATE_CLOSE_BUTTON);
	}

	public void closeDialog() {
		closeButton().click();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
		return dialog.notVisible(ROTATE_DIALOG);
	}
}
