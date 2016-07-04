package com.opus2.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;
import com.opus2.util.User;
public class LoginPage extends Page {
	
	@FindBy(id="eid")
	WebElement nameField;
	@FindBy(id="passwordField")
	WebElement passwordField;
	@FindBy(id="submit-login")
	WebElement submitButton;
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public Page view(){
		this.openAt(Configuration.getInstance().loginUrl);
		return this;
	}
	public void authenticateSuccessFully() {
		User user = Configuration.getInstance().getSelectedUser();
		nameField.sendKeys(user.getEmail());
		passwordField.sendKeys(user.getPassword());
	}
    public void loginAsUser(User user){
    	Configuration.getInstance().setUser(user);
    	authenticateSuccessFully();
    }
	
	private void forceLogout() {
        WebElement forceLogoutChkBox = driver.findElement(By.id("breakid"));
        forceLogoutChkBox.click();
	}
	
	

	
}