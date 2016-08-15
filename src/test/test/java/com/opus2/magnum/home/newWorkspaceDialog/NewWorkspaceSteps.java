package com.opus2.magnum.home.newWorkspaceDialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;
import com.opus2.util.dialog.Dialogs;

import net.thucydides.core.annotations.Step;

public class NewWorkspaceSteps {
  @Step
  public String assertDIP() {
      return "TDIP";
  }
  
  @Step
  public WebElement dialogBtn(String cancelBtn) {
	  Util.pause(1);
	  WebElement button = Util.getDriver().findElement(By.id(cancelBtn));
	  return button;
  }
  
  @Step
  public void closeDialog(String btn, String dialog) {
	  confirmDialog(dialog);
	  dialogBtn(btn).click();
  }
  
  public boolean confirmDialog(String dialog) {
	  return Util.header("new-ws").getText().equals(dialog.toUpperCase());	
  }

  @Step
  public WebElement getElement() {
	  return Util.getDriver().findElement(By.id("home-buttons_NewWorkspace"));
  }

  @Step
  public void newWorkspaceBtn() {
	  Util.click("home-buttons_NewWorkspace");
  }
  
  @Step
  public WebElement getDialog() {
	  return Dialogs.getDialog("new-ws");
  }
  
  @Step
  public WebElement dialogXBtn() {
	  return Dialogs.dialogXBtn("new-ws");
  }
  
  @Step
  public void closeDialogXBtn() {
	  dialogXBtn().click();
  }
  
  @Step
  public WebElement titleField() {
	  return Dialogs.getDialog("new-ws")
		.findElements(By.tagName("input")).get(0);
  }
  
  @Step
  public WebElement descField() {
	  return Dialogs.getDialog("new-ws")
		.findElements(By.tagName("textarea")).get(0);
  }

  @Step
  public void wksTitle(String title) {
	  titleField().clear();
	  titleField().sendKeys(title);
  }

  @Step
  public void wksDesc(String desc) {
	  descField().clear();
	  descField().sendKeys(desc);
  }

  @Step
  public void createWks(String CreateBtn){
	  Util.click(CreateBtn);
	  Util.pause(2);
  }

  public String wksCreated() {
	  WebElement header = Util.getDriver().findElement(By.id("settingsmain"))
	  	.findElements(By.tagName("h2")).get(0);
	  return header.getText();
  }

  public String getTitle() {
	  return Util.getDriver().getTitle();
  }
}
