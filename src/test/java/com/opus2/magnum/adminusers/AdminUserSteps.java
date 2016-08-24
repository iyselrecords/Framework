package com.opus2.magnum.adminusers;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

import com.opos2.pages.adminusers.AdminUser;

public class AdminUserSteps {
	AdminUser user;

	@Step("current page url")
	public String currentUrl() {
		return user.currentUrl();
	}
	
	@Step("add new user button is visible")
	public WebElement addNewUserButton() {
		return user.addNewUserButton();
	}

	@Step("add a new user")
	public void addNewUser() {
		user.addNewUser();
	}

	@Step("dialog is visible")
	public String dialog() {
		return user.dialog();
	}
	
	@Step("add new user button is visible")
	public WebElement emailTextBox() {
		return user.emailTextBox();
	}
	
	@Step("enter new user email")
	public void inputEmail() {
		user.inputEmail();
	}
	
	@Step("invite user")
	public void invite() {
		user.invite();
	}

	@Step("new email visible on list")
	public WebElement userEmail() {
		return user.userEmail();
	}
	
	@Step("x button is visible")
	public WebElement xButton() {
		return user.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		user.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return user.notVisible();
	}
	
	@Step("close button is visible")
	public WebElement cancelButton() {
		return user.cancelButton();
	}

	@Step("close dialog")
	public void closeDialog() {
		user.closeDialog();
	}
}
