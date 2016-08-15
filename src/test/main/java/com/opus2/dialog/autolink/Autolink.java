package com.opus2.dialog.autolink;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class Autolink extends Page {	
	private static final String AUTOLINK = "Autolink";
	private static final String AUTOLINK_CLOSE = "autolink_Close";
	private static final String X_BUTTON = "autolink dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(AUTOLINK);
	}

	public void autolinkOption() {
		hasOption().click();
	}

	public WebElement dialog() {
		Util.pause(2);
		return dialog.hasDialog(AUTOLINK.toLowerCase());
	}

	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public WebElement hasButton() {
		return button.hasButton(AUTOLINK_CLOSE);
	}

	public void close() {
		hasButton().click();
	}

	public void isNotVisiable() {
		dialog.isNotVisible(AUTOLINK.toLowerCase());;
	}

}
