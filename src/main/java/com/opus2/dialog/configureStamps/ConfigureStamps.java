package com.opus2.dialog.configureStamps;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class ConfigureStamps extends Page {
	private static final String CONFIGURE_STAMPS = "Configure Stamps";
	private static final String CONFIGURE_STAMPS_CANCEL = "stamp-chooser_Cancel";
	private static final String X_BUTTON = "stamp-chooser dialogClose-div";
	private static final String CONFIGURE_STAMPS_DIALOG = "stamp-chooser";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	
	public WebElement hasOption() {
		return option.hasOption(CONFIGURE_STAMPS);
	}

	public void configureStampsOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(CONFIGURE_STAMPS_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(CONFIGURE_STAMPS_CANCEL);
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
		return dialog.notVisible(CONFIGURE_STAMPS_DIALOG);
	}
}
