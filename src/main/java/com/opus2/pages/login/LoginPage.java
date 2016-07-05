package com.opus2.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;
import com.opus2.util.User;

import net.serenitybdd.core.Serenity;

public class LoginPage extends Page {
	
	@FindBy(id="eid")
	WebElement nameField;
	@FindBy(id="passwordField")
	WebElement passwordField;
	@FindBy(id="submit-login")
	WebElement submitButton;
	public LoginPage() {
	}
	@Override
  public Page view(){
		Configuration.getInstance();
    this.openAt(Configuration.loginUrl);
		return this;
	}
	public void authenticateSuccessFully() {
		Configuration.getInstance();
    User user = Configuration.getSelectedUser();
		authenticateBy(user.getEmail(),user.getPassword());
	}
    public void loginAsUser(User user){
    	Configuration.getInstance();
      Configuration.setUser(user);
    	authenticateSuccessFully();
    }
	
	public void forceLogout() {
		WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        WebElement forceLogoutChkBox = driver.findElement(By.id("breakid"));
        forceLogoutChkBox.click();
	}
	
	public void authenticateBy(String email , String password){
		nameField.sendKeys(email);
		passwordField.sendKeys(password);
		submitButton.click();
	}
	

	
}