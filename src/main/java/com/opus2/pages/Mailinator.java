package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

import net.serenitybdd.core.pages.PageObject;

public class Mailinator extends PageObject {
	UserAction action;
	Util util;
	
	public void navigateTo(String url) {
		getDriver().navigate().to(url);
	}

	public void inbox(String inbox) {
		action.inputTextId("inboxfield", inbox);
		util.pause(0.5);
	}

	public void go() {
		action.element("button", "Go!").click();
		util.pause(1);
	}

	public void magnumNotification() {
		action.element("div", "Magnum Admin").click();
		util.pause(2);
	}

	public void register() {	
		WebDriver frame = switchTo("publicshowmaildivcontent");
		
		WebElement button = frame.findElements(By.className("btnMain")).get(0)
				.findElements(By.tagName("a")).get(0);		
		button.click();
		
		action.switchToCurrentWindow(1);
		util.pause(3);
	}
	
	public WebDriver switchTo(String id){
		return getDriver().switchTo().frame(id);
	}
}
