package com.opus2.magnum.home.managenewuserandworkspace;

import org.openqa.selenium.WebElement;

import com.opus2.pages.adminusers.AdminUser;

import net.thucydides.core.annotations.Step;

public class AdminUserSteps {
	AdminUser user;
	
	@Step("current page")
	public String currentUrl() {
		return user.currentUrl();
	}

	@Step("system admin button is visible")
	public WebElement systemAdminButton() {
		return user.systemAdminButton();
	}
	
	@Step("navigate to admin user page")
	public void goToAdminUser() {
		user.goToAdminUser();
	}
	
	@Step("dummy data")
	public String assertDIP(){
	    return "TDIP";
	}
}
