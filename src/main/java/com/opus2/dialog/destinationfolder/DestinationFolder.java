package com.opus2.dialog.destinationfolder;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class DestinationFolder extends Page {
	private static final String COPY_OPTION = "Copy";
	private static final String X_BUTTON = "doc-chooser dialogClose-div";
	private static final String DOC_DEST_CANCEL = "doc-chooser_Cancel";
	private static final String DOC_CHOOSER_DIALOG = "doc-chooser";
	
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(COPY_OPTION);
	}

	public void copyOption() {
		hasOption().click();
	}

	public WebElement dialog() {
		return dialog.hasDialog(DOC_CHOOSER_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(DOC_DEST_CANCEL);
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
		return dialog.notVisible(DOC_CHOOSER_DIALOG);
	}
}
