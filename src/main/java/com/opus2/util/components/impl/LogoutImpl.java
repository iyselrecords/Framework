package com.opus2.util.components.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Logout;

public class LogoutImpl extends ButtonImpl implements Logout{

	public LogoutImpl(WebDriver driver, ElementLocator locator,
			long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accceptAlert() {
		Util.pause(1);
		Util.getDriver().switchTo().alert().accept();
	}

}
