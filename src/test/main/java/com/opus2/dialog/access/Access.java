package com.opus2.dialog.access;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;

public class Access extends Page {
	private static final String ACCESS = "access";
	private static final String ACCESS_CANCEL = "access_Cancel";
	private static final String X_BUTTON = "access dialogClose-div";
	Dialog action;
	Button button;
	
	@FindBy(id=ACCESS_CANCEL)
	private Button cancel;
	
	public WebElement hasButton() {
		return button.hasButton(ACCESS_CANCEL);
	}
	
	public void close() {
		hasButton().click();
		Util.pause(1);
	}

	public WebElement dialog() {
		return action.hasDialog(ACCESS);
	}

	public void closeByXButton() {
		action.xButton(X_BUTTON).click();
		Util.pause(1);
	}
}
