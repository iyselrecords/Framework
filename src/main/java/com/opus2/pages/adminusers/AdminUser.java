package com.opus2.pages.adminusers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;

public class AdminUser extends Page {
	private static final String SYSTEM_ADMIN_BUTTON = "home-buttons_SystemAdmin";
	private static final String ADD_NEW_USER_BUTTON = "maintoolbar_AddaNewUser";
	private static final String ADD_A_NEW_USER_DIALOG = "new-user";
	private static final String ADD_A_NEW_USER_INVITE = "new-user_Invite";
	public static final String EMAIL_ADDRESS = "t2k4@opus2.com";
	private static final String EMAIL_LIST = "mainitems";
	private static final String ADD_A_NEW_USER__CANCEL = "new-user_Cancel";
	private static final String X_BUTTON = "new-user dialogClose-div";
	
	private Dialog dialog;	
	private Button button;
	
	
	public String currentUrl() {
		return this.getDriver().getCurrentUrl();
	}

	public WebElement systemAdminButton() {
		return this.getElement(SYSTEM_ADMIN_BUTTON);
	}

	public void goToAdminUser() {
		systemAdminButton().click();
		switchToCurrentWindow();
		this.waitForPageToLoad();
	}
	
	public void switchToCurrentWindow() {
		Util.pause(2);
		for(String currentHandle : this.getDriver().getWindowHandles()){
			getDriver().switchTo().window(currentHandle);
		}
	}

	public WebElement addNewUserButton() {
		return this.getElement(ADD_NEW_USER_BUTTON);
	}

	public void addNewUser() {
		addNewUserButton().click();
	}

	public String dialog() {
		return this.getElement(ADD_A_NEW_USER_DIALOG)
			.getCssValue("display");
	}
	
	public WebElement emailTextBox() {
		return this.getElement(ADD_A_NEW_USER_DIALOG)
			.findElements(By.tagName("input")).get(0);
	}

	public void inputEmail() {
		emailTextBox().sendKeys(EMAIL_ADDRESS);
	}

	public void invite() {
		this.getElement(ADD_A_NEW_USER_INVITE)
		 	.click();
		 Util.pause(2);
	}

	public WebElement userEmail() {
		return emailAddress();
	}

	private WebElement emailAddress() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(EMAIL_LIST));
		WebElement email = null;
		List <WebElement> emails = this.getDriver().findElements(By.className(EMAIL_LIST)).get(0)
			.findElements(By.className("auc2"));
		for(WebElement mail : emails){
			if(mail.findElements(By.tagName("span")).get(0).getText().equals(EMAIL_ADDRESS)){
				email = mail;
			}
		}
		return email;
	}
	
	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public String notVisible() {
		return dialog.notVisible(ADD_A_NEW_USER_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(ADD_A_NEW_USER__CANCEL);
	}

	public void closeDialog() {
		cancelButton().click();
	}
}
