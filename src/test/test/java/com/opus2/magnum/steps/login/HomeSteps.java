package com.opus2.magnum.steps.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.pages.DocumentsPage;
import com.opus2.pages.Home;
import com.opus2.pages.navigation.Navigation;
import com.opus2.util.Util;
import com.opus2.util.dialog.Dialogs;

import net.thucydides.core.annotations.Step;

public class HomeSteps {
  Home home;
  DocumentsPage doc;
  Dialogs dialog;
  Navigation nav;
  
  @Step
  public void startANewWorkspace(){
	  home.startANewWorkspace();
  }

  @Step
  public WebElement getElement(String elementId) { 
	  return home.getElement(elementId);
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
	  home.inputWorkspaceTitle(workspace_Title, title_Field);
  }

  @Step
  public void inputDescription(String description, String description_Field) {
      home.inputDescription(description, description_Field);
  }

  @Step
  public void createWorkspace() {
	  home.createWorkspace();
  }
  
  @Step
  public void closeDialog(String btn, String dialog) {
	  home.confirmDialog(dialog);
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
	  home.docTitle(document_Title);
  }

  @Step
  public void previewDialog(String document_Title) {
	
  }

  @Step
  public void correctDocumentLoaded(String document) {
	
  }

  @Step
  public WebElement tabIsVisible(String elementId) {
	  return Util.getDriver().findElement(By.id(elementId));
  }
  
  @Step
  public void clickTab(String elementId) {
	  tabIsVisible(elementId).click();
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
  public void clickWorkspace() {
	  getWorkspace(Configuration.getSelectedUser().getCase().toUpperCase()).click();
  }
  
  @Step("click workspace")
  public void workspace() {
	  home.workspace();
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
  
  @Step("clicks documents tab")
  public void documentsTab() {
	  nav.documentsTab();
  }
  
  @Step("clicks transcripts tab")
  public void transcriptsTab() {
	  nav.transcriptsTab();
  }
  
  @Step("clicks chronology tab")
  public void chronologyTab() {
	  nav.chronologyTab();
  }
  
  @Step("clicks notes tab")
  public void notesTab() {
	  nav.notesTab();
  }
  
  @Step("clicks search tab")
  public void searchTab() {
	  nav.searchTab();
  }
  
  @Step("clicks admin tab")
  public void adminTab() {
	  nav.adminTab();
  }

}
