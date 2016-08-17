package com.opus2.dialog.enabledisableexport;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class EnableDisableExport extends Page {
	private static final String ENABLE_DISABLE_EXPORT = "Enable/Disable Export";
	private static final String ENABLE_DISABLE_EXPORT_DIALOG = "enable-disable-export";
	private static final String ENABLE_DISABLE_EXPORT_CLOSE = "enable-disable-export_Close";
	private static final String X_BUTTON = "enable-disable-export dialogClose-div";

	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(ENABLE_DISABLE_EXPORT);
	}

	public void enbDsbExpOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(ENABLE_DISABLE_EXPORT_DIALOG);
	}
	
	public WebElement closeButton() {
		return button.hasButton(ENABLE_DISABLE_EXPORT_CLOSE);
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
		return dialog.notVisible(ENABLE_DISABLE_EXPORT_DIALOG);
	}
}
