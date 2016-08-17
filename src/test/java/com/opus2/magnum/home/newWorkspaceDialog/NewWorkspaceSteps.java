package com.opus2.magnum.home.newWorkspaceDialog;

import org.openqa.selenium.WebElement;

import com.opus2.enums.Role;
import com.opus2.pages.home.newworkspace.NewWorkspace;
import com.opus2.util.Util;

import net.thucydides.core.annotations.Step;

public class NewWorkspaceSteps {
  NewWorkspace nwks;
  
  @Step("user has admin capabilities")
  public Role userRole() {
	  return nwks.userRole();
  }
  
  @Step("new workspace button is visible")
  public WebElement newWorkspaceButton(){
	  return nwks.newWorkspaceButton();
  }
  
  @Step("clicks new workspace button")
  public void newWorkspaceBtn(){
	  nwks.newWorkspaceBtn();
  }
  
  @Step("dialog is visible")
  public String dialog() {
	 return nwks.dialog();
  }
  
  @Step("cancel button is visible")
  public WebElement cancelButton() {
	return nwks.cancelButton();
  }

  @Step("close dialog")
  public void closeDialog() {
	  nwks.closeDialog();
  }
  
  @Step("x button is visible")
  public WebElement xButton() {
	return nwks.xButton();
  }
 
  @Step("close dialog by x button")
  public void closeByXButton() {
	  nwks.closeByXButton();
  }
  
  @Step("dialog not visible")
  public String notVisible() {
	return nwks.notVisible();
  }
  
  
  @Step("title field is visible")
  public WebElement titleField() {
	  return nwks.titleField();
  }
  
  @Step("description field is visible")
  public WebElement descField() {
	  return nwks.descField();
  }
  
  @Step("create workspace button is visible")
  public WebElement createWorkspaceButton() {
	  return nwks.createWorkspaceButton();
  }
  
  @Step("input workspace title")
  public void inputWKSTitle() {
	  nwks.inputWKSTitle();
  }
  
  @Step("input workspace description")
  public void inputWKSDescription() {
	  nwks.inputWKSDescription();
  }
  
  @Step("create workspace")
  public void createWorkspace(){
	  nwks.createWorkspace();
  }
  
  @Step("new workspace created")
  public String wksCreated() {
      return nwks.wksCreated();
  }
  
  @Step()
  public String getTitle() {
	  return Util.getDriver().getTitle();
  }
    
  public boolean confirmDialog(String dialog) {
	  return Util.header("new-ws").getText().equals(dialog.toUpperCase());	
  }

  @Step("testing assertion using dummy data")
  public String assertDIP() {
      return "TDIP";
  }
}
