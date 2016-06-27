package com.opus2.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;









import org.openqa.selenium.interactions.Actions;

import com.opus2.util.Util;

public class UploadDialog extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	
	
	public void selectFiles() {
		WebElement upload = getDriver().findElement(By.id("upload-help"));
		upload.findElements(By.tagName("button")).get(0).click();	
	}


	public void selectFile(String file) throws AWTException {
		util.pause(1);
		
		StringSelection myFile = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile, null);
		
		Robot upload = new Robot();	
		upload.keyPress(KeyEvent.VK_CONTROL);
		upload.keyPress(KeyEvent.VK_V);
		upload.keyRelease(KeyEvent.VK_V);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);		
		
		util.pause(1);
	}

	public void clickUpload() {
		getDriver().findElement(By.id("uploader_uploader_Upload")).click();
	}

	public void selectDistination() {
		getDriver().findElement(By.id("upload destination")).click();
	}

	public void applyButton() {
		getDriver().findElement(By.id("doc-chooser_Apply")).click();
	}

	public void selectFolder(String name) {
		WebElement wrap = getDriver().findElement(By.id("doc-chooser_doc-chooser"));
		wrap.findElements(By.tagName("input")).get(0).sendKeys(name);
		
		List<WebElement> folders = wrap.findElements(By.tagName("span"));
		for(WebElement folder:folders){
			if(folder.getText().equalsIgnoreCase(name)){
				folder.click();
				break;
			}
		}
	}


	public void editFolderAndDocument(String folder, String action) {
		WebElement row = getDriver().findElements(By.className("clearboth")).get(0);
		List<WebElement> spans = row.findElements(By.tagName("span"));
		for(WebElement span :spans){
			if(span.getText().equalsIgnoreCase(folder)){
				Actions myAction = new Actions(getDriver());
				myAction.contextClick(span).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
				break;
			}
		}	
	}

}
