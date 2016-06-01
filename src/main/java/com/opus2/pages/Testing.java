package com.opus2.pages;

import java.util.List;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.util.Constants;
import com.opus2.util.Util;

public class Testing extends PageObject{

	public WebDriver driver = getDriver();
	Util util;
	
	
	public void designInProgress() {
		driver.findElement(By.id("magnumDocuments")).click();
		util.wait(0.5);
		driver.findElement(By.id("transcripts")).click();
		util.wait(0.5);
		driver.findElement(By.id("magnumChronology")).click();
		util.wait(0.5);
		driver.findElement(By.id("magnumNotes")).click();
		util.wait(0.5);
		driver.findElement(By.id("search")).click();
		util.wait(0.5);
		driver.findElement(By.id("magnumAdmin")).click();
	}

	public void setUp() {
		initilize();
		loginAs(Constants.USERNAME);
		withPassword(Constants.PASSWORD);
		login();
		util.wait(2);
		findCase(Constants.WORKSPACE);
		selectWorkspace(Constants.WORKSPACE);
	}

	public void findCase(String workspace) {
		WebElement wrap = getDriver().findElement(By.id("wsfindcontainer"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys(workspace);	
	}

	public void selectWorkspace(String workspace) {
		WebElement wslist = getDriver().findElement(By.id("workspaceslist"));
		List <WebElement> lists = wslist.findElements(By.className("wsline"));
		for(WebElement list: lists){
			if(list.getAttribute("title").equalsIgnoreCase(workspace)){
				list.findElements(By.tagName("a")).get(0).click();
				break;
			}
		}	
	}

	public void tearDown() {
		logout();
		acceptAlert();
	}
	
	public void initilize() {
		util.open();
		getDriver().manage().window().maximize();
		util.wait(2);		
	}

	public void withPassword(String pwd) {
		getDriver().findElement(By.id("passwordField")).clear();
		getDriver().findElement(By.id("passwordField")).sendKeys(pwd);
	}

	public void loginAs(String uid) {
		getDriver().findElement(By.id("eid")).clear();
		getDriver().findElement(By.id("eid")).sendKeys(uid);
	}

	public void login() {
		getDriver().findElement(By.id("submit-login")).click();
	}
	
	public void logout() {
		getDriver().findElement(By.id("log-out")).click();
		util.wait(1);
	}
	public void acceptAlert() {
		getDriver().switchTo().alert().accept();
	}
		
}
