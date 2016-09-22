package com.opus2.magnum.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;

public class AccountPage extends Page {

	public void account01() {
		print();
	}

	public void account02() {
		print();
	}
	
	public void account03() {
		print();
	}
	
	public void account04() {
		print();
	}
	
	public void account05() {
		print();
	}
	
	public void account06() {
		print();
	}
	
	public void account07() {
		print();
	}
	
	public void print() {
		System.out.println("Mapping Complete");
	}

	public void accountPage() {
		WebElement acc = Util.getDriver().findElement(By.linkText(Configuration.getSelectedUser().getEmail()));
		acc.click();
		Util.pause(3);
	}
}
