package com.opus2.pages.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.User;
import com.opus2.util.Util;

import net.serenitybdd.core.Serenity;

public class LoginPage extends Page {
  Util util;
  
  private static final String EMAIL_ID = "eid";
  private static final String PASS_ID = "passwordField";
  private static final String SUBMIT_ID = "submit-login";
  WebElement nameField;
  WebElement passwordField;
  WebElement submitButton;
  @Override
  public Page view(){
    this.openAt(Configuration.loginUrl);
    maximize();
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(EMAIL_ID));
    nameField = this.getDriver().findElement(By.id(EMAIL_ID));
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(PASS_ID));
    passwordField = this.getDriver().findElement(By.id(PASS_ID));
    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(SUBMIT_ID));
    submitButton = this.getDriver().findElement(By.id(SUBMIT_ID));
    return this;
  }
  private void maximize() {
    getDriver().manage().window().maximize();
  }
  public void authenticateSuccessFullyReal() {
    User user = Configuration.getSelectedUser();
    authenticateBy(user.getEmail().trim(),user.getPassword().trim());
    this.waitForPageToLoad();
  }
  
  public void authenticateSuccessFully() {
    User user = Configuration.getSelectedUser();
    authenticateBy(user.getEmail().trim(),user.getPassword().trim());
    checkSession();
  }
  
  public void checkSession()
  { 
      Util.pause(3);
      
      WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
      WebElement homemain = driver.findElement(By.id("homemain")); 
      if ((homemain.getSize().height == 318)){
          return;
      }
      else if ((homemain.getSize().height == 397)){
          forceLogout();
          return;
      }
  }
  
  public void forceLogout(){
    WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    WebElement forceLogoutChkBox = driver.findElement(By.id("breakid"));
    forceLogoutChkBox.click();
    User user = Configuration.getSelectedUser();
    authenticateBy2(user.getEmail().trim(),user.getPassword().trim());
  }

  public void authenticateBy(String email , String password){
    nameField.clear();
    passwordField.clear();
    nameField.sendKeys(email);
    passwordField.sendKeys(password);
    submitButton.click();
    this.waitForPageToLoad();
  }	
  
  public void authenticateBy2(String email , String password){
    nameField = this.getDriver().findElement(By.id(EMAIL_ID));
    passwordField = this.getDriver().findElement(By.id(PASS_ID));
    submitButton = this.getDriver().findElement(By.id(SUBMIT_ID));
    nameField.clear();
    passwordField.clear();
    nameField.sendKeys(email);
    passwordField.sendKeys(password);
    submitButton.click();
    this.waitForPageToLoad();
  } 
}