package com.opus2.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://customer.opus2.com/")
public class LoginPage extends PageObject {
	Util util;
	UserAction user;
	
	
	public void initialize() {
		getDriver().manage().window().maximize();
		util.pause(1);
	}
	public void navigateTo() {
		getDriver().navigate().to(Configuration.defaultUrl());
	}
	public void loginAs(String username) {
		user.inputTextId("eid", username);
	}

	public void withPassword(String password) {
		user.inputTextId("passwordField", password);
	}
	
	public void login(String elementId) {
		user.clickAction(elementId);
	}

	public void checkSession() throws IOException
    {	
		util.pause(1);
		WebElement homemain = getDriver().findElement(By.id("homemain"));
        if ((homemain.getSize().height > 160) && (homemain.getSize().height < 172))
        {
        	return;
        }
        else if ((homemain.getSize().height > 390) && ((homemain.getSize().height < 400)))
        {
        	forceLogout();
        	loginAs(Configuration.email); withPassword(Configuration.password);login("submit-login");
            //firstStageLogin(username, password);
            return;
        }
    }
	public void checkSession(String username, String password)
    {		
		util.pause(2);
		WebElement homemain = getDriver().findElement(By.id("homemain"));
        if ((homemain.getSize().height > 160) && (homemain.getSize().height < 172))
        {
        	return;
        }
        else if ((homemain.getSize().height > 390) && ((homemain.getSize().height < 400)))
        {
        	forceLogout();
            firstStageLogin(username, password);
            return;
        }
    }
	public void firstStageLogin(String username, String password)
    {
		loginAs(username);
        withPassword(password);
        login("submit-login");
    }
	private void forceLogout() {
		util.pause(0.5);
        user.clickAction("breakid");
	}

	private void secondStageLogin() {
		getCharacter(0);
		getCharacter(1);
		getCharacter(2);		
		login("submitbtn");
	}

	
	public void getCharacter(int index)
    {
		//user.getCharacter(index);
		user.grabIndex(index);
    }

	public void firstMemorableCharacter() {
		getCharacter(0);
	}

	public void secondMemorableCharacter() {
		getCharacter(1);
	}

	public void thirdMemorableCharacter() {
		getCharacter(2);
	}

	
}