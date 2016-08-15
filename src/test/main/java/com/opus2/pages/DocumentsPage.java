package com.opus2.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.action.UserAction;

public class DocumentsPage extends Page {
  UserAction action;
  
  private String id;

  public void setWorkspaceId(String id){
    this.id = id;
  }
  @Override
  public Page view() {
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append(Configuration.documentsUrl);
    strBuilder.append("?");
    strBuilder.append(Util.getWorkspaceUrlToken(this.id));
    this.openAt(strBuilder.toString());
    return this;
  }

  
  
  public void uploadDialog(){
		action.clickAction("upload-toggle-button");
  }
  public void selectFiles(){
		action.clickAction("select files");
  }
  public void selectFile(String file) throws AWTException {
	  action.wait(1);
	  
	  StringSelection myFile = new StringSelection(file);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile, null);
		
	  Robot upload = new Robot();	
	  upload.keyPress(KeyEvent.VK_CONTROL);
	  upload.keyPress(KeyEvent.VK_V);
	  upload.keyRelease(KeyEvent.VK_V);
	  upload.keyRelease(KeyEvent.VK_CONTROL);
	  upload.keyPress(KeyEvent.VK_ENTER);
	  upload.keyRelease(KeyEvent.VK_ENTER);
	
	  action.wait(5);
  }
  public void upload(){
		action.clickAction("uploader_uploader_Upload");
		action.wait(5);
		close();
  }
  private void close() {
	  action.clickAction("uploader_Close");
  }
  
  public void gotoHome() {
	  action.clickAction("logo");
  }
  
  public boolean sectionIsVisible() {
	return true;
  }
  
  public boolean hasLoaded() {
	  return true;
  }
  public boolean docIsVisible(String document) {
	  return true;
  }

  
}
