package com.opus2.magnum.steps.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;

import com.opus2.pages.DocumentsPage;
import com.opus2.pages.Home;
import com.opus2.util.Page;
import com.opus2.util.User;
import com.opus2.util.Util;
import com.opus2.util.dialog.Dialog;

import net.thucydides.core.annotations.Step;

public class HomeSteps {
  Home homepage;
  DocumentsPage doc;
  Dialog dialog;
  
  @Step
  public void startANewWorkspace(){
	  homepage.startANewWorkspace();
  }

  @Step
  public WebElement getElement(String elementId) { 
	  return homepage.getElement(elementId);
  }
  
  @Step
  public boolean role() {
	  return true;
  }
  
  @Step
  public boolean dialogIsVisible(String header) {
	  return true;
  }

  
  @Step
  public void inputWorkspaceTitle(String workspace_Title, String title_Field) {
	  homepage.inputWorkspaceTitle(workspace_Title, title_Field);
  }

  @Step
  public void inputDescription(String description, String description_Field) {
      homepage.inputDescription(description, description_Field);
  }

  @Step
  public void createWorkspace() {
	  homepage.createWorkspace();
  }

  @Step
  public void closeDialogXBtn(String btn, String dialog) {
	  homepage.confirmDialog(dialog);
	  dialogXBtn().click();
  }
  
  @Step
  public void closeDialog(String btn, String dialog) {
	  homepage.confirmDialog(dialog);
	  dialogBtn(btn).click();
  }
  
  @Step
  public void docHasLoaded() {
	  doc.hasLoaded();
  }
  
  @Step
  public void docIsVisible(String document) {
	  doc.docIsVisible(document);
  }
  
  @Step
  public void navigateToHomepage() {
	  doc.gotoHome();
  }

  @Step
  public void documentSectionIsVisible(String header) {
	  dialog.dialogIsVisible(header, "recent-docs-container");
  }
  
  @Step
  public void documentTitle(String document_Title) {
	  homepage.docTitle(document_Title);
  }

  @Step
  public void previewDialog(String document_Title) {
	
  }

  @Step
  public void correctDocumentLoaded(String document) {
	
  }

  @Step
  public WebElement tabIsVisible(String documents_Tab) {
	  WebElement tab = Util.getDriver().findElement(By.id(documents_Tab));  
	  return tab;
  }
  
  @Step
  public void clickTab(String tab) {
	  Util.click(tab);
  }
  
  @Step
  public WebElement dialogXBtn() {
	  WebElement button = Util.getDriver().findElements(By.className("dialogClose")).get(0)
	      .findElements(By.tagName("button")).get(0);
	  return button;
  }

  @Step
  public WebElement dialogBtn(String cancelBtn) {
	  WebElement button = Util.getDriver().findElement(By.id(cancelBtn));
	  return button;
  }
  
  @Step
  public String getCasesSection() {
	  String header = Util.getDriver().findElements(By.className("panel-header")).get(0)
	  .findElement(By.tagName("h2")).getText();
	  return header;
  }
  
  @Step
  public WebElement getWorkspace(String workspace_Title) {
	  WebElement wk = null;
	  List <WebElement> lists = Util.getDriver().findElements(By.className("wsline"));
	  for(WebElement list : lists){
		  if(list.findElements(By.tagName("a")).get(0).getText().equals(workspace_Title)){
			  wk = list.findElements(By.tagName("a")).get(0);
			  break;
		  }
	  }
	  return wk;
  }
  
  @Step
  public void clickWorkspace(String workspace_Title) {
	  getWorkspace(workspace_Title).click();
  }
  
  @Step("shorcut image is visible")
  public WebElement thumbnail(String shortcut_Title) {
	  WebElement sc = null;
	  List <WebElement> lists = Util.getDriver().findElements(By.className("note-shortcut"));
	  for(WebElement list:lists){
		  if(list.findElements(By.tagName("p")).get(0).getText().equals(shortcut_Title)){
			  sc = list.findElements(By.tagName("img")).get(0);
			  break;
		  }
	  }
	  return sc;
  }
  
  @Step
  public void clickShortcut(String sc) {
	  thumbnail(sc)
	  	.click();
  }
}
