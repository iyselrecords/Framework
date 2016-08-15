package com.opus2.util.dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class Dialogs extends Page {
	private static final String ACCESS = "access";
	private Dialog dialog;
	
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

	public WebElement dialogPanel() {
		return dialog.hasDialog(ACCESS);
	}
}
