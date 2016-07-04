package com.opus2.pages;

import org.openqa.selenium.WebDriver;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;

public class AdminUsersPage extends Page {

	public AdminUsersPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public Page view() {
		this.openAt(Configuration.getInstance().adminUsersUrl);
		return this;
	}

}
