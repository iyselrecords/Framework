package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class DialogImpl extends ComponentImpl implements Dialog {

	public DialogImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public String hasDialog(String elementId) {
        return Util.getDriver().findElement(By.id(elementId))
            .getCssValue("display");
    }

	@Override
	public WebElement xButton(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
		.findElements(By.tagName("button")).get(0);
	}

	@Override
	public String notVisible(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
			.getCssValue("display");
	}

	@Override
	public WebElement folder(String folder) {
		return Util.getDriver().findElement(By.className(folder));
	}

	@Override
	public WebElement dialog(String dialogHeader){
  	    WebElement element = null;
        List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
        for(WebElement dialog :dialogs){
            List<WebElement> h2s = dialog.findElements(By.tagName("h2"));
            for(WebElement h2 : h2s){
                if(h2.getText().equals(dialogHeader.toUpperCase())){
                    element = dialog;
                    break;
                }
                else if(h2.getAttribute("innerHTML").equals(dialogHeader)){
                    element = dialog;
                    break;
                }
            }
        }   
        return element;
	}

	@Override
    public WebElement hasInput(String dialog) {
        return Util.getDriver().findElement(By.id(dialog))
            .findElements(By.tagName("input")).get(0);
    }
    
    @Override
    public WebElement hasTextArea(String dialog) {
        return Util.getDriver().findElement(By.id(dialog))
            .findElements(By.tagName("textarea")).get(0);
    }
    
    @Override
    public String getTitle(String dialogId) {
        return Util.getDriver().findElement(By.id(dialogId))
            .findElements(By.tagName("h2")).get(0).getText();
    }
}
