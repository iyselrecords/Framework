package com.opus2.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject{
	private static final String DOCUMENT_WRAP = "docsdiv";
    private static final String PROGRESS_BAR = "progress-bar-bar";
    private static final String LOADING_ICON = "loading-icon";
    private String mainHandle;
	
	public Page view() {
		return null;
	}

	public void waitForPageToLoad() {
		setWaitForTimeout(25000);
	}
	 
	public void waitForPageAction() {
		 setWaitForTimeout(10000);
	}
	 
	public WebElement getElement(String elem) {
		 withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(elem));
		 return this.getDriver().findElement(By.id(elem));
	}
	 
	public WebElement getDocument(String docTitle) {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(DOCUMENT_WRAP));
		WebElement document = null;
		List <WebElement> documents = Util.getDriver().findElement(By.id(DOCUMENT_WRAP))
			.findElements(By.className("doctitle"));
		for(WebElement element : documents){
			if(element.getText().equals(docTitle)){
				document = element;
				break;
			}
		}
		return document;
	}
	 
	public WebElement getElementByClass(String className) {
		 withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className(className));
		return this.getDriver().findElements(By.className(className)).get(0);
	}
	
	public void switchToCurrentWindow() {
      mainHandle = getDriver().getWindowHandle();
      for(String currentHandle : getDriver().getWindowHandles()){
          getDriver().switchTo().window(currentHandle);
      }
    }
  
    public void switchToMainWindow() {
        getDriver().switchTo().window(mainHandle);
    }
    
    public void OK() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id("OK"));
        getElement("OK").click();
    }
    
    public void cancel() {
        getElement("Cancel").click();
    }
    
    public void progressBar() {
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), 30);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(PROGRESS_BAR)));
        }catch(NotFoundException e){
            progressBar();
        }
        loadingIcon();
    }
    
    public void loadingIcon() {
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), 30);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(LOADING_ICON)));
        }catch(NotFoundException e){
            loadingIcon();
        }
        Util.pause(1);
    }
    
    public void reloadPage() {
        getDriver().navigate().refresh();
    }
    
    public void rightclick(WebElement element) {
        Util.pause(1);
        Actions action = new Actions(Util.getDriver());
        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).perform();
        Util.pause(1);
    }
    
    public void selectFile(String file) throws AWTException {
        Util.pause(1);
        
        StringSelection myFile = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile, null);
        
        Robot upload = new Robot();
        upload.keyPress(KeyEvent.VK_CONTROL);
        upload.keyPress(KeyEvent.VK_V);
        upload.keyRelease(KeyEvent.VK_V);
        upload.keyRelease(KeyEvent.VK_CONTROL);
        upload.keyPress(KeyEvent.VK_ENTER);
        upload.keyRelease(KeyEvent.VK_ENTER);
        Util.pause(2);
    }
}