package com.opus2.dialog.reorder;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class ReOrder extends Page {
	private static final String REORDER = "Reorder";
	private static final String REORDER_DIALOG = "reorder";
	private static final String REORDER_CANCEL = "reorder_Cancel";
	private static final String X_BUTTON = "reorder dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	
	public WebElement hasOption() {
		return option.hasOption(REORDER);
	}

	public void reOrderOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(REORDER_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(REORDER_CANCEL);
	}

	public void closeDialog() {
		cancelButton().click();
        Util.getDriver().switchTo().alert().accept();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
        Util.getDriver().switchTo().alert().accept();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
		return dialog.notVisible(REORDER_DIALOG);
	}
}
