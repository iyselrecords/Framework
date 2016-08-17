package com.opus2.dialog.addtochronology;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class AddToChronology extends Page{
	private static final String CHRONOLOGY = "Chronology";
	private static final String ADD_TO_CHRON_CANCEL = "add-to-chron_Cancel";
	private static final String X_BUTTON = "add-to-chron dialogClose-div";
	private static final String ADD_TO_CHRON_DIALOG = "add-to-chron";
	
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.subMenu(CHRONOLOGY);
	}

	public void addToChronOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(ADD_TO_CHRON_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(ADD_TO_CHRON_CANCEL);
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
		return dialog.notVisible(ADD_TO_CHRON_DIALOG);
	}
}
