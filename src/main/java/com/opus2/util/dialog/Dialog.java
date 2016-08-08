package com.opus2.util.dialog;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

public class Dialog extends PageObject {

	public boolean dialogIsVisible(String header, String elementId){
	    String expected = header.toUpperCase();
	    WebElement dialog = Util.getDriver().findElement(By.id(elementId))
	        .findElements(By.tagName("h2")).get(0);
	    return expected.equals(dialog.getText());
	}
	
	public static WebElement getDialog(String elementId) {
		return Util.getDriver().findElement(By.id(elementId));
	}
	
	public static WebElement dialogXBtn(String elementId) {
		return getDialog(elementId)
			.findElements(By.tagName("button")).get(0);
	}
	
	public static boolean confirmDialog(String elementId, String header) {
		return getDialog(elementId).getText().equals(header.toUpperCase());	
	}
}
