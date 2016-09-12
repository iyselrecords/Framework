package com.opus2.magnum.adminuser.find;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.TestData;

public class FindUser extends Page {
	private static final String FIND_INPUT = "searchInputArea";
	public static final String USER_EMAIL = "newuser";
	private static final String USERS_LISTS = "mainitems";
	
	
	public WebElement findInput() {
		return this.getElementByClass(FIND_INPUT)
			.findElements(By.tagName("input")).get(0);
	}
	
	public WebElement userEmail() {
		return user();
	}

	public void findUser() {
		findInput().sendKeys(TestData.ADMIN_.getProperty(USER_EMAIL));
	}

	public WebElement filteredUser() {
		return user();
	}

	public void selectUser() {
		user().findElements(By.tagName("input"))
			.get(0).click();
	}
	
	public WebElement userChecked() {
		return user().findElements(By.tagName("input"))
		.get(0);
	}

	private WebElement user() {
		WebElement element = null;		
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(USERS_LISTS));		
		WebElement t = this.getElementByClass(USERS_LISTS)
			.findElements(By.className("users")).get(0);
		
		List <WebElement> rows = t.findElements(By.tagName("tr"));
		for(WebElement row : rows){			
			WebElement wks = row.findElements(By.className("auc2")).get(0);		
			if(wks.findElements(By.tagName("span")).get(0).getText().equals(USER_EMAIL)){
				element = row;
				break;
			}
		}
		return element;
	}

	public WebElement allCheckbox() {
		return checkAll();
	}

	private WebElement checkAll() {
		WebElement t = this.getElementByClass(USERS_LISTS)
			.findElements(By.className("tablehead")).get(0);
		return t.findElements(By.tagName("input")).get(0);
	}

	public void selectAll() {
		allCheckbox().click();
	}

	public WebElement checkedAll() {
		return allChecked();
	}

	private WebElement allChecked() {
		WebElement all = null;
		
		WebElement a = this.getElementByClass(USERS_LISTS)
			.findElements(By.className("users")).get(0);
		List <WebElement> rows = a.findElements(By.tagName("tbody")).get(0)
			.findElements(By.className("auc0"));
		
		for(WebElement row : rows){
			all = row.findElements(By.tagName("input")).get(0);
		}
		return all;
	}
}
