package com.opus2.pages.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;
import com.opus2.util.User;

import net.serenitybdd.core.Serenity;

public class LoginPage extends Page {

  private static final String EMAIL_ID = "eid";
  private static final String PASS_ID = "passwordField";
  private static final String SUBMIT_ID = "submit-login";
  WebElement nameField;
  WebElement passwordField;
  WebElement submitButton;
  public LoginPage() {
  }
  @Override
  public Page view(){
    Configuration.getInstance();
    this.openAt(Configuration.loginUrl);
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(EMAIL_ID));
    nameField = this.getDriver().findElement(By.id(EMAIL_ID));
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(PASS_ID));
    passwordField = this.getDriver().findElement(By.id(PASS_ID));
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(SUBMIT_ID));
    submitButton = this.getDriver().findElement(By.id(SUBMIT_ID));
    return this;
  }
  public void authenticateSuccessFully() {
    User user = Configuration.getSelectedUser();
    authenticateBy(user.getEmail().trim(),user.getPassword().trim());
  }

  public void forceLogout() {
    WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    WebElement forceLogoutChkBox = driver.findElement(By.id("breakid"));
    forceLogoutChkBox.click();
  }

  public void authenticateBy(String email , String password){
    System.out.println("the email is "+email);
    System.out.println("The pass is "+password);
    nameField.clear();
    passwordField.clear();
    nameField.sendKeys(email);
    passwordField.sendKeys(password);
    submitButton.click();

  }	
}