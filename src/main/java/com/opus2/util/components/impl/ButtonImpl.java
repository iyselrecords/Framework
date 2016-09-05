package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Button;

public class ButtonImpl extends ComponentImpl implements Button {

  public ButtonImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
    super(driver, locator, implicitTimeoutInMilliseconds);
  }
  @Override
  public void click(){
    try {
      super.click();
    } catch (WebDriverException e) {
      super.click();
    }
  }
  
  @Override
  public WebElement hasButton(String elementId) {
  		return Util.getDriver().findElement(By.id(elementId));
  }
  
  @Override
  public WebElement withButton(String header, String buttonName) {
	  WebElement element = null;
		List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
		for(WebElement dialog : dialogs){
			if(dialog.findElement(By.tagName("h2")).getText().equals(header.toUpperCase())){
				List<WebElement> buttons = dialog.findElements(By.tagName("button"));
				for(WebElement button : buttons){
					if(button.getText().equals(buttonName)){
						element = button;
						break;
					}
				}
				break;
			}
		}	
		return element;
  }
}
