package com.opus2.magnum.adminusers.find;

import org.openqa.selenium.WebElement;

import com.opus2.magnum.adminuser.find.FindUser;

import net.thucydides.core.annotations.Step;

public class FindUserSteps {
	FindUser user;
	
	@Step("find input is visible")
	public WebElement findInput() {
		return user.findInput();
	}

	public WebElement userEmail() {
		return user.userEmail();
	}
	
	public void findUser() {
		user.findUser();
	}
	
	public WebElement filteredUser() {
		return user.filteredUser();
	}

	@Step("user checked")
	public WebElement userChecked() {
		return user.userChecked();
	}

	@Step("select user")
	public void selectUser() {
		user.selectUser();
	}

	public WebElement allCheckbox() {
		return user.allCheckbox();
	}

	public void selectAll() {
		user.selectAll();
	}

	public WebElement checkedAll() {
		return user.checkedAll();
	}
}
