package com.opus2.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;

public final class Util{
    private static String WS_URL_TOKEN = "ws";
	public static WebDriver getDriver(){
	  return Serenity.getWebdriverManager().getCurrentDriver();
	}
	public static Alert getActiveNativeAlert(){
	  WebDriverWait wait = new WebDriverWait(getDriver(), 10);
      wait.until(ExpectedConditions.alertIsPresent());
      return getDriver().switchTo().alert();
	}
    public static String getWorkspaceUrlToken(String id) {
      return String.join("=",WS_URL_TOKEN,id);
    }
    
    public static void pause(int waitTime) {
      try {
          Thread.sleep(1000 * waitTime);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
    
    public static void pause(double waitTime) {
        try {
            Thread.sleep((long) (1000 * waitTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     }
    
    public static void click(String elementId){
    	getDriver().findElement(By.id(elementId))
    		.click();
    }
    
    public static WebElement header(String topLevelId){
		return getDriver().findElement(By.id(topLevelId))
				.findElements(By.tagName("h2")).get(0);
	}
        
	public static void loadingIcon(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-icon")));
	}
	
	public static WebElement optionOnMenuList(String optionName) {
		WebElement elem = null;
		WebElement menu = getDriver().findElement(By.id("rightClickMenu"));
		List <WebElement> options = menu.findElements(By.tagName("span"));
		for(WebElement option : options){
			if(option.getText().equals(optionName)){
				elem = option;
				break;
			}
		}
		return elem;
	}
	
	public static void explicitWait(String elementId) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
	}
	
	public static WebElement getElement(String elem) {
		pause(1);
		return getDriver().findElement(By.id(elem));
	}
}
